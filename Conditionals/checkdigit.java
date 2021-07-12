package Conditionals;

import java.util.Scanner;

public class checkdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a<10){
            System.out.println("This is a single digit number");
            return;
        }
        if(a>=10&&a<100){
        System.out.println("This is a double digit number");
        return;
        }
        System.out.println("This is a three digit number");

    }
}
