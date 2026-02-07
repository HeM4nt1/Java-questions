import java.util.Scanner;

class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter thefirst element");
        int a = sc.nextInt();
        System.out.println("enter the second element");
        int b = sc.nextInt();

        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }

        System.out.println("the answer is "+a);
    }
}
