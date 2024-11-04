import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n, min, max = 0 , contador = 0;


        do {
            System.out.printf("Qual o numero minimo? ");
            min = scanner.nextInt();
            if (min < 0) {
                System.out.println("Valor minimo não pode ser negativo!");
                continue;
            }
            System.out.printf("Qual o numero maximo? ");
            max = scanner.nextInt();

            if (max < min) {
                System.out.println("Valor maximo não pode ser menor que o minimo!");
                continue;
            }
        }while (min < 0 || max < min);

        int rand = random.nextInt((max - min) + 1) + min;

        do {
            System.out.printf("Adivinhe o  numero entre "+min+" a " +max+": ");
            n = scanner.nextInt();
            if (n == rand) {
                System.out.println("Voce acertou, o numero era: "+rand+" Parabens!");
                System.out.println(contador+" tentativas feitas.");
            } else if (n > rand) {
                System.out.println("Erroooou, Tente um numero mais baixo!");
                System.out.println(contador+" tentativas feitas.");
                contador++;
            }
            else {
                System.out.println("Errooooo, Tente um numero mais alto!");
                System.out.println(contador+" tentativas feitas.");
                contador++;
            }

        } while (n != rand);


    }
}
