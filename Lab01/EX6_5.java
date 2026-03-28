import java.util.Arrays;

public class EX6_5 {
    public static void main(String[] args) {
        int[] arr = {1789, 2035, 1899, 1456, 2013};

        Arrays.sort(arr);

        int sum = 0;

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Avarage: " + (double)(sum / arr.length));
    }
}
