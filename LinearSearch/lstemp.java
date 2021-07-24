package LinearSearch;

public class lstemp {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int search = 10;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("found at position : " + i);
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("Element not found!");
        }
    }
}
