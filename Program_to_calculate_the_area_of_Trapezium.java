import java.util.Scanner;
public class Trap{
    public static void main(String[] args){
        int a,b,h;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        h=read.nextInt();
        float s=(h*(a+b))/2.0f;
        System.out.printf("%.4f",s);
    }
}