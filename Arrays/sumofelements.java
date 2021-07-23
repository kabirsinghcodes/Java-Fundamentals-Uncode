package Arrays;

public class sumofelements {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 30, 40, 50, 60 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of all the elements of the array is : " + sum);
    }
}
