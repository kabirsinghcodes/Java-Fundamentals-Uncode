package LinearSearch;

public class stringarray {
    public static void main(String[] args) {
        String arr[] = { "maseera", "hritvik", "tulasi", "vaasvi", "manoj", "ayush" };
        String name = "Kabir";
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                System.out.println("Found at position : " + i);
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("User not Found!");
        }
    }
}
