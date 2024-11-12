import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registro dados[] = new Registro[100];





        int escolha;
        do {
            System.out.println("1. Criar Cadastro.");
            System.out.println("2. Exibir Cadastros.");
            System.out.println("3. Pesquisar Cadastro.");
            System.out.println("4. Deletar Cadastro.");
            System.out.println("5. Sair.");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Registro.create(dados, Registro.numPessoas);
                    break;

                case 2:
                    Registro.list(dados, Registro.numPessoas);
                    break;

                case 3:
                    Registro.search(dados, Registro.numPessoas);
                    break;

                case 4:
                    Registro.delete(dados, Registro.numPessoas);
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    return;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }


        } while (5 != escolha);
    }


}