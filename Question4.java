import java.util.Scanner;

 class Calculator {
     static void calculation(int num1, int num2, int choice) {
         switch (choice) {
             case 1:
                 System.out.println("Result = " + (num1 + num2));
                 break;

             case 2:
                 System.out.println("Result = " + (num1 - num2));
                 break;

             case 3:
                 System.out.println("Result = " + (num1 * num2));
                 break;

             case 4:
                 if (num2!= 0) {
                     System.out.println("Result = " + (num1 / num2));
                 } else {
                     System.out.println("Division by zero is not allowed");
                 }
                 break;

             case 5:
                 if (num2!= 0) {
                     System.out.println("Result = " + (num1 % num2));
                 } else {
                     System.out.println("Modulus by zero is not allowed");
                 }
                 break;

             default:
                 System.out.println("Invalid choice");
         }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        calculation(num1, num2, choice);
    }
}

