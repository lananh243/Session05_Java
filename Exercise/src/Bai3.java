import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("numbers[%d] = ",i);
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Giá trị các phần tử trong mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d \t", numbers[i]);
            if (numbers[i] % 2 == 0) {
                countEven ++;
            }
        }
        System.out.println();
        System.out.println("Tổng số lượng số chẵn trong mảng : "+countEven);
    }
}
