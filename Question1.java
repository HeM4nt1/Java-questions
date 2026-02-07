import java.util.Scanner;

class Billing {
    static float calculateBill(float price, float quantity){
        float discount=0;
        float bill = price*quantity;
        if(bill>=2000&&bill<=5000){
        discount = bill/20;  // discount is 5%
        }
        else if(bill>=5000){
            discount = bill/10;  // discount is 10%
        }

        return bill-discount;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the price of the commodity");
        float price = in.nextFloat();
        System.out.println("enter the quantity of the commodity");
        float quantity = in.nextFloat();
        System.out.println("the final bill is "+ calculateBill(price, quantity));
    }
}
