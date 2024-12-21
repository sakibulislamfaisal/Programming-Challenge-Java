import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Interest Calculator..");
        System.out.print("Enter the Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double Rate = sc.nextDouble();
        System.out.print("Enter the Years of Interest: ");
        double years = sc.nextDouble();

        double Interest = (principal * Rate * years) / 100;

        System.out.println("Total Interest (BDT): " + Interest);
    }
}
