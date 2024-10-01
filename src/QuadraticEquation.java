import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Enter coefficient a (a ≠ 0): ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter coefficient b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter coefficient c: ");
        double c = Double.parseDouble(scanner.nextLine());

        // Tính delta
        double delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Invalid input. a must not be zero.");
        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two distinct real roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has one double root: x = " + x);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
