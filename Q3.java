import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input a String");
        String w=in.next();
        for (int i = 0; i <w.length(); i++) {
            char a;
            System.out.println(w.charAt(i));
        }
    }
}