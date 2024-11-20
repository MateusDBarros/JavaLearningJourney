import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Banco> contas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int index;

        do {

            System.out.println("1. Criar uma conta.");
            System.out.println("2. Entrar...");
            System.out.println("3. Sair.");
            userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1:
                    Banco.create(contas);
                    break;
                case 2:
                    index = Menu.login(contas);
                    if (index != -1) {
                        Menu.menu(contas, index);
                    }
                    else
                        System.out.println("Conta não encontrada!");
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    return;
            }



        } while (userInput != 3);
    }
}