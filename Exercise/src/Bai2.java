import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("numbers[%d] : ",i);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Giá trị các phần tử trong mảng là:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\t", numbers[i]);
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
