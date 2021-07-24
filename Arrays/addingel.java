package Arrays;

import java.util.Scanner;

public class addingel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array entered is as follows : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
