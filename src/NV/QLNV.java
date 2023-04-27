package NV;

import java.util.*;

public class QLNV {
    private static List<NhanVien> lnv = new ArrayList<NhanVien>(Arrays.asList(
            new NhanVien("NV001", "Trần Văn A", 30, 10000000),
            new NhanVien("NV001", "Trần Văn B", 30, 10000000),
            new NhanVien("NV001", "Trần Văn C", 30, 10000000),
            new NhanVien("NV002", "Nguyễn Thị A", 25, 8000000),
            new NhanVien("NV002", "Nguyễn Thị B", 25, 8000000),
            new NhanVien("NV002", "Nguyễn Thị C", 25, 8000000),
            new NhanVien("NV003", "Lê Minh A", 35, 12000000),
            new NhanVien("NV003", "Lê Minh B", 35, 12000000),
            new NhanVien("NV003", "Lê Minh C", 35, 12000000)
    ));

    public void nhapThongTinNV() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MaNV: ");
        String maNV = scanner.nextLine();
        System.out.println("TenNV: ");
        String tenNV = scanner.nextLine();
        System.out.println("Tuoi: ");
        int tuoi = scanner.nextInt();
        System.out.println("Luong: ");
        double luong = scanner.nextDouble();
        NhanVien nv = new NhanVien(maNV, tenNV, tuoi, luong);
        lnv.add(nv);
    }

    public void hienThiThongTinNV() {
        for (NhanVien nv : lnv) {
            System.out.println(nv);
        }
    }

    public NhanVien timKiemNVtheoMaNV(String maNV) {
        for (NhanVien nv : lnv) {
            if (nv.getMaNV().equals(maNV)) return nv;
        }
        return null;
    }

    public void sapXepNVTheoTen() {
        Collections.sort(lnv);
    }


}
