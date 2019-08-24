// Generated from /home/rafael/Desktop/UFABC/Compiladores/Projeto Final/src/main/antlr4/Stark.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link StarkParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(StarkParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link StarkParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(StarkParser.ShowContext ctx);
}