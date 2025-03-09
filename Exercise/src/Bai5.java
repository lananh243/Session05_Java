import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("numbers [%d] : ", i);
            numbers[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean isFlag = false;
        System.out.println("Giá trị của các phần tử trong mảng : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d \t", numbers[i]);
            if (numbers[i] % 2 == 1) {
                isFlag = true;
                if (max < numbers[i]) {
                    max = numbers[i];
                }
                if (min > numbers[i]) {
                    min = numbers[i];
                }
            }
        }
        System.out.println();
        if (isFlag) {
            System.out.println("Phần tử lẻ nguyên dương lớn nhất : "+max);
            System.out.println("Phần tử lẻ nguyên dương nhỏ nhất : "+min);
        }else {
            System.out.println("Không có phần tử lẻ trong mảng");
        }

    }
}
