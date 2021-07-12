import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();

        boolean islargest = (a>=b)&&(a>=c);
        System.out.println(islargest);
        }
    }
}
