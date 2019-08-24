import java.util.Scanner;

public class Program {
    public static void main(String[] __args) throws Exception {
        Scanner _scanner = new Scanner(System.in);
        var op_valida = 0d;
        do {
            System.out.println("Escreva o numero A:");
            var a = _scanner.nextDouble();
            System.out.println("Escreva o numero B:");
            var b = _scanner.nextDouble();
            System.out.println("Escreva o número da operação que deseja fazer:");
            System.out.println("[1] +   [2] -   [3] *   [4] /");
            var op = _scanner.nextDouble();
            var resultado = 0d;
            op_valida = 1d;
            if (op == 1d) resultado = a + b;
            else if (op == 2d) resultado = a - b;
            else if (op == 3d) resultado = a * b;
            else if (op == 4d) resultado = a / b;
            else op_valida = 0d;
            if (op_valida == 1d) {
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Operação invalida! Tente novamente");
            }
        } while (op_valida == 0d);
    }
}
