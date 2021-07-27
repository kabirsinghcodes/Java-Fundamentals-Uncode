package Multiarray;

public class multi1 {
    public static void main(String[] args) {
        int arr[][] = { { 6, 12, 18 }, { 54, 65, 45 }, { 66, 67, 68 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
