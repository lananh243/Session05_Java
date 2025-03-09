import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("numbers[%d] = ",i);
            numbers[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        System.out.println("Giá trị các phần tử trong mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", numbers[i]);

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println();

        System.out.println("Giá trị lớn nhất là : "+max);

    }
}
