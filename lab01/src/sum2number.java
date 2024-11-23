import java.util.*; 

@SuppressWarnings({"unchecked", "deprecation"})
public class sum2number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		scanner.close(); // Đóng scanner sau khi sử dụng
		
		// Khai báo các biến a1, b1, a2, b2
		long a1 = a / 10; 
		long b1 = b / 10;
		long a2 = a % 10; 
		long b2 = b % 10;
		
		// Tính tổng từng phần và xử lý phần dư
		long c1 = a1 + b1 + (a2 + b2) / 10;
		long c2 = (a2 + b2) % 10;
		
		// In ra kết quả
		if (c1 > 0) {
			System.out.print(c1 + "" + c2); // Nối hai số c1 và c2 thành chuỗi
		} else {
			System.out.print(c2);
		}
	}
}
/*
import java.util.*; 
import java.math.BigInteger;

public class sum2number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Đọc vào hai số lớn sử dụng BigInteger
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        scanner.close(); // Đóng scanner sau khi sử dụng
        
        // Lấy chữ số hàng đơn vị và hàng chục
        BigInteger a1 = a.divide(BigInteger.TEN); // a1 = phần nguyên của a / 10
        BigInteger b1 = b.divide(BigInteger.TEN); // b1 = phần nguyên của b / 10
        BigInteger a2 = a.remainder(BigInteger.TEN); // a2 = phần dư của a / 10
        BigInteger b2 = b.remainder(BigInteger.TEN); // b2 = phần dư của b / 10

        // Tính tổng từng phần và xử lý phần dư
        BigInteger c1 = a1.add(b1).add(a2.add(b2).divide(BigInteger.TEN)); // c1 = tổng hàng chục
        BigInteger c2 = a2.add(b2).remainder(BigInteger.TEN); // c2 = tổng hàng đơn vị
        
        // In ra kết quả
        if (c1.compareTo(BigInteger.ZERO) > 0) {
            System.out.print(c1.toString() + c2.toString()); // Nối hai số c1 và c2 thành chuỗi
        } else {
            System.out.print(c2);
        }
    }
}

 */
