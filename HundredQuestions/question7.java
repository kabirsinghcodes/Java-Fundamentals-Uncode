package HundredQuestions;

import java.util.Scanner;

//BUZZ NUMBER
public class question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 10 == 7 || n % 7 == 0) {
            System.out.println("Buzz Number");
        } else {
            System.out.println("Not a buzz number");
        }
    }
}
