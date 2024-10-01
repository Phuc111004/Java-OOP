import java.util.Scanner;
public class linearequation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a và b
        System.out.print("Enter coefficient a (a ≠ 0): ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter coefficient b: ");
        double b = Double.parseDouble(scanner.nextLine());

        if (a != 0) {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        } else {
            System.out.println("Invalid input. a must not be zero.");
        }
    }
}

