public class Main {
    public static void main(String[] args) {

        int[] array = {7, 4, 2, 0, 8, 1, 6, 9, 3, 5};

        System.out.printf("Array Desordenada: ");
        printar(array);

        System.out.println();
        bubbleSort(array);
        System.out.printf("Array Ordenada: ");
        printar(array);
    }

    private static void bubbleSort(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void printar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
    }
}