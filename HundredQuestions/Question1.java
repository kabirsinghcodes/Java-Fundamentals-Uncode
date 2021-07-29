package HundredQuestions;

import java.util.Scanner;

//FIBONACCI SERIES IN JAVA WITHOUT RECURSION
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Enter the number of elements in the series : ");
        int count = sc.nextInt();
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
