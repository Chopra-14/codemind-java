import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        int a,b,sum=0;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
       while(a>0) {
           b=a%10;
           a=a/10;
           sum=sum+b;
        }
        System.out.printf("%d",sum);
    }
}