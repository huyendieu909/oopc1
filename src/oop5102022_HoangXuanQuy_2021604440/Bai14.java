package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai14 {
    public static void main(String[] args){
    //Bai 14: tinh tien dien theo luy ke, in ra
        Scanner sc = new Scanner(System.in);
        
        //Nhap so dien tieu thu
        System.out.print("Nhap so dien tieu thu trong 1 thang cua ho gia dinh: ");
        long soDien = sc.nextInt();
        
        //Tinh tien dien
        long tienDien = 0;
        // so dien <= 50
        if (soDien >= 0 && soDien <= 50){
            tienDien += soDien * 1484;
        }
        // so dien tu 51 den 100
        else if (soDien >= 51 && soDien <= 100){
            tienDien += 50 * 1484 + (soDien - 50) * 1533;
        }
        // so dien tu 101 den 200
        else if (soDien >= 101 && soDien <= 200){
            tienDien += 50 * 1484 + 50 * 1533 + (soDien - 100) * 1786;
        }
        // so dien tu 201 tro len
        else {
            tienDien += 50 * 1484 + 50 * 1533 + 100 * 1786 + (soDien - 200) * 2242;
        }
        
        //in ra tien dien 
        System.out.print("So tien dien phai thanh toan 1 thang cua gia dinh do la: "+tienDien);
    }
}
