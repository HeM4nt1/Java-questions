import java.util.Scanner;

class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();

        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println("the number is in the power of 2");
        else
            System.out.println("the number is not in the power of 2");
    }
}
