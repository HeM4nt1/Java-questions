import java.util.Scanner;

class ATM{
    static void withdrawal(int balance, int withdraw){
        if (withdraw % 100 == 0 && balance - withdraw >= 1000) {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);
        }
        else {
            System.out.println("Withdrawal Failed");
            if (withdraw % 100 != 0) {
                System.out.println("Reason: Amount must be multiple of 100");
            }
            if (balance - withdraw < 1000) {
                System.out.println("Reason: Minimum balance of 1000 must be maintained");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        withdrawal(balance, withdraw);
    }
}

