import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double a, b, resultado = 0;

        System.out.printf("Digite o primeiro numero: ");
        a = scanner.nextDouble();
        System.out.printf("Qual operação deseja realizar(+ - * /)? ");
        char op = scanner.next().charAt(0);
        System.out.printf("Digite o segundo numero: ");
        b = scanner.nextDouble();

        switch (op) {
            case '+':
                resultado = a + b;
                System.out.println("Soma = " +resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Subtração = " +resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Multiplicação = " +resultado);
                break;
            case '/':
                if (a == 0 || b == 0)
                    System.out.println("Impossivel dividir por zero!");
                else {
                    resultado = a / b;

                    System.out.println("Divisão = " + df.format(resultado));
                }
                break;
            default:
                System.out.println("Operador invalido!");
                break;
        }
    }
}