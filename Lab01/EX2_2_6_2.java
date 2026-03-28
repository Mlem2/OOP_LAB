import java.util.Scanner;

public class EX2_2_6_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a11, a12, b1: ");
        double a11 = s.nextDouble();
        double a12 = s.nextDouble();
        double b1 = s.nextDouble();

        System.out.print("Enter a21, a22, b2: ");
        double a21 = s.nextDouble();
        double a22 = s.nextDouble();
        double b2 = s.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinite solutions");
            } else {
                System.out.println("The system has no solution");
            }
        }
        s.close();
    }
}