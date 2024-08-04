import java.util.Scanner;
public class area{
    public static void main(String[] args){
        int b,h,a;
        Scanner read = new Scanner(System.in);
        b=read.nextInt();
        h=read.nextInt();
        a=(h*b)/2;
        System.out.println(a);
    }
}