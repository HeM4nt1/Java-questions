import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter ending number: ");
        int num2 = sc.nextInt();

        boolean b = true;

        if (num1 < 1) {
            if (num2 <= 2) {
                System.out.println("there is no prime number between the first number and second number");
            } else {
                System.out.println("the prime numbers between first number and second number are");
                for (int i = 2; i < num2; i++) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            b = false;
                            break;
                        }
                    }
                    if (b)
                        System.out.println(i);
                    b = true;
                }
            }
        }
        else {
            System.out.println("the prime number between the first number and second number are");
            for (int i = num1 + 1; i < num2; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        b = false;
                        break;
                    }
                }
                if (b)
                    System.out.println(i);
                b = true;
            }
        }
    }
}
