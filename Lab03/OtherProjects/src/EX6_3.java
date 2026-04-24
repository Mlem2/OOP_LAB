import java.util.Scanner;

public class EX6_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = 0;

        while (n <= 0) {
            n = s.nextInt();
        }

        s.close();

        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = count; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = count - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("*");
            for (int j = count - 1; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = count; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print("\n");
            count++;
        }
    }
}
