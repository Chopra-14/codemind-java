import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        float s,h,d,pf,g;
        Scanner read = new Scanner(System.in);
        s=read.nextFloat();
        h=read.nextFloat();
        d=read.nextFloat();
        pf=12*s/100;
        g=h+s+pf+d;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",g);
    }
}
