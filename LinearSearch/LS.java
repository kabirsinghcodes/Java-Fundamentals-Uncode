package LinearSearch;

public class LS {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int search = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("found at position : " + i);
                break;
            }
        }
    }
}
