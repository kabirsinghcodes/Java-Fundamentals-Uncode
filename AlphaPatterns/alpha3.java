package AlphaPatterns;

public class alpha3 {
    public static void main(String[] args) {
        for (int i = 1, p = 'E'; i <= 5; i++, p--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p);
            }
            System.out.println();
        }
    }
}
