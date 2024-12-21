import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Swap Program");
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int c = a ;
        a = b;
        b = c;
        System.out.println("First number is : "+a);
        System.out.println("Second number is : "+b);


    }
}
