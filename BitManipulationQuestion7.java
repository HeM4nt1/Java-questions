import java.util.Scanner;

class Comparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number");
        int a = sc.nextInt();
        System.out.print("enter the second number");
        int b = sc.nextInt();

        int diff = a - b;
        int sign = (diff >> 31) & 1;

        int max = a - sign * diff;

        System.out.println("the maximum number is "+ max);
    }
}
