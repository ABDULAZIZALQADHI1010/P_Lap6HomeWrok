import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int vowels=0;
        Scanner in=new Scanner(System.in);
        System.out.println("input a String");
        String p=in.next();
        for (int i = 0; i <p.length() ;i++) {
            if (p.charAt(i)=='a'||p.charAt(i)=='e'||p.charAt(i)=='i'||p.charAt(i)=='o'||p.charAt(i)=='u'||p.charAt(i)=='y')
                vowels++;
        }
        System.out.println("vowels = "+vowels);
    }
}
