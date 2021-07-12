package Operators;
import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean isEq = (a==b);
        boolean isneq = (a!=b);
        boolean gr = (a>b);
        boolean gre= (a>=b);
        boolean ls = (a<b);
        boolean lse = (a<=b);

        System.out.println("is "+a+" Equal to "+b+" "+isEq);
        System.out.println("is "+a+" Not Equal to "+b+" "+isneq);
        System.out.println("is "+a+" Great than "+b+" "+gr);
        System.out.println("is "+a+" Greater than Equal to "+b+" "+gre);
        System.out.println("is "+a+" Less than "+b+" "+ls);
        System.out.println("is "+a+" Less than Equal to "+b+" "+lse);

    }
}
