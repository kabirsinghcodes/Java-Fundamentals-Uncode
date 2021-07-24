package Arrays;

import java.util.Scanner;

public class addingelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        System.out.println("Enter the 10 elements of the arrays : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("array full!");
    }
}
