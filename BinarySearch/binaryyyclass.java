package BinarySearch;

import java.util.*;

public class binaryyyclass {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 78, 89, 129, 234 };
        int key = 78;
        int result = Arrays.binarySearch(arr, key);
        if (result < 0) {
            System.out.println("Item not found");
        } else {
            System.out.println("Found at : " + (result + 1));
        }
    }
}
