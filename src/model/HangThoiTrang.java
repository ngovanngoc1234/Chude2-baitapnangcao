package model;

public class HangThoiTrang extends SanPham {
    private int size;
    private int soLuongTT;

    public HangThoiTrang() {
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSoLuongTT() {
        return soLuongTT;
    }

    public void setSoLuongTT(int soLuongTT) {
        this.soLuongTT = soLuongTT;
    }

    public HangThoiTrang(int size, int soLuong) {
        this.size = size;
        this.soLuongTT = soLuong;
    }

    @Override
    public String toString() {
        return "HangThoiTrang{" +
                "size=" + size +
                ", soLuong=" + soLuongTT +
                '}';
    }
}
