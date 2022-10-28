package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
import java.lang.Math;
public class Bai23 {
    //Bai 23: nhap diem sinh vien vao mang, in ra man hinh diem cao nhat, sv co diem cao nhat, diem cua tat ca sinh vien theo chieu tang dan
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhap so sinh vien
        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();
        //tao va nhap mang diem
        int diem[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap diem cua sinh vien thu "+(i+1)+": ");
            diem[i] = sc.nextInt();
        }
        //tim diem cao nhat va sinh vien co diem cao nhat
        int maxDiem = 0; // maxDiem de luu diem cao nhat
        for (int i=0;i<n;i++){
            maxDiem = Math.max(maxDiem,diem[i]);
        }
        
        //in ket qua
        System.out.println("Diem cao nhat: "+maxDiem);
        System.out.print("Sinh vien co diem cao nhat: ");
        for (int i=0;i<n;i++){
            if (diem[i] == maxDiem) System.out.print((i+1)+" ");
        }
        System.out.println();
        //sap xep theo thu tu tang dan diem so 
        Arrays.sort(diem);
        System.out.print("Danh sach sinh vien theo chieu tang dan diem so: ");
        for (int i=0;i<n;i++){
            System.out.print(diem[i]+" ");
        }
    }
}
