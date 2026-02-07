import java.util.Scanner;

class Salary {
    static float calculateSalary(float salary){
        if(salary>=30000){
            float hra = salary/5;
            float da= (3*salary)/20;
            salary = salary - (12*salary)/100;
            salary = salary + da+ hra;
        }
        else{
            float hra = salary/10;
            float da= (8*salary)/100;
            salary = salary - (12*salary)/100;
            salary = salary + da+ hra;
        }
        return salary;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the basic pay");
        float salary = in.nextFloat();
        System.out.print("the final salary is "+ calculateSalary(salary));
    }
}
