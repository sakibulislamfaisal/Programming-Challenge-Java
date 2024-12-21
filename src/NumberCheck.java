import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number checker program ");
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        if(number > 0){
             System.out.println("Your number is a positive number");
        }
        else if(number < 0){
             System.out.println("Your number is a negative number");

        }
        else{
            System.out.println("Your Number is zero ");
        }
    }
}
