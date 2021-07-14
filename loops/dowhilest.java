package loops;

import java.util.Scanner;

public class dowhilest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int n = sc.nextInt();


        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
    }
}
