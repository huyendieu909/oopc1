
package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai20 {
    //Bai 20: nhap do C doi ra F
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhap do c
        System.out.print("Nhap do C: ");
        float c = sc.nextFloat();
        //doi ra f
        float f = c * 1.8f + 32;
        // in kq
        System.out.print("Doi ra do f duoc: "+f);
    }
}
