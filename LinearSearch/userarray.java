package LinearSearch;

import java.util.Scanner;

public class userarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int search = 10;
        int temp = 0;
        System.out.println("Enter 10 elements of the array : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] == search) {
                System.out.println("found at : " + i);
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("Element not found");
        }

    }
}
