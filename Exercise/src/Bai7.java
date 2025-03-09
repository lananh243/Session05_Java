import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int [] NewArray = new int[numbers.length];
        for (int i = 0; i < n; i++) {
            System.out.printf("numbers[%d] : ", i);
            numbers[i] = scanner.nextInt();
        }
        if (numbers.length == 0) {
            System.out.println("Mảng ko có phần tử");
        }else {
            int evenIndex = 0;
            int oddIndex = n - 1;
            for (int num : numbers) {
                if (num % 2 == 0) {
                    NewArray[evenIndex++] = num;
                }else {
                    NewArray[oddIndex--] = num;
                }
            }

            System.out.println("Mảng sau khi sắp xếp:");
            for (int num : NewArray) {
                System.out.print(num + " ");
            }
        }

    }
}
