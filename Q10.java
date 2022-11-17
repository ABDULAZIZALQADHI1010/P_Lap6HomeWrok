import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float value=0;
        System.out.println("input today price for one dollar in japanese yen ");
        float price=in.nextFloat();
        System.out.println("input a value in dollar to be converted to yen");
        value=in.nextFloat();
        float result=value*price;
        System.out.println("$"+value+"\tequal\t "+result+"yen");
    }
}
