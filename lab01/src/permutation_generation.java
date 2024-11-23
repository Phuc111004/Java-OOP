import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class permutation_generation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        // Khởi tạo danh sách ban đầu từ 1 đến n
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Danh sách để lưu các hoán vị
        List<List<Integer>> permutations = new ArrayList<>();
        
        // Sinh hoán vị đầu tiên và tiếp tục cho đến khi có đủ các hoán vị
        do {
            permutations.add(new ArrayList<>(numbers));
        } while (nextPermutation(numbers));
        
        // In các hoán vị
        for (List<Integer> permutation : permutations) {
            for (int i = 0; i < permutation.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(permutation.get(i));
            }
            System.out.println();
        }
    }

    // Phương thức tìm hoán vị kế tiếp theo thứ tự từ điển
    private static boolean nextPermutation(List<Integer> numbers) {
        int i = numbers.size() - 2;
        while (i >= 0 && numbers.get(i) >= numbers.get(i + 1)) i--;
        if (i < 0) return false;
        
        int j = numbers.size() - 1;
        while (numbers.get(j) <= numbers.get(i)) j--;
        
        Collections.swap(numbers, i, j);
        Collections.reverse(numbers.subList(i + 1, numbers.size()));
        
        return true;
    }
}
