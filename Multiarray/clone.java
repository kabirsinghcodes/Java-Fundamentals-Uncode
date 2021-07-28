package Multiarray;

import java.util.Scanner;

public class clone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements of the array.");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Printing clone of the array:");
        int carr[] = arr.clone();
        for (int i : carr) {
            System.out.print(i + " ");
        }

    }
}
