import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static void menu(ArrayList<Banco> contas, int index) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.printf("--- Olá, %s ---\n", contas.get(index).name);
            System.out.println("1. Sacar.");
            System.out.println("2. Depositar.");
            System.out.println("3. Transferir.");
            System.out.println("4. Exibir Conta");
            System.out.println("5. Voltar.");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.printf("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    contas.get(index).cashOut(saque);
                    break;

                case 2:
                    System.out.printf("Digite o valor do deposito: ");
                    double deposito = scanner.nextDouble();
                    contas.get(index).deposit(deposito);
                    break;

                case 3:
                    System.out.printf("Digite o numero da conta que deseja transferir: ");
                    String destination = scanner.next();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < contas.size(); i++) {
                        if (destination.equals(contas.get(i).accNum)) {
                            System.out.printf("Insira o valor a transferir: ");
                            double transferir = scanner.nextDouble();
                            contas.get(index).transfer(transferir, i, contas);
                            found = true;
                            break;
                        }
                    }
                    if (found == false) {
                        System.out.println("Conta não encontrada!");
                        break;
                    }

                case 4:
                    contas.get(index).showAll();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Voltando ao menu anterior...");
                    System.out.println();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        } while (userInput != 5);
    }

    static int login(ArrayList<Banco> contas) {

        Scanner scanner = new Scanner(System.in);

        String acc;
        String accPass;

        System.out.print("Digite o numero da conta: ");
        acc = scanner.nextLine();

        for (int i = 0; i < contas.size(); i++){
            if (acc.equals(contas.get(i).accNum)) {
                System.out.printf("Olá, " + contas.get(i).name+ ", digite a senha da conta: ");
                accPass = scanner.nextLine();
                if (accPass.equals(contas.get(i).password)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
