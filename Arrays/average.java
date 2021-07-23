package Arrays;

public class average {
    public static void main(String[] args) {
        int[] arr = new int[] { 50, 25, 60, 78, 100, 69, 92, 75, 98, 63 };
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int avg = sum / arr.length;
        System.out.println("The sum of the elements of the array are : " + sum);
        System.out.println("The number of elements in the array are : " + arr.length);
        System.out.println("The average of the numbers is : " + avg);
    }
}
