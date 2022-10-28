package oop5102022_HoangXuanQuy_2021604440;
import java.util.*;
public class Bai16 {
    public static void main(String[] args){
    //Bai 16: tinh giai thua
        // nhap n
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        long n = sc.nextLong();
        //tinh giai thua
        long result = 1;
        for (long i = 2;i<=n;i++){
            result *= i;
        }
        //in kq
        System.out.println("n! = "+result);
    }
}
