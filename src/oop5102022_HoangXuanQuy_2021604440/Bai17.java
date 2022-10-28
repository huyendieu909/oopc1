package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai17 {
    //Bai 17: 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // tim cac so dang abc tu 100 den 999 thoa man de
        System.out.println("Cac so thoa man de bai la: ");
        for (int a=1;a<=9;a++){
            for (int b=0;b<=9;b++){
                for (int c=0;c<=9;c++){
                    if (a*a*a + b*b*b + c*c*c == a*100+b*10+c){
                        System.out.print(a);
                        System.out.print(b);
                        System.out.print(c);
                        System.out.println();
                    }
                }
            }
        }
    }
}
