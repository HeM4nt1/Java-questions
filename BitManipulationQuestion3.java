import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number");
        int a = sc.nextInt();
        System.out.print("enter the second number");
        int b = sc.nextInt();

        boolean negative = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);

        int result = 0;

        while (b != 0) {
            if ((b & 1) == 1) {
                result += a;
            }
            a <<= 1;
            b >>= 1;
        }

        if (negative)
            result = -result;

        System.out.println("the result is" +result);
    }
}
