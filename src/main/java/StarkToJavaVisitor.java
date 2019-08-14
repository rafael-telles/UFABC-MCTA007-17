import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import stark.StarkBaseVisitor;
import stark.StarkParser;

import java.util.List;

public class StarkToJavaVisitor extends StarkBaseVisitor<String> {
    @Override
    public String visitProgram(StarkParser.ProgramContext ctx) {
        String program = this.visitChildren(ctx);
        return String.format("public class Program {public static void main(String[] __args) throws Exception {%s}}", program);
    }

    @Override
    public String visitIf_statement(StarkParser.If_statementContext ctx) {
        List<StarkParser.StatementContext> statements = ctx.statement();
        String expr = this.visit(ctx.paren_expr());

        if (statements.size() > 1) {
            String statement1 = this.visit(statements.get(0));
            String statement2 = this.visit(statements.get(1));
            return String.format("if (%s) %s else %s", expr, statement1, statement2);
        } else {
            String statement1 = this.visit(statements.get(0));
            return String.format("if (%s) %s", expr, statement1);
        }
    }

    @Override
    public String visitAssign_expr(StarkParser.Assign_exprContext ctx) {
        String id = this.visit(ctx.id());
        String value = this.visit(ctx.expr());
        return String.format("var %s = %s;", id, value);
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
        return node.getText();
    }
}
