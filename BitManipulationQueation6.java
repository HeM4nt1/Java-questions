import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you wan to classify");
        int n = sc.nextInt();

        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
