public class Main {
    public static void main(String[] args) {

        int array[][] = {
                {23, 45,  78, 12},
                {56, 90, 34, 67},
                {89, 21, 43, 76}
        };

        int newArray[] = maxRow(array);
        System.out.printf("Max Row:");
        for (int i : newArray) {
            System.out.printf(" " + i + ",");
        }

        System.out.println();
        int Array2[] = maxColumn(array);
        System.out.printf("Max Column:");
        for (int i : Array2) {
            System.out.printf(" " + i + ",");
        }
    }

    public static int[] maxRow(int list[][]) {
        int array[] = new int[3];

      for (int i = 0; i < 3; i++) {
          int max = list[i][0];
          for (int j = 0; j < 4; j++) {
              if (max <= list[i][j]) {
                  max = list[i][j];
                  array[i] = max;
            }
        }
      }
      return array;
    }

    public static int[] maxColumn(int list[][]) {
        int array[] = new int[4];

        for (int i = 0; i < 4; i++) {
            int max = list[i][0];
            for (int j = 0; j < 4; j++) {
                if (max <= list[j][i]) {
                    max = list[j][i];

                }

            }
            array[i] = max;
        }

        return array;
    }

}