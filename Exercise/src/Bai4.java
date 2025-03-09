import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("numbers[%d] : ",i);
            numbers[i] = scanner.nextInt();
        }
        if (numbers.length == 0) {
            System.out.println("Kích thước rỗng");
        }else {
            System.out.println("Giá trị của các phần tử trong mảng : ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("%d \t", numbers[n-i-1]);
            }
        }
    }
}
