package NV;

public class NhanVien implements Comparable<NhanVien> {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, int tuoi, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                '}';
    }

    @Override
    public int compareTo(NhanVien nv2) {
        String[] ten1 = this.getTenNV().split(" ");
        String[] ten2 = nv2.getTenNV().split(" ");
        String tenCuoi1 = ten1[ten1.length - 1];
        String tenCuoi2 = ten2[ten2.length - 1];
        return tenCuoi1.compareTo(tenCuoi2);
    }
}
