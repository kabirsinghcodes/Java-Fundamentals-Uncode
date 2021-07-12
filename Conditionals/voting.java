package Conditionals;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
    
        if(age>=18){
            System.out.println("You are eligible to vote!");
        }
        else{
            System.out.println("Sorry You aren't eligible to vote!");
        }
    }

}
