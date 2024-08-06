import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
    int n,N;
    Scanner read=new Scanner(System.in);
    n=read.nextInt();
    N=n*(n+1)/2;
    System.out.printf("%d",N);
}
}