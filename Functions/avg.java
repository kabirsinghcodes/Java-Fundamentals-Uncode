package Functions;

import java.util.Scanner;

public class avg {
    static double average(double a, double b, double c) {
        double d = (a + b + c) / 3;
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 :");
        double x = sc.nextDouble();
        System.out.print("Enter Number 2 :");
        double y = sc.nextDouble();
        System.out.print("Enter Number 3 :");
        double z = sc.nextDouble();

        double p = average(x, y, z);
        System.out.println("Average of the three numbers is : " + p);
    }
}
