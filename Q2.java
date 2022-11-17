public class Q2 {
    public static void main(String[] args) {
        int evenSum=0;
        for (int i = 2; i <=100 ; i++) {
            if((i%2)==0)
                evenSum+=i;
            else
                evenSum+=0;
        }
        System.out.println("Sum of even numbers\t"+evenSum);
    }
}
