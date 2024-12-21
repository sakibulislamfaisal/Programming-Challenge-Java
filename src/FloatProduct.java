import java.util.Scanner;

public class FloatProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Floating Number Multiplication");
        System.out.print("Enter First Number: ");
        float first = sc.nextFloat();
        System.out.print("Enter Second Number: ");
        float second = sc.nextFloat();

        float product = first * second;

        System.out.println("Product is: " + product);
    }
}
