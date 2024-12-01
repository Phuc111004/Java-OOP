package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
        String filePath = "D:\\Downloads\\large_text_file.txt";  // Replace with the path to your large file
        byte[] inputBytes = { 0 };
        long startTime = 0, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filePath));
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
          outputStringBuilder.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
}
}