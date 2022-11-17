import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number");
        int a = in.nextInt();
        int b=0;
        while (a != 0) {
            b=a%2;
            System.out.println(b);
            a=a/2;
        }
    }
}