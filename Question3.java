import java.util.Scanner;

class Classification {
    static void numberClassification(int num){
        if(num>0)
            System.out.println("the number is positive");
        else
            System.out.println("the number is negative");

        if(num%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");

        if(num%5==0)
            System.out.println("the number is divisible by 5");
        else
            System.out.print("the number is not divisble by 5");

        if(num%7==0)
            System.out.print("the number is divisible by 7");
        else
            System.out.print("the number is not divisible of 7");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        numberClassification(num);
    }
}
