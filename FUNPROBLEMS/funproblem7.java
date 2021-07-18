package FUNPROBLEMS;

public class funproblem7 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 1)
                    break;
                System.out.print(j + " ");
            }
        }
    }
}
