import java.util.Arrays;
import java.util.Scanner;

public class NumericArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng phần tử của mảng từ bàn phím
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        
        // Tạo mảng với n phần tử
        int[] myArray = new int[n];
        
        // Nhập các phần tử của mảng từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
        
        // Hiển thị mảng gốc
        System.out.println("Mảng gốc: " + Arrays.toString(myArray));
        
        // Sắp xếp mảng
        Arrays.sort(myArray);
        
        // Hiển thị mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(myArray));
        
        // Tính tổng của các phần tử
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        
        // Tính trung bình cộng của các phần tử
        double average = (double) sum / n;
        
        // Hiển thị tổng và giá trị trung bình
        System.out.println("Tổng các phần tử: " + sum);
        System.out.println("Giá trị trung bình của các phần tử: " + average);
        
        scanner.close();
    }
}
