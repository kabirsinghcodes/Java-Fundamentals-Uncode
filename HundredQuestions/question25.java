package HundredQuestions;

import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm;
        lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
                break;
            }
            ++lcm;
        }

    }
}
