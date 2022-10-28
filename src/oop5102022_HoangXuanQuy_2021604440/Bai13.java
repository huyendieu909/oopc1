package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai13 {
    public static void main(String[] args){
    //Bai 13: Nhap gia ban, % giam gia, hien thi gia ban sau khi giam
        //Nhap gia ban dau
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia ban dau cua san pham: ");
        double priceFirst = sc.nextDouble();
        //Nhap % giam gia 
        System.out.print("Phan tram giam gia: ");
        double percentDiscount = sc.nextDouble();
        //Hien thi gia sau khi giam
        double price = priceFirst * (1 - percentDiscount/100);
        System.out.print("Gia ban sau khi giam la: "+price);
    }
}
