import java.util.Scanner;
public class fact{
    public static void main(String[] args){
        int n;
        Scanner read = new Scanner(System.in);
        n=read.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0)  System.out.printf("%d ",i);
        }
    }
}