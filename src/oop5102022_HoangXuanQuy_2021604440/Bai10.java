package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai10 {
    public static void main(String[] args){
    //Bai 10: nhap hai canh hinh chu nhat, tinh chu vi va dien tich
        // Nhap 2 canh a,b:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hai canh a,b cua hinh chu nhat: ");
        System.out.print("\tNhap a: ");
        float a = sc.nextFloat();
        System.out.print("\tNhap b: ");
        float b = sc.nextFloat();
        //tinh chu vi, in ra
        float chuvi = (a+b)*2;
        System.out.println("Chu vi hinh chu nhat do la: "+chuvi);
        //tinh dien tich, in ra
        float dientich = a*b;
        System.out.println("Dien tich hinh chu nhat do la: "+dientich);
    }
}
