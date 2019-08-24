// Generated from /home/rafael/Desktop/UFABC/Compiladores/Projeto Final/src/main/antlr4/Stark.g4 by ANTLR 4.7.2
package stark;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StarkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StarkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StarkParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StarkParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StarkParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(StarkParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(StarkParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(StarkParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#paren_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_expr(StarkParser.Paren_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(StarkParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(StarkParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#write_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_expr(StarkParser.Write_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#read_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_expr(StarkParser.Read_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#read_string_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_string_expr(StarkParser.Read_string_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#read_number_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_number_expr(StarkParser.Read_number_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(StarkParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(StarkParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#prod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(StarkParser.ProdContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(StarkParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(StarkParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(StarkParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(StarkParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(StarkParser.Logical_opContext ctx);
}