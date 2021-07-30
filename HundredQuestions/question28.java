package HundredQuestions;

public class question28 {
    public static void main(String[] args) {
        int a = 12;
        System.out.println("Factors of " + a + " are : ");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
