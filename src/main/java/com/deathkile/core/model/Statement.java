package com.deathkile.core.model;

import com.deathkile.gen.DeathLikeGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import javax.annotation.Nullable;

public enum Statement {

    ASSIGN(DeathLikeGrammarParser.Assign_varContext.class, (ctx, visitor) -> {
        return ctx.assign_var().accept(visitor);
    }),
    PRINT(DeathLikeGrammarParser.PrintContext.class, (ctx, visitor) -> {
        return ctx.print().accept(visitor);
    }),
    OPERATIONS(DeathLikeGrammarParser.OperationsContext.class, (ctx, visitor) -> {
        return ctx.operations().accept(visitor);
    }),
    WHILE_CICLE(DeathLikeGrammarParser.While_cicleContext.class, (ctx, visitor) -> {
        return ctx.while_cicle().accept(visitor);
    }),
    IF_THEN(DeathLikeGrammarParser.If_elseContext.class, (ctx, visitor) -> {
        return ctx.if_else().accept(visitor);
    }),
    METHOD_INVOCATION(DeathLikeGrammarParser.Method_invokationContext.class, (ctx, visitor) -> {
        return ctx.method_invokation().accept(visitor);
    }),
    METHOD_INVOCATION_AND_ASSIGN(DeathLikeGrammarParser.Assign_var_method_invocationContext.class, (ctx, visitor) -> {
        return ctx.assign_var_method_invocation().accept(visitor);
    }),
    FOR_CICLE(DeathLikeGrammarParser.For_cicleContext.class, (ctx, visitor) -> {
        return ctx.for_cicle().accept(visitor);
    });

    private final Class clazz;
    private final InvocationAction<String> action;

    Statement(Class clazz, InvocationAction<String> action) {
        this.clazz = clazz;
        this.action = action;
    }

    @Nullable
    public static Statement findStatement(ParserRuleContext ctx) {
        for (Statement statement : Statement.values()) {
            if (ctx.getRuleContext(statement.clazz, 0) != null) {
                return statement;
            }
        }
        return null;
    }

    public String invoke(DeathLikeGrammarParser.StatementContext ctx, ParseTreeVisitor<String> visitor) {
        return action.invoke(ctx, visitor);
    }

    private interface InvocationAction<T> {

        T invoke(DeathLikeGrammarParser.StatementContext ctx, ParseTreeVisitor<T> visitor);

    }

}
