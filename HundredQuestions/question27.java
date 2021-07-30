package HundredQuestions;

public class question27 {
    public static void main(String[] args) {
        int base = 12;
        int power = 5;
        int result = 1;
        while (power != 0) {
            result = result * base;
            --power;
        }
        System.out.println("Result : " + result);
    }
}
