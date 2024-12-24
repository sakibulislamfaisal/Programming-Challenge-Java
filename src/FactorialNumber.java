import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Number");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int fact = factorialNum(num);
        System.out.println("Factorial of: " + num + " is: " + fact);

    }
    public static int factorialNum(int num) {
         int fact = 1;
         int i= 1;
         while(i<=num){
             fact = fact * i;
             i++;
         }
         return fact;
    }
}
