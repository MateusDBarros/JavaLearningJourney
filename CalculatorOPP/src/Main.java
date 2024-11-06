import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        Calculator calc = new Calculator();

        System.out.printf("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.printf("Qual operação deseja realizar(+ - * /)? ");
        char operator = scanner.next().charAt(0);

        System.out.printf("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double result;

        calc.calculate(num1, num2, operator);

        scanner.close();

    }
}