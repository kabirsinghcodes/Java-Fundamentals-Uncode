package DW;

import java.util.Scanner;

public class oton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}
