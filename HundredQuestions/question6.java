package HundredQuestions;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n * 2;
        int n2 = n * 3;

        String combo = n + "" + n1 + n2;
        boolean search = true;
        for (char c = '1'; c <= '9'; c++) {
            int count = 0;
            for (int i = 0; i < combo.length(); i++) {
                char ch = combo.charAt(i);
                if (ch == c)
                    count++;
            }
            if (count > 1 || count == 0) {
                search = false;
                break;
            }
        }
        if (search) {
            System.out.println("Fascinating Number");
        } else {
            System.out.println("Not a Fascinating number");
        }
    }

}
