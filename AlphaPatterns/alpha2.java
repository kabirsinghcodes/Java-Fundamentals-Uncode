package AlphaPatterns;

public class alpha2 {
    public static void main(String[] args) {
        for (int i = 1, p = 'A'; i <= 5; i++, p++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p);
            }
            System.out.println();
        }
    }
}
