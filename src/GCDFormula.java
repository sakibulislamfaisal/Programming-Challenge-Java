import java.util.Scanner;

public class GCDFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the GCD formula!");
        System.out.print("Enter the first numbers: ");
        int first = sc.nextInt();
        System.out.print("Enter the second numbers: ");
        int second = sc.nextInt();
        int gcd = GCDNumber(first, second);
        System.out.println("The gcd of " + first + " and " + second + " is: " + gcd);
    }
    public static int GCDNumber(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
