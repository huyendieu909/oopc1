package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai11 {
    public static void main(String[] args){
        //Bai 11: nhap ban kinh hinh tron, tinh chu vi dien tich
        //nhap ban kinh 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        float r = sc.nextFloat();
        //tinh chu vi, in ra
        float chuvi = 3.1415926536f * 2 * r;
        System.out.println("Chu vi hinh tron do la: "+chuvi);
        //tinh dien tich, in ra
        float dientich = 3.1415926536f * r * r;
        System.out.println("Dien tich hinh tron do la: "+dientich);
    }
}
