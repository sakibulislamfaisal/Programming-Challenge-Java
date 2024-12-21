import java.util.Scanner;

public class SmallNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Smallest Number Program");
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the seconds number: ");
        int b = sc.nextInt();
        System.out.print("Enter the thirds number: ");
        int c = sc.nextInt();
        if(a <= b && a <= c){
            System.out.println("The Smallest number is: " + a);
        }
        else if(b <= a && b <= c){
            System.out.println("The Smallest number is: " + b);
        }
        else {
            System.out.println("The Smallest number is: " + c);
        }
    }
}
