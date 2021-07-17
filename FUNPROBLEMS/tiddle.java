package FUNPROBLEMS;

import java.util.Scanner;

public class tiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = ~a;
        System.out.println(a + " " + b);
    }
}
