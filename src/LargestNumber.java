import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Largest Number Program");
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        if(number1 >= number2 && number1 >= number3){
            System.out.println("The Largest number is: " + number1);
        }
        else if(number2 >= number1 && number2 >= number3){
             System.out.println("The Largest number is: " + number2);
        }
        else {
            System.out.println("The Largest number is: " + number3);
        }
    }
}
