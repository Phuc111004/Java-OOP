import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ người dùng
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        // Tính toán
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Kiểm tra số chia để thực hiện phép chia
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Hiển thị kết quả
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}
