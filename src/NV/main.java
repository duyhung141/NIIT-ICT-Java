package NV;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte choice = 0;
        do {
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Hiển thị thông tin tất cả nhân viên");
            System.out.println("3. Tìm kiếm nhân viên theo mã employee");
            System.out.println("4. Sắp xếp nhân viên theo tên");
            System.out.println("5. Thoát");
            choice = scanner.nextByte();
            while (choice < 1 || choice > 5) {
                System.out.println("Xin mời nhập lại");
                choice = scanner.nextByte();
            }
            EmployeeManager employeeManager = new EmployeeManager();
            switch (choice) {
                case 1: {
                    employeeManager.input();
                    break;
                }
                case 2: {
                    employeeManager.display();
                    break;
                }
                case 3: {
                    System.out.println("Nhập id cần tìm:");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    Employee employee = employeeManager.searchById(id);
                    if (employee == null) System.out.println("Không tồn tại Nhân Viên");
                    else System.out.println(employee);
                    break;
                }
                case 4: {
                    employeeManager.sortByName();
                    System.out.println("Sắp xếp thành công");
                    employeeManager.display();
                    break;
                }
            }
            System.out.println("***************************************");
        } while (choice != 5);
    }
}
