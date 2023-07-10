package furtado.erlan.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] array2 = {1, 2, 3};

        arrayInt[0] = new int[2];
        arrayInt[1] = array2;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] array3 = {{0,0}, {1,2,3}, {3,4,5,6,7,8}};

        for (int[] arrayBase : array3) {
            System.out.println("\n-------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
