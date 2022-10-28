package oop5102022_HoangXuanQuy_2021604440;
public class Bai02 {
    public static void main(String[] args){
    //Bai 2: Cho biet ket qua bieu thuc logic
        System.out.println("Bai 2: "); 
        
        //a.
        System.out.print("\ta, ");
        boolean x = 2<3||4>3;
        System.out.println(x);
        
        //b,
        System.out.print("\tb, ");
        boolean b = 2<3&&4>3;
        System.out.println(b);
        
        //c, 
        System.out.print("\tc, ");
        boolean c = 2<3&&4<3;
        System.out.println(c);
        
        //d,
        System.out.print("\td, ");
        boolean d = !(2>4);
        System.out.println(d);
        
        //e,
        System.out.print("\te, ");
        boolean e = 2==3;
        System.out.println(e);
        
        //f,
        System.out.print("\tf, ");
        boolean f = 4!=3;
        System.out.println(f);
    }
}
