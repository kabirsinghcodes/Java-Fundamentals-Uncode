package Conditionals;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int rem = a%2;

        if(rem==0){
            System.out.println("This is an Even Number");
        }
        else{
        System.out.println("This is an Odd Number");
        }
        System.out.println("Our Code Is Executed");;
    }
}
