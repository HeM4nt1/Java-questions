import java.util.Scanner;

class DigitAnalysis {
    static void countingAndReversing(int num) {
        int reverse = 0;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            sum = sum + digit;
            count++;
            num = num / 10;
        }

        System.out.println("Reverse = " + reverse);
        System.out.println("Sum of digits = " + sum);
        System.out.println("Count of digits = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        countingAndReversing(num);
    }
}
