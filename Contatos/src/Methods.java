import java.util.ArrayList;
import java.util.Scanner;


public class Methods {
    static Scanner scanner = new Scanner(System.in);

    static void create(ArrayList<Agenda> dados) {
        System.out.printf("Digite o nome do contato: ");
        String name = scanner.nextLine();
        System.out.printf("Digite um telefone para contato: ");
        String phone = scanner.nextLine();
        System.out.printf("Digite a idade de %s: ", name);
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Contato criado com sucessso!");
        dados.add(new Agenda(name, phone, age));
    }

    static void update(String name, ArrayList<Agenda> dados) {

        for (int i = 0; i < dados.size(); i++) {
            if (name.equals(dados.get(i).name)) {
                int choice;
                do {
                    System.out.println("O que deseja alterar?");
                    System.out.println("1. Nome");
                    System.out.println("2. Telefone");
                    System.out.println("3. Idade");
                    System.out.println("4. Voltar");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.printf("Digite o novo nome");
                            String newName = scanner.nextLine();
                            dados.get(i).name = newName;
                            System.out.println("Nome atualizado com sucesso!");
                            Agenda.showData(dados, i);
                            break;

                        case 2:
                            System.out.printf("Digite o novo nome");
                            String newPhone = scanner.nextLine();
                            dados.get(i).phone = newPhone;
                            System.out.println("Nome atualizado com sucesso!");
                            Agenda.showData(dados, i);
                            break;

                        case 3:
                            System.out.printf("Digite o novo nome");
                            int newAge = scanner.nextInt();
                            scanner.nextLine();
                            dados.get(i).age = newAge;
                            System.out.println("Nome atualizado com sucesso!");
                            Agenda.showData(dados, i);
                            break;

                        case 4:
                            System.out.println("Voltando...");
                            break;

                        default:
                            System.out.println("Opção invalida");
                            break;
                    }

                } while (choice != 4);


            }
        }
        System.out.println("Contato não encontrado na agenda!");

    }

    public static void delete(String name, ArrayList<Agenda> dados) {

        for (int i = 0; i < dados.size(); i++) {
            if (name.equals(dados.get(i).name)) {
                System.out.printf("Contato de %s apagado com sucesso", dados.get(i).name);
                dados.remove(i);
            }
        }
        System.out.println("Contato não encontrado na agenda!");
    }


    public static void sort(ArrayList<Agenda> dados) {


        for (int i = 0; i < dados.size() - 1; i++) {
            for (int j = 0; j < dados.size() - 1 - i; j++) {
                if (dados.get(j).name.compareTo(dados.get(j + 1).name) > 0) {
                Agenda temp = dados.get(j);
                dados.set(j, dados.get(j + 1));
                dados.set(j + 1, temp);
                }
            }
        }
    }
}
