import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Arithmetic Calculation Program");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("The sum is: " + add);
        System.out.println("The difference is: " + sub);
        System.out.println("The multiplication is: " + mul);
        System.out.println("The division is: " + div);
        System.out.println("The modulus is: " + mod);

    }
}
