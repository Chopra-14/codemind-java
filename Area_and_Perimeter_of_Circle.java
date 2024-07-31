import java.util.Scanner;
public class circle{
    public static void main(String[] args){
        float a,p;
        Scanner read=new Scanner(System.in);
        float n=read.nextFloat();
        a=3.14f*n*n;
        p=2*3.14f*n;
        System.out.printf("%.2f
",a);
        System.out.printf("%.2f",p);
    }
}