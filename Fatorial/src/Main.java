import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Entre o numero que deseja fatorar: ");
        int n = scanner.nextInt();

        System.out.println(fatorial(n));
    }

    private static int fatorial(int n) {
        if (n == 1)
            return 1;

        int resultado = 1;
        for (int i = 1; i <= n; i++ ) {
            resultado *= i;
        }
        return resultado;
    }
}