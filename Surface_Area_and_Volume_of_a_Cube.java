import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        int a,s,v;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        s = 6*a*a;
        v = a*a*a;
        System.out.printf("Surface area = %d and Volume = %d", s, v);
    }
}
