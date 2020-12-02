package model;

public class KhachHang extends Nguoi {
        private String maKH;

    public KhachHang() {}

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public KhachHang(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH='" + maKH + '\'' +
                '}';
    }
}
