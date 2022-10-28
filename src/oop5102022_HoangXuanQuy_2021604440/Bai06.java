package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai06 {
    public static void main(String[] args){
    //Bai 6: nhap vao hai so nguyen. tinh tong hieu tich thuong
        //Nhap hai so
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao hai so a,b: ");
        //nhap so a
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        //nhap so b
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        
        //tinh tong
        int tong = a+b;
        //tinh hieu
        int hieu = a-b;
        //tinh tich
        int tich = a*b;
        //tinh thuong 
        int thuong = a/b;
        
        //in kq
        //in tong 
        System.out.println("a + b = "+tong);
        //in hieu
        System.out.println("a - b = "+hieu);
        //in tich
        System.out.println("a * b = "+tich);
        //in thuong
        System.out.println("a / b = "+thuong);
    }
}
