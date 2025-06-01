package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

/*
Tính tuổi
 */
public class Main6 {
    // main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào năm sinh của bạn: ");
        int year = scanner.nextInt();

        System.out.println("Tuổi của bạn là: " + (Year.now().getValue() - year));
        // How to get curret year in java
    }
}
