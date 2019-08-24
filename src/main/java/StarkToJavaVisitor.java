import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import stark.StarkBaseVisitor;
import stark.StarkParser;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class StarkToJavaVisitor extends StarkBaseVisitor<String> {
    private Collection<String> variables = new HashSet<>();

    @Override
    public String visitProgram(StarkParser.ProgramContext ctx) {
        String program = this.visitChildren(ctx);
        return String.format("import java.util.Scanner;public class Program {public static void main(String[] __args) throws Exception {Scanner _scanner = new Scanner(System.in);%s}}", program);
    }

    @Override
    public String visitIf_statement(StarkParser.If_statementContext ctx) {
        List<StarkParser.StatementContext> statements = ctx.statement();
        String expr = this.visit(ctx.paren_expr());

        if (statements.size() > 1) {
            String statement1 = this.visit(statements.get(0));
            String statement2 = this.visit(statements.get(1));
            return String.format("if %s %s else %s", expr, statement1, statement2);
        } else {
            String statement1 = this.visit(statements.get(0));
            return String.format("if %s %s", expr, statement1);
        }
    }

    @Override
    public String visitWhile_statement(StarkParser.While_statementContext ctx) {
        String expr = this.visit(ctx.paren_expr());
        String statement = this.visit(ctx.statement());

        return String.format("while %s %s", expr, statement);
    }

    @Override
    public String visitDo_while_statement(StarkParser.Do_while_statementContext ctx) {
        String expr = this.visit(ctx.paren_expr());
        String statement = this.visit(ctx.statement());

        return String.format("do %s while %s;", statement, expr);
    }

    @Override
    public String visitAssign_expr(StarkParser.Assign_exprContext ctx) {
        String id = this.visit(ctx.id());
        String value = this.visit(ctx.expr());

        if (this.variables.add(id)) {
            return String.format("var %s = %s;", id, value);
        } else {
            return String.format("%s = %s;", id, value);
        }
    }

    @Override
    public String visitWrite_expr(StarkParser.Write_exprContext ctx) {
        String arg = this.visit(ctx.paren_expr().expr());
        return String.format("System.out.println(%s);", arg);
    }

    @Override
    public String visitChildren(RuleNode node) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < node.getChildCount(); i++) {
            out.append(this.visit(node.getChild(i)));
        }
        return out.toString();
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (";".equals(text)) {
            return "";
        }
        return text;
    }

    @Override
    public String visitRead_number_expr(StarkParser.Read_number_exprContext ctx) {
        return "_scanner.nextDouble()";
    }

    @Override
    public String visitRead_string_expr(StarkParser.Read_string_exprContext ctx) {
        return "_scanner.next()";
    }

    @Override
    public String visitNumber(StarkParser.NumberContext ctx) {
        String text = ctx.getText();
        return String.format("%sd", text);
    }

    @Override
    public String visitString(StarkParser.StringContext ctx) {
        String string = ctx.getText();
        return string;
    }
}
