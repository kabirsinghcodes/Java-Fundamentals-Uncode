package HundredQuestions;

public class question29 {
    public static void main(String[] args) {
        int arr[] = { 44, 66, 11, 33, 99, 88, 77, 66, 34, 68, 35, 68, 34, 8, 77 };
        int largest = arr[0];
        for (int num : arr) {
            if (largest < num) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
