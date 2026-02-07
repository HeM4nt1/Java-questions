 import java.util.Scanner;

  class ElectricityBill {
      static double billCalculator(int units) {
          double bill = 0;

          if (units <= 100)
              bill = units * 2;

          else if (units <= 200)
              bill = (100 * 2) + (units - 100) * 3;

          else
              bill = (100 * 2) + (100 * 3) + (units - 200) * 5;

          bill = bill + 150;
          return bill;
      }

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter units consumed: ");
          int units = sc.nextInt();
          System.out.println("the electricity bill is "+ billCalculator(units));
      }
  }
