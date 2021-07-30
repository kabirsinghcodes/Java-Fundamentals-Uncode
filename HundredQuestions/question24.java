package HundredQuestions;

import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = 1;
        for (int i = 1; i <= a && i <= b; ++i) {

            // check if i perfectly divides both n1 and n2
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);

    }
}
