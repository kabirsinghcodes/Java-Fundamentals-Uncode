package DW;

import java.util.Scanner;

public class positivesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        do {
            sum += n;
            System.out.println("Enter Numbers To be Added : ");
            n = sc.nextInt();
        } while (n >= 0);
        System.out.println(sum);
    }
}
