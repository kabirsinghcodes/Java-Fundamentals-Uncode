package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 12, 16, 18, 19, 81, 100, 131 };
        int search = 81;
        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + hi) / 2;
        while (li <= hi) {
            if (arr[mi] == search) {
                System.out.println("Item Found at : " + (mi + 1));
                break;
            } else if (arr[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (li > hi) {
            System.out.println("Item Not Found");
        }
    }
}
