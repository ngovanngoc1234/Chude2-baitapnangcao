package controller;

import model.DienMay;
import model.HangThoiTrang;
import model.KhachHang;
import model.SanPham;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListSP {
    Scanner sc = new Scanner(System.in);
    static ArrayList<SanPham> listSP = new ArrayList<>();

    public void addTT() {
        HangThoiTrang thoiTrang = new HangThoiTrang();
        System.out.println("nhap ten sp");
        String tsp = sc.nextLine();
        thoiTrang.setTsp(tsp);
        System.out.println("nhap hang sx");
        String sx = sc.nextLine();
        thoiTrang.setHangSX(sx);
        System.out.println("nhap ngay sx");
        String ngay = sc.nextLine();
        thoiTrang.setNgaySX(ngay);
        System.out.println("nhap gia sp");
        double gia = Integer.parseInt(sc.nextLine());
        thoiTrang.setGiaSP(gia);
        System.out.println("nhap size");
        int size = Integer.parseInt(sc.nextLine());
        thoiTrang.setSize(size);
        System.out.println("nhap so luong sp");
        int sl = Integer.parseInt(sc.nextLine());
        thoiTrang.setSoLuongTT(sl);

        listSP.add(thoiTrang);
    }

    public void addDM() {
        DienMay dienMay = new DienMay();
        System.out.println("nhap ten sp");
        String tsp = sc.nextLine();
        dienMay.setTsp(tsp);
        System.out.println("nhap hang sx");
        String sx = sc.nextLine();
        dienMay.setHangSX(sx);
        System.out.println("nhap ngay sx");
        String ngay = sc.nextLine();
        dienMay.setNgaySX(ngay);
        System.out.println("nhap gia sp");
        double gia = Integer.parseInt(sc.nextLine());
        dienMay.setGiaSP(gia);
        System.out.println("nhap so luong sp");
        int sl = Integer.parseInt(sc.nextLine());
        dienMay.setSoluongDM(sl);

        listSP.add(dienMay);

    }

    public void showDm() {
        for (SanPham s : listSP) {
            if (s instanceof DienMay) {
                System.out.println(s.toString());
            }
        }
    }

    public void showTT() {
        for (SanPham s : listSP) {
            if (s instanceof HangThoiTrang) {
                System.out.println(s.toString());
            }
        }
    }

    public void search() {
        System.out.println("nhap ten sp can tim");
        String ten = sc.nextLine();
        int index = 0;
        for (int i = 0; i < listSP.size(); i++) {
            if (ten.equals(listSP.get(i).getTsp())) {
                System.out.println("san pham can tinh la " + listSP.get(i));
                index++;
            }
        }
        if (index == 0) {
            System.out.println("khong tim thay sp");
        }
    }

    public void timkiem() {
        System.out.println("Nhập Thông Tin Cần Tìm :");
        String regex = sc.nextLine();
        int index = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < listSP.size(); i++) {
            matcher = pattern.matcher(listSP.get(i).getTsp());
            if (matcher.find()) {
                System.out.println("STT " + i + " : " + listSP.get(i).toString());
                index++;
            }
        }
        if (index <= 0) {
            System.out.println("Tên này không có trong danh sách\n ");
        }
    }
}
