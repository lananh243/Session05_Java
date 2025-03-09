import java.util.Scanner;

public class Mang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số dòng của mảng 2 chiều : ");
        int n = scanner.nextInt();
        System.out.println("Nhập số cột của mảng 2 chiều : ");
        int m = scanner.nextInt();

        int[][] numbers = new int[n][m];

        do {
            System.out.println("1. Nhập giá trị các phần tử của mảng 2 chiều");
            System.out.println("2. Hiển thị mảng 2 chiều");
            System.out.println("3. Kiểm tra sự tồn tại của 1 giá trị");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            System.out.printf("numbers[%d][%d] : ",i,j);
                            numbers[i][j] = scanner.nextInt();

                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            System.out.printf("%3d", numbers[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào 1 giá trị cần tim : ");
                    int seachValue = scanner.nextInt();
                    boolean isExit = false;
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            if (seachValue == numbers[i][j]) {
                                System.out.println("Bingo");
                                isExit = true;
                                break;
                            }
                        }
                    }
                    if (!isExit) {
                        System.out.printf("Ko tồn tại giá trị %d trong mảng \n", seachValue);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1 - 4");
            }
        }while (true);
    }
}
