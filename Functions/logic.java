package Functions;

public class logic {
    static int add(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 6;
        }
        x = 560;
        return z;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println(c);

        int a1 = 40;
        int b1 = 60;
        int c1 = add(a1, b1);
        System.out.println(c1);

    }
}
