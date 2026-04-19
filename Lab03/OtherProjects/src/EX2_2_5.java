import java.util.Scanner;

public class EX2_2_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();

        double num2 = 0;

        while (num2 == 0) {
            System.out.print("Enter second number: ");
            num2 = s.nextDouble();
            if (num2 == 0) {
                System.out.print("Error, divisor must be different from 0");
            }
        }

        s.close();

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (Math.abs(num1 - num2)));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = " + (num1 / num2));
    }
}