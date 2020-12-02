package model;

public class SanPham {
    private String tsp;
    private double giaSP;
    private String hangSX;
    private String ngaySX;

    public SanPham() {
    }


    public String getTsp() {
        return tsp;
    }

    public void setTsp(String tsp) {
        this.tsp = tsp;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }


    public SanPham(String tsp, double giaSP, String hangSX, String ngaySX) {
        this.tsp = tsp;
        this.giaSP = giaSP;
        this.hangSX = hangSX;
        this.ngaySX = ngaySX;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tsp='" + tsp + '\'' +
                ", giaSP=" + giaSP +
                ", hangSX='" + hangSX + '\'' +
                ", ngaySX='" + ngaySX + '\'' +
                '}';
    }
}
