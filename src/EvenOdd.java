import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Even and Odd Numbers Program ");
        System.out.print("Enter your number: ");
        double number = sc.nextDouble();
        if(number % 2 == 0) {
            System.out.println("Even");
        }
        else {
             System.out.println("Odd");
        }
    }
}
