import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import stark.StarkLexer;
import stark.StarkParser;
import stark.StarkVisitor;

import javax.swing.*;
import java.util.Arrays;

import  org.antlr.v4.gui.TreeViewer;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("/home/rafael/Desktop/UFABC/Compiladores/Projeto Final/src/main/resources/test.txt");
        StarkLexer lexer = new StarkLexer(input);
        StarkParser parser = new StarkParser(new CommonTokenStream(lexer));

        StarkVisitor<String> objectStarkVisitor = new StarkToJavaVisitor();

        StarkParser.ProgramContext tree = parser.program();
        String source = objectStarkVisitor.visit(tree);
        System.out.println(source);
        String formattedSource = new Formatter().formatSource(source);

        System.out.println(formattedSource);


//        //show AST in console
//        System.out.println(tree.toStringTree(parser));
//
//        //show AST in GUI
//        JFrame frame = new JFrame("Antlr AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()),tree);
//        viewr.setScale(1.5);//scale a little
//        panel.add(viewr);
//        frame.add(panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(200,200);
//        frame.setVisible(true);
    }
}
