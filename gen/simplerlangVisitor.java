// Generated from /home/rafael/Desktop/UFABC/Compiladores/Projeto Final/src/main/antlr4/Stark.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simplerlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simplerlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simplerlangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(simplerlangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplerlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simplerlangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplerlangParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(simplerlangParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplerlangParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(simplerlangParser.ShowContext ctx);
}