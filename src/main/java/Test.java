import com.google.googlejavaformat.java.Formatter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import stark.StarkLexer;
import stark.StarkParser;
import stark.StarkVisitor;

public class Test {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("/home/rafael/Desktop/UFABC/Compiladores/Projeto Final/src/main/resources/test.txt");
            StarkLexer lexer = new StarkLexer(input);
            StarkParser parser = new StarkParser(new CommonTokenStream(lexer));

            StarkVisitor<String> objectStarkVisitor = new StarkToJavaVisitor();

            String source = objectStarkVisitor.visit(parser.program());
            String formattedSource = new Formatter().formatSource(source);

            System.out.println(formattedSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
