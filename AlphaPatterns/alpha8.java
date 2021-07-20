package AlphaPatterns;

public class alpha8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int p = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print((char) p++ + "");
            }
            System.out.println();
        }
    }
}
