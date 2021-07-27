package Multiarray;

public class methodret {

    static int[] arr() {
        return new int[] { 12, 56, 77, 99, 67, 88, 94, 35, 12, 32 };
    }

    public static void main(String[] args) {
        int arr[] = arr();

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
