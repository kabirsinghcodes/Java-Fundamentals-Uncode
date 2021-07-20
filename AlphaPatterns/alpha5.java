package AlphaPatterns;

public class alpha5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int p = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p++ + " ");
            }
            System.out.println();

        }
    }
}
