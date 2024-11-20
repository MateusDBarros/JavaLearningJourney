import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Agenda> dados = new ArrayList<>();
        int choice;

        dados.add(new Agenda("Mateus", "19 132435460", 22));
        dados.add(new Agenda("Ligia", "19 064534231", 22));

        do {

            System.out.println("1. Adicionar contato.");
            System.out.println("2. Editar contato.");
            System.out.println("3. Listar contatos.");
            System.out.println("4. Remover contato.");
            System.out.println("5. Sair.");
            choice = scanner.nextInt();
            scanner.nextLine();



            switch (choice) {
                case 1:
                    Methods.create(dados);
                    break;
                case 2:
                    if (dados.isEmpty()){
                        System.out.println("Nenhum contato registrado na agenda!");
                        break;
                    }
                    else {
                        System.out.printf("Quem deseja editar? ");
                        String update = scanner.nextLine();
                        Methods.update(update, dados);
                        break;
                    }

                case 3:
                    if (dados.isEmpty()){
                        System.out.println("Nenhum contato registrado na agenda!");
                        break;
                    }
                    else {
                        Agenda.showData(dados);
                        break;
                    }

                case 4:
                    if (dados.isEmpty()){
                        System.out.println("Nenhum contato registrado para excluir!");
                        break;
                    }
                    else {
                        System.out.println("Digite o nome do contato que deseja excluir");
                        String delete = scanner.nextLine();
                        Methods.delete(delete, dados);
                        break;
                    }

                case 5:
                    System.out.println("Fechando Agenda...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }

            System.out.println();
        } while (choice != 5);
    }

    public static void check(ArrayList<Agenda> dados) {


    }
}