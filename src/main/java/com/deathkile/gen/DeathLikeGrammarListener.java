package com.deathkile.gen;// Generated from C:/Users/a4tec/IdeaProjects/DeathLikeCompiler\DeathLikeGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeathLikeGrammarParser}.
 */
public interface DeathLikeGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DeathLikeGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DeathLikeGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DeathLikeGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DeathLikeGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DeathLikeGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DeathLikeGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void enterDigit_expression(DeathLikeGrammarParser.Digit_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void exitDigit_expression(DeathLikeGrammarParser.Digit_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(DeathLikeGrammarParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(DeathLikeGrammarParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DeathLikeGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DeathLikeGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#type_cast}.
	 * @param ctx the parse tree
	 */
	void enterType_cast(DeathLikeGrammarParser.Type_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#type_cast}.
	 * @param ctx the parse tree
	 */
	void exitType_cast(DeathLikeGrammarParser.Type_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(DeathLikeGrammarParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(DeathLikeGrammarParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var_method_invocation(DeathLikeGrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var_method_invocation(DeathLikeGrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(DeathLikeGrammarParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(DeathLikeGrammarParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#reasign_var}.
	 * @param ctx the parse tree
	 */
	void enterReasign_var(DeathLikeGrammarParser.Reasign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#reasign_var}.
	 * @param ctx the parse tree
	 */
	void exitReasign_var(DeathLikeGrammarParser.Reasign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DeathLikeGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DeathLikeGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cicle(DeathLikeGrammarParser.While_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cicle(DeathLikeGrammarParser.While_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(DeathLikeGrammarParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(DeathLikeGrammarParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#for_cicle}.
	 * @param ctx the parse tree
	 */
	void enterFor_cicle(DeathLikeGrammarParser.For_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#for_cicle}.
	 * @param ctx the parse tree
	 */
	void exitFor_cicle(DeathLikeGrammarParser.For_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(DeathLikeGrammarParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(DeathLikeGrammarParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_return(DeathLikeGrammarParser.Subprogram_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_return(DeathLikeGrammarParser.Subprogram_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_non_return(DeathLikeGrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_non_return(DeathLikeGrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(DeathLikeGrammarParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(DeathLikeGrammarParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(DeathLikeGrammarParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(DeathLikeGrammarParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterSignature_method_invokation(DeathLikeGrammarParser.Signature_method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitSignature_method_invokation(DeathLikeGrammarParser.Signature_method_invokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invokation(DeathLikeGrammarParser.Method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invokation(DeathLikeGrammarParser.Method_invokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeathLikeGrammarParser#global_program}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_program(DeathLikeGrammarParser.Global_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeathLikeGrammarParser#global_program}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_program(DeathLikeGrammarParser.Global_programContext ctx);
}