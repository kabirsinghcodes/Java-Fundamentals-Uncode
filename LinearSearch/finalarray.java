package LinearSearch;

import java.util.Scanner;

public class finalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int temp = 0;

        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search : ");
        int search = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println(search + " was found at the position : " + (i + 1));
                temp = temp + 1;
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Element not found!");
        }
    }
}
