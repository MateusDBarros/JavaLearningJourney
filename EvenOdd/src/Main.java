public class Main {
    public static void main(String[] args) {

        int[] even = new int[50];
        int[] odd = new int[50];
        int evenCount = 0, oddCount = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even[evenCount] = i;
                evenCount++;
            } else {
                odd[oddCount] = i;
                oddCount++;
            }
        }
        System.out.println("Even: "+ evenCount + " and Odd: "+ oddCount);
        System.out.printf("Even:");
        // Printa a array de numeros pares
        for (int i = 0; i < evenCount; i++) {
            System.out.printf(" "+even[i]);
        }
        System.out.println();

        // Printa a array de numeros impares
        System.out.printf("Odd:");
        for (int i = 0; i < oddCount; i++) {
            System.out.printf(" "+odd[i]);
        }
    }
}