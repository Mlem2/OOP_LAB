import java.util.Scanner;

public class EX2_2_6_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = 0, b = 0, c = 0;
        while (a == 0) {
            System.out.print("Enter a, b, c: ");
            a = s.nextDouble();
            b = s.nextDouble();
            c = s.nextDouble();
            if (a == 0) {
                System.out.println("Error, this is a linear equation");
            }
        }

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("The equation has no solution");
        }

        s.close();
    }
}