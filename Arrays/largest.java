package Arrays;

public class largest {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int largest = arr[0];
        for (int num : arr) {
            if (largest < num) {
                largest = num;
            }
        }
        System.out.println("The largest element inn the array is : " + largest);
    }
}
