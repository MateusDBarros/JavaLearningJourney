import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.printf("Quantos numeros deseja calucalr a media? ");
        int size = scanner.nextInt();
        int soma = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("Digite um numero inteiro: ");
            soma += scanner.nextInt();
        }
        int media = soma / size;
        System.out.println("A media é: " + media);
    }
}
