package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai12 {
    public static void main(String[] args){
        //Bai 12: nhap diem thi theo thang 100, hien thi loai cua sinh vien do
        
        //Nhap diem thi
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem thi cua sinh vien: ");
        int diem = sc.nextInt();
        
        //Hien thi loai
        //90 den 100
        if (diem >= 90 && diem <= 100) {
            System.out.println("Sinh vien do xep loai A");
        }
        //80 den 90
        else if (diem >= 80 && diem < 90){
            System.out.println("Sinh vien do xep loai B");
        }
        //70 den 80
        else if (diem >= 70 && diem < 80){
            System.out.println("Sinh vien do xep loai C");
        }
        //50 den 70
        else if (diem >= 50 && diem < 70){
            System.out.println("Sinh vien do xep loai D");
        }
        //nho hon 50
        else {
            System.out.println("Sinh vien do xep loai F");
        }
    }
}
