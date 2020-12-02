package model;

public class DienMay extends SanPham {
    private int soluongDM;

    public DienMay() {
    }

    public int getSoluongDM() {
        return soluongDM;
    }

    public void setSoluongDM(int soluongDM) {
        this.soluongDM = soluongDM;
    }

    public DienMay(int soluongDM) {
        this.soluongDM = soluongDM;
    }

    @Override
    public String toString() {
        return "DienMay{" +
                "soluongDM=" + soluongDM +
                '}';
    }
}
