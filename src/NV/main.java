package NV;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte chon = 0;
        do {
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Hiển thị thông tin tất cả nhân viên");
            System.out.println("3. Tìm kiếm nhân viên theo mã nv");
            System.out.println("4. Sắp xếp nhân viên theo tên");
            System.out.println("5. Thoát");
            chon = scanner.nextByte();
            while (chon < 1 || chon > 5) {
                System.out.println("Xin mời nhập lại");
                chon = scanner.nextByte();
            }
            QLNV qlnv = new QLNV();
            switch (chon) {
                case 1: {
                    qlnv.nhapThongTinNV();
                    break;
                }
                case 2: {
                    qlnv.hienThiThongTinNV();
                    break;
                }
                case 3: {
                    System.out.println("Nhập MaNV cần tìm:");
                    scanner.nextLine();
                    String maNV = scanner.nextLine();
                    NhanVien nv = qlnv.timKiemNVtheoMaNV(maNV);
                    if (nv == null) System.out.println("Không tồn tại Nhân Viên");
                    else System.out.println(nv);
                    break;
                }
                case 4: {
                    qlnv.sapXepNVTheoTen();
                    System.out.println("Sắp xếp thành công");
                    qlnv.hienThiThongTinNV();
                    break;
                }
            }
            System.out.println("***************************************");
        } while (chon != 5);

    }
}
