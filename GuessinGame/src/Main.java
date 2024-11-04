import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rand = random.nextInt(51);
        int n;
        do {
            System.out.printf("Adivinhe o  numero entre 0 a 50: ");
            n = scanner.nextInt();
            if (n == rand) {
                System.out.println("Voce acertou, o numero era: "+rand+" Parabens!");
            } else if (n > rand) {
                System.out.println("Erroooou, Tente um numero mais baixo!");
            }
            else
                System.out.println("Errooooo, Tente um numero mais alto!");


        } while (n != rand);


    }
}