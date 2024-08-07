import java.util.Scanner;
public class Str{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        int length = str.length();
        System.out.printf("%d
", length);
    }
}