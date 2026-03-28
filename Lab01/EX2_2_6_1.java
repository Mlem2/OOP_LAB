import java.util.Scanner;

public class EX2_2_6_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = s.nextDouble();

        System.out.print("Enter b: ");
        double b = s.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinite solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            double x = -b / a;
            System.out.print("x = " + x);
        }

        s.close();
    }
}
