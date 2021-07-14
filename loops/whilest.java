package loops;

import java.util.Scanner;

public class whilest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        

        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("This is the end of our while loop!");
    }
}
