package com.deathkile.core.impl;

import com.deathkile.core.MethodVariablesRegister;
import com.deathkile.core.exceptions.ConstModifyException;
import com.deathkile.core.exceptions.NoSuchTypeException;
import com.deathkile.core.exceptions.NoSuchVariableException;
import com.deathkile.core.exceptions.TypeCastException;
import com.deathkile.core.exceptions.VariableAlreadyRegistered;
import com.deathkile.core.model.CompilerFields;
import com.deathkile.core.model.Method;
import com.deathkile.core.model.MethodType;
import com.deathkile.core.model.Statement;
import com.deathkile.core.model.Variable;
import com.deathkile.core.model.VariableType;
import com.deathkile.gen.DeathLikeGrammarParser;
import com.deathkile.gen.DeathLikeGrammarVisitor;
import com.google.common.base.Preconditions;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeathLikeGrammarVisitorImpl implements DeathLikeGrammarVisitor<String> {

    private final MethodVariablesRegister register = new MethodVariablesRegisterImpl();
    private final TypeCastMechanism typeCast = new TypeCastMechanism(register);
    private final DeathLikeGrammarParserImpl deathLikeGrammarParser;
    private final String finalName;

    public DeathLikeGrammarVisitorImpl(DeathLikeGrammarParserImpl deathLikeGrammarParser, String finalName) {
        this.deathLikeGrammarParser = deathLikeGrammarParser;
        this.finalName = finalName;
    }

    @Override
    public String visitProgram(DeathLikeGrammarParser.ProgramContext ctx) {
        register.registerMethodInvocation();
        String out = CompilerFields.MAIN_METHOD + ctx.block().accept(this);
        register.registerMethodInvocationEnded();
        return out;
    }

    @Override
    public String visitBlock(DeathLikeGrammarParser.BlockContext ctx) {
        register.registerNew​​VisibilityArea();
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    private StringBuilder invokeAllStatementsForBlock(List<DeathLikeGrammarParser.StatementContext> list) {
        StringBuilder out = new StringBuilder();
        for (DeathLikeGrammarParser.StatementContext aList : list) {
            out.append(aList.accept(this));
        }
        return out;
    }

    @Override
    public String visitStatement(DeathLikeGrammarParser.StatementContext ctx) {
        Statement statement = Statement.findStatement(ctx);
        return Preconditions.checkNotNull(statement, "No such statement, statement " + ctx).invoke(ctx, this);
    }

    @Override
    public String visitDigit_expression(DeathLikeGrammarParser.Digit_expressionContext ctx) {
        validateDigitExpression(ctx);
        return concatExpr(ctx);
    }

    @Override
    public String visitBoolean_expression(DeathLikeGrammarParser.Boolean_expressionContext ctx) {
        for (DeathLikeGrammarParser.Digit_expressionContext context : ctx.digit_expression()) {
            validateDigitExpression(context);
        }
        return concatExpr(ctx);
    }

    private void validateDigitExpression(DeathLikeGrammarParser.Digit_expressionContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = register.getVariable(ctx.ID().toString());
            Preconditions.checkNotNull(variable, new NoSuchVariableException(ctx.ID().getText()));
        }
        List<DeathLikeGrammarParser.Digit_expressionContext> expr = ctx.digit_expression();
        for (int i = 0; i < expr.size(); i++) {
            validateDigitExpression(expr.get(i));
        }
    }

    private String concatExpr(ParserRuleContext ctx) {
        StringBuilder out = new StringBuilder();
        List<Token> tokens = deathLikeGrammarParser.getTokens(ctx.start, ctx.stop);
        for (int i = 0; i < tokens.size(); i++) {
            out.append(tokens.get(i).getText());
        }
        return out.toString();
    }

    @Override
    public String visitType(DeathLikeGrammarParser.TypeContext ctx) {
        VariableType variableType = VariableType.findByDisplayName(ctx.getText());
        Preconditions.checkNotNull(variableType, new NoSuchTypeException(ctx.getText()));
        return variableType.getOutName();
    }

    @Override
    public String visitType_cast(DeathLikeGrammarParser.Type_castContext ctx) {
        VariableType variableType = VariableType.findByDisplayName(ctx.type().getText());
        Preconditions.checkNotNull(variableType, new NoSuchTypeException(ctx.type().getText()));
        return variableType.getCastLine();
    }

    @Override
    public String visitAssign_var(DeathLikeGrammarParser.Assign_varContext ctx) {
        return assignVar(ctx, false);
    }

    private String assignVar(DeathLikeGrammarParser.Assign_varContext ctx, boolean global) {
        VariableType variableType = Preconditions.checkNotNull(VariableType.findByDisplayName(ctx.type().getText()), new NoSuchTypeException(ctx.type().getText()));
        StringBuilder out = new StringBuilder(ctx.type().accept(this) + " " + ctx.ID().get(0).getText() + CompilerFields.ASSIGN);
        if (ctx.type_cast() != null) {
            out.append(ctx.type_cast().accept(this)).append(CompilerFields.OPEN_BRACKET);
        } else {
            typeCast.checkTypeCast(variableType, ctx.digit_expression());
            out.append(CompilerFields.OPEN_BRACKET);
        }
        if (ctx.CONST() != null) {
            if (global) {
                out = new StringBuilder().append(CompilerFields.GLOBAL_CONST_VAR).append(out.toString());
            } else {
                out = new StringBuilder().append(CompilerFields.CONST_VAR).append(out.toString());
            }
        } else {
            if (global) {
                out = new StringBuilder().append(CompilerFields.GLOBAL_VAR).append(out.toString());
            }
        }
        out.append(variableType.getCastedValue(ctx.digit_expression().accept(this))).append(CompilerFields.CLOSE_BRACKET).append(CompilerFields.SEPARATOR);
        if (!global) {
            Preconditions.checkState(register.registerVariable(new Variable(ctx.ID().get(0).getText(), variableType, ctx.CONST() != null)), new VariableAlreadyRegistered(ctx.ID().get(0).getText()));
        } else {
            Preconditions.checkState(register.registerGlobalVariable(new Variable(ctx.ID().get(0).getText(), variableType, ctx.CONST() != null)), new VariableAlreadyRegistered(ctx.ID().get(0).getText()));
        }
        return out.toString();
    }

    @Override
    public String visitAssign_var_method_invocation(DeathLikeGrammarParser.Assign_var_method_invocationContext ctx) {
        Variable variable = new Variable(ctx.ID().getText(), Preconditions.checkNotNull(VariableType.findByDisplayName(ctx.type().getText())), ctx.CONST() != null);
        Preconditions.checkState(register.registerVariable(variable), new VariableAlreadyRegistered(ctx.ID().getText()));
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.method_invokation().ID().getText()), new NoSuchMethodException(ctx.method_invokation().ID().getText()));
        if (method.getMethodType() == MethodType.RETURN_OPTIONAL || method.getMethodType().getReturnedType() != variable.getVariableType()) {
            throw new TypeCastException(variable.getVariableType(), method.getMethodType());
        }
        StringBuilder out = new StringBuilder(ctx.type().accept(this) + " " + variable.getID() + CompilerFields.ASSIGN);
        if (ctx.type_cast() != null) {
            out.append(ctx.type_cast().accept(this)).append(CompilerFields.OPEN_BRACKET);
        } else {
            typeCast.checkTypeCast(variable.getVariableType(), method.getMethodType());
            out.append(CompilerFields.OPEN_BRACKET);
        }
        return out.append(ctx.method_invokation().accept(this)).append(CompilerFields.CLOSE_BRACKET).append(CompilerFields.SEPARATOR).toString();
    }

    @Override
    public String visitOperations(DeathLikeGrammarParser.OperationsContext ctx) {
        return ctx.reasign_var().accept(this) + CompilerFields.SEPARATOR;
    }

    @Override
    public String visitReasign_var(DeathLikeGrammarParser.Reasign_varContext ctx) {
        StringBuilder out = new StringBuilder();
        Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID().toString()), new NoSuchVariableException(ctx.ID().getText()));
        if (variable.isConstant()) {
            throw new ConstModifyException(ctx.ID().getText());
        }
        out.append(variable.getID()).append(CompilerFields.ASSIGN);
        if (ctx.type_cast() != null) {
            out.append(ctx.type_cast().accept(this)).append(CompilerFields.OPEN_BRACKET);
        } else {
            typeCast.checkTypeCast(variable.getVariableType(), ctx.digit_expression());
            out.append(CompilerFields.OPEN_BRACKET);
        }
        out.append(ctx.digit_expression().accept(this)).append(CompilerFields.CLOSE_BRACKET);
        return out.toString();
    }

    @Override
    public String visitPrint(DeathLikeGrammarParser.PrintContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID().getText()), new NoSuchVariableException(ctx.ID().getText()));
            return String.format(CompilerFields.SOUT, variable.getID()) + CompilerFields.SEPARATOR;
        } else {
            return String.format(CompilerFields.SOUT, ctx.STRING() == null ? ctx.NUMBER() : ctx.STRING()) + CompilerFields.SEPARATOR;
        }
    }

    @Override
    public String visitWhile_cicle(DeathLikeGrammarParser.While_cicleContext ctx) {
        String out = String.format(CompilerFields.WHILE, ctx.boolean_expression().accept(this));
        out += ctx.block().accept(this);
        return out;
    }

    @Override
    public String visitIf_else(DeathLikeGrammarParser.If_elseContext ctx) {
        return String.format(CompilerFields.IF_ELSE, ctx.boolean_expression().accept(this), ctx.block(0).accept(this), ctx.block(1).accept(this));
    }

    @Override
    public String visitFor_cicle(DeathLikeGrammarParser.For_cicleContext ctx) {
        StringBuilder out = new StringBuilder();
        register.registerNew​​VisibilityArea();
        out.append(String.format(CompilerFields.FOR_CICLE, ctx.assign_var().accept(this), ctx.boolean_expression().accept(this), ctx.reasign_var().accept(this)));
        out.append(ctx.block().accept(this));
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitSignature(DeathLikeGrammarParser.SignatureContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append(CompilerFields.OPEN_BRACKET);
        for (int i = 0; i < ctx.ID().size(); i++) {
            VariableType variableType = VariableType.findByDisplayName(ctx.type(i).getText());
            Preconditions.checkNotNull(variableType, new NoSuchTypeException(ctx.type(i).getText()));
            Preconditions.checkState(register.registerVariable(new Variable(ctx.ID(i).getText(), variableType)), new NoSuchVariableException(ctx.ID(i).getText()));
            builder.append(ctx.type(i).accept(this)).append(" ").append(ctx.ID(i));
            if (i != ctx.ID().size() - 1) {
                builder.append(CompilerFields.COMMA);
            }
        }
        builder.append(CompilerFields.CLOSE_BRACKET);
        return builder.toString();
    }

    @Override
    public String visitSubprogram_return(DeathLikeGrammarParser.Subprogram_returnContext ctx) {
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.ID().toString()), new NoSuchMethodException(ctx.ID().getText()));
        if (method.getMethodType() == MethodType.RETURN_OPTIONAL) {
            throw new TypeCastException(method.getMethodType());
        }
        register.registerMethodInvocation();
        //NPE checked before.
        String s = CompilerFields.SUB_METHOD + method.getMethodType().getReturnedType().getOutName()
                + " " + ctx.ID() + handleSignature(ctx.signature()) + ctx.block_return().accept(this);
        register.registerMethodInvocationEnded();
        return s;
    }

    @Override
    public String visitSubprogram_non_return(DeathLikeGrammarParser.Subprogram_non_returnContext ctx) {
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.ID().toString()), new NoSuchMethodException(ctx.ID().getText()));
        if (method.getMethodType() != MethodType.RETURN_OPTIONAL) {
            throw new TypeCastException(method.getMethodType());
        }
        register.registerMethodInvocation();
        String s = CompilerFields.SUB_METHOD + CompilerFields.VOID + " " + ctx.ID() + handleSignature(ctx.signature());
        s += ctx.block_non_return() == null ? ctx.block().accept(this) : ctx.block_non_return().accept(this);
        register.registerMethodInvocationEnded();
        return s;
    }

    private String handleSignature(DeathLikeGrammarParser.SignatureContext ctx) {
        return ctx == null ? CompilerFields.OPEN_BRACKET + CompilerFields.CLOSE_BRACKET : ctx.accept(this);
    }

    @Override
    public String visitBlock_return(DeathLikeGrammarParser.Block_returnContext ctx) {
        register.registerNew​​VisibilityArea();
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(((DeathLikeGrammarParser.Subprogram_returnContext) ctx.parent).ID().getText()), new NoSuchMethodException(""));
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.RETURN);
        Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID().getText()), new NoSuchVariableException(ctx.ID().getText()));
        if (variable.getVariableType() != method.getMethodType().getReturnedType()) {
            throw new TypeCastException(variable.getVariableType(), method.getMethodType());
        }
        out.append(" ").append(variable.getID()).append(CompilerFields.SEPARATOR).append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitBlock_non_return(DeathLikeGrammarParser.Block_non_returnContext ctx) {
        register.registerNew​​VisibilityArea();
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.RETURN);
        out.append(CompilerFields.SEPARATOR);
        out.append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitSignature_method_invokation(DeathLikeGrammarParser.Signature_method_invokationContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append(CompilerFields.OPEN_BRACKET);
        Method method = register.getRegisteredMethod(((DeathLikeGrammarParser.Method_invokationContext) ctx.parent).ID().getText());
        Preconditions.checkNotNull(method, new NoSuchMethodException(""));
        if (method.getArguments().size() != ctx.ID().size()) {
            throw new UnsupportedOperationException();
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID(i).getText()), new NoSuchMethodException(ctx.ID(i).getText()));
            if (method.getArguments().get(i) != variable.getVariableType()) {
                throw new TypeCastException(method.getArguments().get(i).getDisplayName(), variable.getVariableType().getDisplayName());
            }
            builder.append(variable.getID());
        }
        return builder.append(CompilerFields.CLOSE_BRACKET).toString();
    }

    @Override
    public String visitMethod_invokation(DeathLikeGrammarParser.Method_invokationContext ctx) {
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.ID().toString()), new NoSuchMethodException(ctx.ID().getText()));
        return method.getID() + " " + handleSignatureOfInvocation(ctx);
    }

    private String handleSignatureOfInvocation(DeathLikeGrammarParser.Method_invokationContext ctx) {
        if (ctx.signature_method_invokation() == null) {
            Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.ID().getText()), new NoSuchMethodException(ctx.ID().getText()));
            if (method.getArguments().size() != 0) {
                throw new UnsupportedOperationException("Can't invoke method.");
            }
            return CompilerFields.OPEN_BRACKET + CompilerFields.CLOSE_BRACKET;
        }
        return ctx.signature_method_invokation().accept(this);
    }

    @Override
    public String visitGlobal_program(DeathLikeGrammarParser.Global_programContext ctx) {
        StringBuilder out = new StringBuilder();
        register.registerMethod(new Method(CompilerFields.MAIN_PROGRAM, MethodType.RETURN_OPTIONAL, Collections.emptyList()));
        List<DeathLikeGrammarParser.Subprogram_non_returnContext> non_returnContexts = ctx.subprogram_non_return();
        List<DeathLikeGrammarParser.Subprogram_returnContext> returnContexts = ctx.subprogram_return();
        for (DeathLikeGrammarParser.Assign_varContext ct : ctx.assign_var()) {
            out.append(assignVar(ct, true));
        }
        for (DeathLikeGrammarParser.Subprogram_returnContext ct : returnContexts) {
            VariableType variableType = Preconditions.checkNotNull(VariableType.findByDisplayName(ct.type().getText()));
            register.registerMethod(new Method(ct.ID().toString(), Preconditions.checkNotNull(MethodType.findByReturnedType(variableType)), collectMethodArguments(ct.signature())));
            out.append(ct.accept(this));
        }
        for (DeathLikeGrammarParser.Subprogram_non_returnContext ct : non_returnContexts) {
            register.registerMethod(new Method(ct.ID().toString(), MethodType.RETURN_OPTIONAL, collectMethodArguments(ct.signature())));
            out.append(ct.accept(this));
        }
        out.append(ctx.program().accept(this));
        return out.toString();
    }

    private List<VariableType> collectMethodArguments(DeathLikeGrammarParser.SignatureContext ctx) {
        List<VariableType> variableTypes = new ArrayList<>();
        if (ctx == null) {
            return Collections.emptyList();
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            VariableType variableType = VariableType.findByDisplayName(ctx.type(i).getText());
            variableTypes.add(Preconditions.checkNotNull(variableType, new NoSuchTypeException(ctx.type(i).getText())));
        }
        return variableTypes;
    }

    @Override
    public String visit(ParseTree parseTree) {
        return String.format(CompilerFields.STATIC_CONTENT, finalName, parseTree.accept(this));
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }

}
