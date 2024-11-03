import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        int termo1 = 0;
        int termo2 = 1;
        int fib = termo1 + termo2;
        int n; // Variavel para definir quantos numeros mostrar
        do {
            System.out.printf("Quantos numeros da sequencia desseja ver? ");
            n = scanner.nextInt();
            if (n <= 2)
                System.out.println("Insira um valor maior que 2");
        } while (n <= 2);



        System.out.print(termo1 + " ");
        System.out.print(termo2 + " ");

        for (int i = 0; i < n - 2; i++) {
            System.out.print(fib + " ");

            termo1 = termo2;
            termo2 = fib;
            fib = termo1 + termo2;

        }
        scanner.close();
    }
}
