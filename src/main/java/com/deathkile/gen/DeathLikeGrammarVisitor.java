package com.deathkile.gen;// Generated from C:/Users/a4tec/IdeaProjects/DeathLikeCompiler\DeathLikeGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DeathLikeGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DeathLikeGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DeathLikeGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DeathLikeGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DeathLikeGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#digit_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_expression(DeathLikeGrammarParser.Digit_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(DeathLikeGrammarParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DeathLikeGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#type_cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_cast(DeathLikeGrammarParser.Type_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(DeathLikeGrammarParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var_method_invocation(DeathLikeGrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(DeathLikeGrammarParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#reasign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReasign_var(DeathLikeGrammarParser.Reasign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DeathLikeGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#while_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cicle(DeathLikeGrammarParser.While_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(DeathLikeGrammarParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#for_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cicle(DeathLikeGrammarParser.For_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(DeathLikeGrammarParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_return(DeathLikeGrammarParser.Subprogram_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_non_return(DeathLikeGrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(DeathLikeGrammarParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(DeathLikeGrammarParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_method_invokation(DeathLikeGrammarParser.Signature_method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invokation(DeathLikeGrammarParser.Method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeathLikeGrammarParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(DeathLikeGrammarParser.Global_programContext ctx);
}