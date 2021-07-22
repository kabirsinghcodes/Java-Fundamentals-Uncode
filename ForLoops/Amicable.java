package ForLoops;

import java.util.Scanner;

public class Amicable {
    public static void main(String[] args) {
        int firstDivisorSum = 0, secondDivisorSum = 0, firstNumber, secondNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");

        secondNumber = sc.nextInt();
        for (int i = 1; i < firstNumber; i++) {

            if (firstNumber % i == 0) {

                firstDivisorSum = firstDivisorSum + i;
            }
        }
        for (int i = 1; i < secondNumber; i++) {

            if (secondNumber % i == 0) {

                secondDivisorSum = secondDivisorSum + i;
            }
        }

        if ((firstNumber == secondDivisorSum) && (secondNumber == firstDivisorSum)) {
            System.out.println(firstNumber + ", " + secondNumber + " are amicable numbers.");
        } else {
            System.out.println(firstNumber + ", " + secondNumber + " are not amicable numbers.");
        }
    }
}
