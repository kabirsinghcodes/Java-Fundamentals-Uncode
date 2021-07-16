package While;

import java.util.Scanner;

import loops.whilest;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter numbers to be added = ");
        while (true) {
            num = sc.nextInt();
            if (num < 0) {
                break;
            }
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
