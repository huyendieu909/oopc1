package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai07 {
    public static void main(String[] args){
    //Bai 7: viet chuong trinh nhap vao 2 so thuc va 1 trong 4 ki tu A,S,M,D va thuc hien cong viec
        Scanner sc = new Scanner(System.in);
        
        // nhap vao hai so thuc
        System.out.println("Nhap 2 so thuc x,y: ");
        System.out.print("\tNhap x: ");
        float x = sc.nextFloat();
        System.out.print("\tNhap y: ");
        float y = sc.nextFloat();
        
        // nhap ki tu
        System.out.print("Nhap ki tu ");
        char c = Character.toUpperCase(sc.next().charAt(0));
        
        //thuc hien cong viec
        switch (c) {
            // tinh tong hai so x y, hien thi ra man hinh
            case ('A'): 
                float tong = x+y;
                System.out.println("x + y = "+tong);
                break;
            //tinh hieu 2 so x y, in ra man hinh
            case ('B'):
                float hieu = x-y;
                System.out.println("x - y = "+hieu);
                break;
            //tinh tich 2 so x y, in ra man hinh
            case ('C'):
                float tich = x*y;
                System.out.println("x * y = "+tich);
                break;
            //tinh thuong 2 so x y, in ra man hinh
            case ('D'):
                float thuong = x/y;
                System.out.println("x / y = "+thuong);
                break;
            //thong bao nhap sai ki tu
            default: 
                System.out.println("Ki tu vua nhap khong hop le");
        }
    }
}
