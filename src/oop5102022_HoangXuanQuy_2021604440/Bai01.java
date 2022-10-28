package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;

public class Bai01 {
    public static void main(String[] args){
        //In dong chao mung
        System.out.println("Thuc hanh bai tap chuong 2 oop by Hoang Xuan Quy");
        
//Bai 1: Cho biet ket qua cua cac bien khi thuc hien cac cau lenh java
        System.out.print("Bai 1: ");
    //a,
        System.out.println("\na, ");
        int i = 5;
        int j = 6;
        int x;
        x = i++ + ++j;
        System.out.println("\ti = "+i);
        System.out.println("\tj = "+j);
        System.out.println("\tx = "+x);

    //b,
        System.out.println("b, ");
        i = 10;
        j = 11;

        x = --i + j--;
        System.out.println("\ti = "+i);
        System.out.println("\tj = "+j);
        System.out.println("\tx = "+x);

    //c,
        System.out.println("c, ");
        i = 5;
        j = 2;
        x = i%j;
        float y = i/j;
        System.out.println("\ti = "+i);
        System.out.println("\tj = "+j);
        System.out.println("\tx = "+x);
        System.out.println("\ty = "+y);

    //d,
        System.out.println("d, ");
        i = 5;
        j = 2;
        float z = (float)i/j;
        System.out.println("\ti = "+i);
        System.out.println("\tj = "+j);
        System.out.println("\tz = "+z);

    //e,    
        System.out.println("e, ");
        i = 5;
        j = 2;
        z = i/(float)j;
        System.out.println("\ti = "+i);
        System.out.println("\tj = "+j);
        System.out.println("\tz = "+z);

    //f,
        System.out.println("f, ");
        i = 5;
        j = 2;
        z = (float)i/(float)j;
        System.out.println("\ti = "+i);
        System.out.println("\tj = "+j);
        System.out.println("\tz = "+z);
    }
}