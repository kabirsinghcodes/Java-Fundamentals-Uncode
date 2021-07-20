package AlphaPatterns;

public class pat5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("*");
            }
            for (int l = i; l <= 4; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
