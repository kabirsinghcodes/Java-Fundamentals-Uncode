package HundredQuestions;

public class question14 {
    public static void main(String[] args) {
        int a = 100;
        int b = 45;
        System.out.println("--Before Swapping--");
        System.out.println("first number = " + a);
        System.out.println("Second number = " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("--After Swapping--");
        System.out.println("first number = " + a);
        System.out.println("Second number = " + b);

    }
}
