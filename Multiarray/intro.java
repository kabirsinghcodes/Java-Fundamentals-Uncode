package Multiarray;

public class intro {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 30;
        arr[4] = 50;
        int arr1[] = new int[5];
        arr1[0] = 45;
        arr1[1] = 34;
        arr1[2] = 87;
        arr1[3] = 67;
        arr1[4] = 40;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
