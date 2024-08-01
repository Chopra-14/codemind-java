import java.util.Scanner;
public class time{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        System.out.printf("%d Hour(s) %d Minute(s)",(n/60),(n%60));
    }
}