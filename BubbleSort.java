public class Main {

    public static void main(String[] argv) {
        int[] list = {6, 9, 8, 3, 5, 2, 4, 1, 0};
        int size = list.length;

        System.out.print("Array Desordenada: ");
        printArray(list, size); // Metodo com loop pra printar a array

        BubbleSort(list, size); // Algoritmo de ordenação

        System.out.println();
        System.out.print("Array Ordenada: ");
        printArray(list, size);
    }

    private static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void BubbleSort(int[] array, int size) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
        }
    }

}
