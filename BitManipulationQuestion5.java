import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number ");
        int a = sc.nextInt();
        System.out.print("eenter the second number");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("now first number is " + a);
        System.out.println("noe the second number is " + b);
    }
}
