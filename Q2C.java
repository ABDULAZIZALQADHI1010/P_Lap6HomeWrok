import java.util.Scanner;

public class Q2C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number that is :1>&<1000000");
        int a = in.nextInt();
        if (a == 0)
            System.out.println("not a statement");
        else {
            for (int i = 0; i<100; i++) {
                if (a >= 10 && a < 100) {
                    a = a % 10;
                    System.out.println("\n" + a % 10);
                } else if (a >= 100 && a < 1000) {
                    a = a % 100;
                    System.out.println("\n" + a % 100);
                } else if (a >= 1000 && a < 10000) {
                    a = a % 1000;
                    System.out.println("\n" + a % 1000);
                } else if (a >= 10000 && a < 100000) {
                    a = a % 10000;
                    System.out.println("\n" + a % 10000);
                } else if (a >= 100000 && a < 1000000) {
                    a = a % 100000;
                    System.out.println("\n" + a % 100000);
                } else if (a >= 1000000) {
                    System.out.println("out of bounds");

                }

            }
        }
    }
}