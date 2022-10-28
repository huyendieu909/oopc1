package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai09 {
    public static void main(String[] args){
        //Bai 9: in tong cac so le tu 1 den 100
        // khai bao bien
        int sum = 0;
        // tinh tong can tim
        for (int i=1;i<=99;i+=2){
            sum += i;
        }
        // in ra man hinh ket qua
        System.out.println("Tong cac so le tu 1 den 100 la: "+sum);
    }
}
