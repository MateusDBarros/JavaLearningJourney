import java.util.Scanner;

public class Main {

    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha o tamanho da piramide: ");
        int size = input.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" "); // Imprime espaços
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("#"); // Imprime o caractere da pirâmide
            }
            System.out.println(); // Nova linha após cada linha da pirâmide
        }

        input.close(); // Fecha o Scanner
    }
}
