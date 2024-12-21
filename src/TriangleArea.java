import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Triangle Area Program..");
        System.out.print("Enter the Base of Triangle: ");
        double a = input.nextDouble();
        System.out.print("Enter the Height of Triangle: ");
        double b = input.nextDouble();

        double area = 0.5 * (a * b);

        System.out.println("Area of Triangle is " + area + "cm");
    }
}
