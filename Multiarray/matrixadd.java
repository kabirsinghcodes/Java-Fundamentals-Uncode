package Multiarray;

public class matrixadd {
    public static void main(String[] args) {
        int arr1[][] = { { 3, 3, 3 }, { 7, 14, 28 } };
        int arr2[][] = { { 33, 60, 50 }, { 6, 12, 42 } };

        int arr3[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
