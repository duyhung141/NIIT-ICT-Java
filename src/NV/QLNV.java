package NV;

import java.util.*;

public class QLNV {
    private static List<NhanVien> lnv = new ArrayList<NhanVien>(Arrays.asList(
            new NhanVien("NV01", "Trần Văn B", 30, 10000),
            new NhanVien("NV02", "Trần Văn A", 30, 10000),
            new NhanVien("NV03", "Trần Văn C", 30, 10000),
            new NhanVien("NV04", "Nguyễn Thị A", 25, 8000),
            new NhanVien("NV05", "Nguyễn Thị C", 25, 8000),
            new NhanVien("NV06", "Nguyễn Thị B", 25, 8000),
            new NhanVien("NV07", "Lê Minh A", 35, 12000),
            new NhanVien("NV08", "Lê Minh B", 35, 12000),
            new NhanVien("NV09", "Lê Minh C", 35, 12000)
    ));

    public void nhapThongTinNV() {
        Scanner scanner = new Scanner(System.in);
        String maNV = "NV";
        int id = lnv.size()+1;
        if (id < 10) maNV = maNV + "0" + Integer.toString(id);
        else maNV += Integer.toString(id);

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
