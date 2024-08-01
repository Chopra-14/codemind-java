import java.util.Scanner;
public class Chocolates{
    public static void main(String[] args){
     int x,y,z,a;
    Scanner read=new Scanner(System.in);
    x=read.nextInt();
    y=read.nextInt();
    z=read.nextInt();
    a=((x*5)+(y*10))/z;
    System.out.println(a);
    }
}