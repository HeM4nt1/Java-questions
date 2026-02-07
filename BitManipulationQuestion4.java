import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to divivde");
        int dividend = sc.nextInt();
        System.out.print("enter the number with which you want to divide");
        int divisor = sc.nextInt();

        boolean negative = (dividend < 0) ^ (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((dividend >> i) >= divisor) {
                dividend -= divisor << i;
                quotient |= (1 << i);
            }
        }

        if (negative)
            quotient = -quotient;

        System.out.println("the result is "+ quotient);
    }
}
