import java.util.Scanner;

class MultiplyBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int x = sc.nextInt();

        int result = (x << 3) - x;

        System.out.println("the result is"+result);
    }
}
