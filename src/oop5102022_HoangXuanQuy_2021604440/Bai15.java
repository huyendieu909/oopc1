package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai15 {
    public static void main(String[] args){
    //Bai 15: nhap ngay luu tru, in ra gia tien
        Scanner sc = new Scanner(System.in);
        
        //nhap ngay 
        System.out.print("Nhap vao so ngay luu tru: ");
        int day = sc.nextInt();
        //nhap don gia
        System.out.println("Don gia: ");
        int donGia = sc.nextInt();
        
        //tinh tien 
        int price = 0;
        //neu o 1 ngay
        if (day == 1){
            price += donGia;
        }
        //o tu 2 den 4 ngay
        else if (day >= 2 && day <= 4){
            price += donGia + (day - 1)*donGia*(1-20/100);
        }
        //o tu 5 den 10 ngay
        else if (day >= 5 && day <= 10){
            price += donGia + 3*donGia*(1-20/100) + (day-4)*donGia*(1-40/100);
        }
        //o tu 11 ngay tro len
        else {
            price += donGia + 3*donGia*(1-20/100) + 6*donGia*(1-40/100) + (day-10)*donGia*(1-60/100);
        }
        
        //in ra ket qua
        System.out.println("Tien phong phai thanh toan la: "+price);
    }
}
