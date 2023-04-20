package niit.bussiness;

import java.util.Scanner;

public class ProductRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1. Nhập thông tin sản phẩm");
            System.out.println("2. Tính lợi nhuận của sản phẩm");
            System.out.println("3. Hiển thị thông tin sản phẩm");
            System.out.println("5. Thoát");
            scanner.nextInt();
        }
        while (choice!=5);
    }
}
