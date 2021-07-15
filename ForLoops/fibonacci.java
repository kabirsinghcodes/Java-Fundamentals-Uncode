package ForLoops;

public class fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci series of " + count + " Numbers:");

        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            int sumofprev = num1 + num2;
            num1 = num2;
            num2 = sumofprev;
        }
    }
}
