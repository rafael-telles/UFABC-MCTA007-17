// Generated from /home/rafael/Desktop/UFABC/Compiladores/Projeto Final/src/main/antlr4/Stark.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link StarkParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(StarkParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(StarkParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link StarkParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(StarkParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link StarkParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(StarkParser.ShowContext ctx);
}