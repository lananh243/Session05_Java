import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int[] array = new int[n];


        System.out.println("Nhập các giá trị của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d]  = ",i);
            array[i] = scanner.nextInt();
        }


        int maxSum = array[0];
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += array[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.print("Dãy con là: ");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Tổng lớn nhất của dãy con liên tiếp là: " + maxSum);
    }
}