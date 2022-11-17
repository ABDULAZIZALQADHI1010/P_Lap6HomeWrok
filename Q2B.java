import java.util.Scanner;

public class Q2B {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input the first number");
        int num1=in.nextInt();
        System.out.println("input the last number");
        int num2=in.nextInt();
        int oddSum=0;
        for (int i = num1; i <=num2 ; i++) {
            if ((i%2)!=0)
                oddSum+=i;
            else
                oddSum+=0;
        }
        System.out.println("Sum of odd numbers\t"+oddSum);
    }
}