package HundredQuestions;

public class question26 {
    public static void main(String[] args) {
        int a = 123456789;
        int count = 0;
        while (a != 0) {
            a /= 10;
            ++count;
        }
        System.out.println(count);
    }
}
