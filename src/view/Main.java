package view;

import controller.ListSP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListSP listSP = new ListSP();
        int n = 9;
        do {
            System.out.println("chon chuc nang");
            System.out.println("1: them hang thoi trang");
            System.out.println("2: them dien may");
            System.out.println("3: tim kiem thuong");
            System.out.println("4: tim kiem gan nhat");
            System.out.println("5 : thoat");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    listSP.addTT();
                    break;
                case 2:
                    listSP.addDM();
                    break;
                case 3:
                    listSP.search();
                    break;
                case 4:
                    listSP.timkiem();
                    break;
            }
        }while (n!=5);
    }
}
