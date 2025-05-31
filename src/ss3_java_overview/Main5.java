package ss3_java_overview;

import java.util.Scanner;

public class Main5 {
    // main
    public static void main(String[] args) {
        int x = 2;

        Scanner scanner = new Scanner(System.in);
        // System.in: Tiêu chuẩn để nhập dữ liệu từ bàn phím



        /*
        * Nhập tên và tuôi sau đó xuất thông tin
        * */

        System.out.print("Nhập vào tuổi của bạn: ");
        int age = Integer.parseInt(scanner.nextLine()); // 10 enter

        // scanner.nextLine(); // Xóa dấu enter
        System.out.print("Nhập vào tên của bạn: ");
        String name = scanner.nextLine(); // Nhập vào 1 chuỗi

        System.out.println("Tên của bạn là: " + name);
        System.out.println("Tuổi của bạn là: " + age);
    }
}
