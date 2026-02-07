import java.util.Scanner;

class CountBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number whose bits you want to count");
        int n = sc.nextInt();
        int count = 0;

        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }

        System.out.println("number of set bits is "+count);
    }
}
