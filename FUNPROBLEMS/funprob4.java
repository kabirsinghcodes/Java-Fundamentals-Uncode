package FUNPROBLEMS;

public class funprob4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x++ > 10 && ++y > 20) {
            System.out.println("Inside if ");
        } else {
            System.out.println("Inside else ");
        }
        System.out.println(x + " " + y);
    }

}
