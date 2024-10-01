import java.util.Scanner;

public class Stardraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập vào số n (chiều cao của tam giác)
        System.out.print("Enter the height of the triangle (n): ");
        int n = sc.nextInt();
        // Vòng lặp để in ra từng dòng của tam giác
        for (int i = 1; i <= n; i++) {
        	for (int k = i; k < n; k++) {
        		System.out.print(" ");
        	}
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
