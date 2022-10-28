package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai05 {
    public static void main(String[] args){
        //Bai 5: Nhap mot so nguyen, mot so thuc, mot ki tu va mot chuoi ki tu va hien thi len man hinh
        Scanner sc = new Scanner(System.in);
    // Thao tac nhap
        //nhap so nguyen
        System.out.print("Nhap vao mot so nguyen: ");
        int x = sc.nextInt();
        //nhap so thuc
        System.out.print("Nhap vao mot so thuc: ");
        float y = sc.nextFloat();
        //nhap mot ki tu
        System.out.print("Nhap vao mot ki tu: ");
        String c = sc.next(); 
        
        //bo dau enter trong bo dem
        sc.nextLine();
        
        //nhap mot chuoi ki tu
        System.out.print("Nhap vao mot chuoi ki tu: ");
        String s = sc.nextLine();
    // Thao tac xuat
        //in ra mot so nguyen
        System.out.println("So nguyen da nhap: "+x);
        //in ra mot so thuc
        System.out.println("So thuc da nhap: "+y);
        //in ra mot ki tu
        System.out.println("Ki tu da nhap: "+c);
        //in ra mot chuoi ki tu
        System.out.println("Chuoi da nhap: "+s);
    }
}
