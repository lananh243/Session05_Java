import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
//        1. Nhập số phần tử , khai báo mảng , nhập giá trị
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng : ");
        int size =  scanner.nextInt();

        int[] oldArray  = new int[size];
        for (int i = 0; i < oldArray.length; i++) {
            System.out.printf("oldArray[%d] : ", i);
            oldArray[i] = scanner.nextInt();
        }
//        Nhập gtri và chỉ số cần chèn vào mảng
        System.out.println("Nhập vào giá trị phần tử cần chèn : ");
        int value = scanner.nextInt();
        System.out.println("Nhập vào chỉ số phần tử cần chèn : ");
        int index =  scanner.nextInt();
        int[] newArray;
//        Thực hiện chèn phần tử vào mảng
        if (index < 0) {
            newArray = new int[index + 1];
//            Copy các phần tử mảng cũ sang mảng mới
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
            }
            System.out.println("Ko tồn tại chỉ số"+index);
        }else if (index < oldArray.length) {
//            Khai báo mảng mới có số phân tử = số phần tử mảng cũ + 1
             newArray = new int[oldArray.length + 1];
//            Copy các phần tử từ old --> new và chèn phần tử vào mảng
            for (int i = 0; i < newArray.length; i++) {
                if (i < index){
                    newArray[i] = oldArray[i];
                } else if (i == index) {
                    newArray[i] = value;
                } else {
                    newArray[i] = oldArray[i-1];
                }
            }
        }else {
            newArray = new int[index + 1];
//            Copy các phần tử mảng cũ sang mảng mới
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
            }
//            Gán giá trị phần tử index với giá trị là value
            newArray[index] = value;
        }
//        in ra mảng sau khi chèn
        System.out.println("Các mảng sau khi chèn phần tử : ");
        for (int element: newArray) {
            System.out.printf("%d", element);

        }
    }
}
