import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị các phần tử : ");
        int n = Integer.parseInt(scanner.nextLine());
        int currentIndex = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhập phần tử thứ currentIndex[%d] : ",(currentIndex + 1));
            numbers[currentIndex] = Integer.parseInt(scanner.nextLine());
            currentIndex++;
        }
        int sum = 0;
//        for (int i = 0; i < currentIndex; i++) {
//            System.out.print( numbers[i] + " ");
//            if (numbers[i] %3 == 0) {
//                sum += numbers[i];
//            }
//        }
//        System.out.println();
//        System.out.println("Tính tổng các số chia hết cho 3 : "+sum);

        boolean isFlag = false;
        for (int i = 0; i < currentIndex; i++) {
            isFlag = true;
            if (numbers[i] < 2) {
                isFlag = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                    if (numbers[i] % j == 0) {
                        isFlag = false;
                        break;
                    }
                }
            }
            if (isFlag){
                System.out.printf("%d\t",numbers[i]);
                sum += numbers[i];
            }
            System.out.println();
        }

        System.out.println("Tính tổng các số nguyên tố : "+sum);
    }
}
