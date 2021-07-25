package BinarySearch;

import java.util.Scanner;

public class binarymain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array entered is as follows : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Enter the element you want to search : ");
        int search = sc.nextInt();
        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + hi) / 2;
        while (li <= hi) {
            if (arr[mi] == search) {
                System.out.println(search + " was Found at : " + (mi + 1));
                break;
            } else if (arr[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (li > hi) {
            System.out.println(search + " was Not Found");
        }

    }
}
