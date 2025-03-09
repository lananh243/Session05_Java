import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();


        int[] markingArray = new int[1000];
        int[] originalArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("originalArray[%d] : ", i);
            originalArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            markingArray[originalArray[i]]++;
        }

        int maxCount = 0;
        int mostFrequentValue = -1;
        for (int i = 1; i < markingArray.length; i++) {
            if (markingArray[i] > maxCount) {
                maxCount = markingArray[i];
                mostFrequentValue = i;
            }
        }
        if (mostFrequentValue != -1) {
            System.out.printf("%d xuất hiện %d lần\n", mostFrequentValue, maxCount);
        } else {
            System.out.println("Không có phần tử nào.");
        }
    }
}
