package While;

import java.util.Scanner;

import ForLoops.mult;

public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int mult = 1;
        while (i <= 10) {
            mult = n * i;
            System.out.println(n + " * " + i + " = " + mult);
            i++;
        }
    }
}
