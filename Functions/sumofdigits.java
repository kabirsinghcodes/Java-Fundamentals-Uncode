package Functions;

import java.util.Scanner;

public class sumofdigits {
    static int sumofdigits(long n) {
        int rem = 0;
        while (n > 0) {
            rem += n % 10;
            n /= 10;
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number : ");
        int a = sc.nextInt();
        long b = sumofdigits(a);
        System.out.println("The sum of the digits is as follows : " + b);
    }
}
