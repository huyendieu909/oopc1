package oop5102022_HoangXuanQuy_2021604440;
public class Bai03 {
    public static void main(String[] args){
        //Bai 2: Cho biet ket qua khi thuc hien cac phep toan thao tac bit 
        System.out.println("Bai 3: ");
        System.out.println("\ta = 10");
        int a = 0x000A;
        System.out.println("\tb = 100");
        int b = 0x0064;
        //a,
        System.out.print("\ta, ");
        int xa = a|b;
        System.out.println(xa);
        
        //b,
        System.out.print("\tb, ");
        int xb = a&b;
        System.out.println(xb);
        
        //c, 
        System.out.print("\tc, ");
        int xc = a^b;
        System.out.println(xc);
        
        //d,
        System.out.print("\td, ");
        int xd = ~a;
        System.out.println(xd);
        
        //e, 
        System.out.print("\te, ");
        int xe = a>>2;
        System.out.println(xe);
        
        //f,
        System.out.print("\tf, ");
        int xf = b<<2;
        System.out.println(xf);
    }
}
