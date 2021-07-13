package Conditionals;
import java.util.Scanner;
public class ifst {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int a = sc.nextInt();

        if(a>10){
            if(a>20){
                System.out.println("number is greater than 20");
            }
            else{
                System.out.println("Number is greater than 10 but less than 20");
            }
        }
        else{
            System.out.println("Number is less than 10");
        }

    }
}
