package BinarySearch;

public class bsf {
    static void binarysear(int arr[], int first, int last, int search) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] == search) {
                System.out.println("Found at : " + (mid + 1));
                break;
            }

            else if (arr[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Item not found");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 7, 11, 13, 14, 15, 90, 91, 100 };
        int search = 547989;
        int last = arr.length - 1;
        binarysear(arr, 0, last, search);
    }
}
