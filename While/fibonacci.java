package While;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int i = 1;
        while (i <= count) {
            int sumofprev = num1 + num2;
            num1 = num2;
            num2 = sumofprev;
            i++;
        }
        System.out.print(num1 + " ");
    }
}
