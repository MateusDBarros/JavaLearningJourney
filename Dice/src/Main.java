import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         Dice dice = new Dice();
         int lado = dice.sides();

         int guess;
        do {
            System.out.printf("Qual lado o dado ira rolar? ");
            System.out.println("Lado "+lado);
            guess = scanner.nextInt();

            if (dice.comparar(lado, guess) == 0) {
                System.out.println("Voce acertou o lado correto: " +lado);
                return;
            }
            else {
                System.out.println("Erroooouu! Rolando novamente");
                lado = dice.sides();
            }

        } while (dice.comparar(lado, guess) == 1);
    }
}