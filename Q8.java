import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input a number");
        int i=in.nextInt();
        boolean flag=false;
        for (int j = 2; j <= i; j+=2) {
            if (j%2==0){
                System.out.println(j);

            }else {
                System.out.println("");

            }
        }
    }
}