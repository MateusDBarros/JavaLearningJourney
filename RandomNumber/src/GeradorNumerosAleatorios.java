import java.util.Random;
import java.util.Scanner;
public class GeradorNumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Valor minimo: ");
        int min = scanner.nextInt();
        System.out.printf("Valor maximo: ");
        int max = scanner.nextInt();

        int n = random.nextInt((max - min) + 1) + min;
        System.out.println("Numero aleatorio: "+n);
    }
}