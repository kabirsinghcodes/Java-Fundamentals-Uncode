package AlphaPatterns;

public class alpha6 {
    public static void main(String[] args) {
        int p = 'A';
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) p++ + " ");
            }
            System.out.println();

        }
    }
}
