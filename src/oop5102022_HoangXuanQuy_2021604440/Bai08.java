package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai08 {
    public static void main(String[] args){
    //Bai 8: in tong cac so chan tu 1 den 100
        // khai bao bien
        int sum = 0;
        // tinh tong can tim
        for (int i=2;i<=100;i+=2){
            sum += i;
        }
        // in ra man hinh ket qua
        System.out.println("Tong cac so chan tu 1 den 100 la: "+sum);
    }
}
