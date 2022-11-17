import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input a String");
        String w=in.next();
        for (int i = w.length()-1; i >=0; i--) {
            System.out.print(w.charAt(i));
            }
    }
}
