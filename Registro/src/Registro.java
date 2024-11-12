import java.util.Scanner;
public class Registro {
    private String name;
    private int age;
    private int id;
    public static int numPessoas = 0;


    private static Scanner scanner = new Scanner(System.in);

    public static void create(Registro dados[], int numPessoas) {
        if (numPessoas < dados.length) {
            dados[numPessoas] = new Registro();
            System.out.printf("Digite um nome para cadastro: ");
            dados[numPessoas].name = scanner.nextLine();
            System.out.printf("Digite a idade de " + dados[numPessoas].name + ": ");
            dados[numPessoas].age = scanner.nextInt();
            scanner.nextLine();
            dados[numPessoas].id = numPessoas + 1;
            Registro.numPessoas++;
            System.out.println("Cadastro Registrado com sucesso!");
        }
        else
            System.out.println("Impossivel create mais registros!");
    }

    public static void list(Registro dados[], int numPessoas) {
        if (numPessoas == 0) {
            System.out.println("Nenhum cadastro registrado!");
            return;
        }

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("ID:    \t" + dados[i].id);
            System.out.println("Nome:\t" + dados[i].name);
            System.out.println("Idade:\t" + dados[i].age);
            System.out.println();

        }
    }

    public static void search (Registro dados[], int numPessoas) {
        if (numPessoas == 0) {
            System.out.println("Nenhum cadastro registrado!");
            return;
        }

        String input;
        System.out.printf("Digite o nome do cadastro que deseja acessar (digite 'sair' para voltar ao menu anterior): ");
        input = scanner.nextLine();

        if (input.equals("sair"))
            return;
        for (int i = 0; i < dados.length; i++) {
            if (input.equals(dados[i].name)) {
                System.out.println("ID:    \t" + dados[i].id);
                System.out.println("Nome:\t" + dados[i].name);
                System.out.println("Idade:\t" + dados[i].age);
                System.out.println();
                return;
            }
        }
        System.out.println("Cadastro não encontrado");
    }


    public static void delete(Registro[] dados, int numPessoas) {
        if (numPessoas == 0) {
            System.out.println("Nenhum cadastro registrado!");
            return;
        }

        String input;
        char inputchar;
        System.out.printf("Digite o nome do usuario que deseja excluir (digite 'sair' para voltar ao menu anterior): ");
        input = scanner.nextLine();

        if (input.equals("sair"))
            return;

        for (int i = 0; i < dados.length; i++) {
            if (input.equals(dados[i].name)) {
                System.out.printf("Deseja mesmo excluir esse Cadastro (y/n)? ");
                inputchar = scanner.next().charAt(0);
                scanner.nextLine();
                if (inputchar == 'n')
                    return;

                else if (inputchar == 'y') {
                    for (int j = i; j < numPessoas - 1; j++) {
                        dados[j] = dados[j + 1];
                    }
                    dados[numPessoas - 1] = null;
                    Registro.numPessoas--;
                    System.out.println("Cadastro excluido com sucesso!");
                    return;
                }
                else {
                    System.out.println("Cadastro não encontrado");
                    return;
                }
            }
        }
    }
}