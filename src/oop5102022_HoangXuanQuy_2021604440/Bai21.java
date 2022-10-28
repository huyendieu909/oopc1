package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai21 {
    //Bai 21: nhap mang va hien thi
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhap n
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        //nhap mang a
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu "+i+": ");
            a[i] = sc.nextInt();
        }
        //in mang 
        System.out.print("Mang vua nhap: \n");
        for (int i=0;i<n;i++){
            System.out.println("\ta["+i+"] = "+a[i]);
        }
    }
}