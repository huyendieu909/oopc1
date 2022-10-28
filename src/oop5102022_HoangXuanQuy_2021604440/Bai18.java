package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
import java.lang.Math;
public class Bai18 {
    //Bai 18: nhap so nguyen in ra xem co phai so nguyen to khong
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Nhap so
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        //ktr nguyen to
        int ngt = 0;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) ngt++;
        }
        //in kq
        if (ngt == 0){
            System.out.println("La so nguyen to");
        }
        else {
            System.out.println("Khong phai so nguyen to");
        }
    }
}
