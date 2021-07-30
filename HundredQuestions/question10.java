package HundredQuestions;

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n + m;
        System.out.println("Sum of the two numbers is : " + sum);
    }
}
