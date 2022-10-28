package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai24 {
    //Bai 24: tim sinh vien co diem da nhap truoc
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhap so sinh vien
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        //tao, nhap mang diem 
        System.out.println("Nhap mang diem sinh vien: ");
        int diem[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("\tDiem sinh vien thu "+(i+1)+": ");
            diem[i] = sc.nextInt();
        }
        //tim kiem
        System.out.print("Nhap mot diem bat ki: ");
        int x = sc.nextInt();
        System.out.print("Sinh vien co diem trung voi diem vua nhap la: ");
        for (int i=0;i<n;i++){
            if (diem[i] == x) System.out.print((i+1)+" ");
        }
    }
}
