import java.util.Scanner;
import java.util.ArrayList;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int[] numbers = new int[n];
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("numbers[%d]: ", i);
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < n; j++) {
                if (numbers[i] == numbers[j] && i != j) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueNumbers.add(numbers[i]);
            }
        }

        if (uniqueNumbers.isEmpty()) {
            System.out.println("Không có phần tử nào duy nhất trong mảng");
        } else {
            System.out.println("Mảng sau khi đã loại bỏ các phần tử trùng lặp:");
            for (int num : uniqueNumbers) {
                System.out.print(num + " ");
            }
        }
    }
}