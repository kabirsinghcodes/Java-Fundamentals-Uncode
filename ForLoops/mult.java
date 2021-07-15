package ForLoops;

import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mult = n * i;
            System.out.println(n + " * " + i + " = " + mult);
        }
        System.out.println("This is the end of the table!");
    }
}
