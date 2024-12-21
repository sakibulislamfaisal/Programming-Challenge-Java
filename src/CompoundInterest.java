import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator..");
        System.out.print("Enter the Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double Rate = sc.nextDouble();
        System.out.print("Enter the Years of Interest: ");
        double years = sc.nextDouble();

        double comInt = principal * Math.pow((1+ Rate/100), years);
        System.out.println("The Compound Interest is: " + comInt);
    }
}
