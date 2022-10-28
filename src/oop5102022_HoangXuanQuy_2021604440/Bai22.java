package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai22 {
    //Bai 22: Tinh tong cac phan tu mang
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhap so phan tu mang
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        //tao va nhap mang
        int a[] = new int[n];
        for (int i = 0;i < n;i++){
            System.out.print("\tNhap a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        //tinh tong mang
        int tong = 0;
        for (int i=0;i<n;i++){
            tong += a[i];
        }
        //in ket qua
        System.out.println("Tong gia tri cac phan tu mang la: "+tong);
    }
}
