package HundredQuestions;

import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 coefficients : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double root1;
        double root2;

        double D = b * b - 4 * a * c;

        if (D > 0) {
            root1 = (-b + Math.sqrt(D)) / (2 * a);
            root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (D == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);

        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-D) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }

    }
}
