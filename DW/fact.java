package DW;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int fact = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= n);
        System.out.println(fact);
    }
}
