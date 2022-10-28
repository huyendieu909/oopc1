package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai19 {
    //Bai 19: nhap gio phut giay doi ra giay
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Nhap gio
        System.out.print("Nhap so gio: ");
        int gio = sc.nextInt();
        //Nhap phut
        System.out.print("Nhap so phut: ");
        int phut = sc.nextInt();
        //Nhap giay
        System.out.print("Nhap so giay: ");
        int giay = sc.nextInt();
        //tinh toan 
        int sum = gio*3600+phut*60+giay;
        //in kq
        System.out.println("Tong so giay la: "+sum);
    }
}
