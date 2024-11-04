import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"pedra", "papel", "tesoura"};
        String choice;
        String computer;




        do {
            // Salva as informações do computador
            int rand = random.nextInt(3);
            computer = options[rand];
            System.out.println("Computador escolheu " +computer);

            // Salva as escolhas do jogador
            System.out.println("Escolha entre ('Pedra', 'Papel' ou 'Tesoura'):");
            choice = scanner.next();
            choice = choice.toLowerCase();


            if (choice.equals(computer)) {
                System.out.println("Empate!");
                continue;
            }
            else if (choice.equals("pedra") && computer.equals("tesoura")) {
                System.out.println("Voce venceu! computador escolheu " + computer + " e voce escolheu " + choice + "!");
            }
            else if (choice.equals("tesoura") && computer.equals("papel")) {
                System.out.println("Voce venceu! computador escolheu " + computer + " e voce escolheu " + choice + "!");
            }
            else if (choice.equals("papel") && computer.equals("pedra")) {
                System.out.println("Voce venceu! computador escolheu " + computer + " e voce escolheu " + choice + "!");
            }
            else
                System.out.println("Voce perdeu! computador escolheu " + computer + " e voce escolheu " + choice + "!");

        } while (choice.equals(computer));
    }
}