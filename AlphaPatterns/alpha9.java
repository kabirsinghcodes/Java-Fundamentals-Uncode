package AlphaPatterns;

public class alpha9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int p = 'A';
            for (int j = i; j <= 5; j++) {
                System.out.print((char) p++ + "");
            }
            System.out.println();
        }
    }
}
