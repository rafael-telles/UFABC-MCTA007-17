// Generated from /home/rafael/Desktop/UFABC/Compiladores/Projeto Final/src/main/antlr4/Stark.g4 by ANTLR 4.7.2
package stark;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StarkParser}.
 */
public interface StarkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StarkParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StarkParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StarkParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StarkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StarkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(StarkParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(StarkParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(StarkParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(StarkParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(StarkParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(StarkParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void enterParen_expr(StarkParser.Paren_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void exitParen_expr(StarkParser.Paren_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(StarkParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(StarkParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(StarkParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(StarkParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void enterWrite_expr(StarkParser.Write_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void exitWrite_expr(StarkParser.Write_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#read_expr}.
	 * @param ctx the parse tree
	 */
	void enterRead_expr(StarkParser.Read_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#read_expr}.
	 * @param ctx the parse tree
	 */
	void exitRead_expr(StarkParser.Read_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(StarkParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(StarkParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(StarkParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(StarkParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#prod}.
	 * @param ctx the parse tree
	 */
	void enterProd(StarkParser.ProdContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#prod}.
	 * @param ctx the parse tree
	 */
	void exitProd(StarkParser.ProdContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(StarkParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(StarkParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(StarkParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(StarkParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(StarkParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(StarkParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(StarkParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(StarkParser.Logical_opContext ctx);
}