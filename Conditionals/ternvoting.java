package Conditionals;

import java.util.Scanner;

public class ternvoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String result = (age>18) ? ("Eligible") : ("Not Eligible");
        System.out.println(result);
    }
}
