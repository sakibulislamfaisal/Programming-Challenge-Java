import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter of Rectangle");
        System.out.print("Please enter all 4 side of cm: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("Perimeter of Circle: " +perimeter);
    }
}
