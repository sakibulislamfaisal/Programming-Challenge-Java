import java.util.Scanner;

public class LCMFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the LCM formula!");
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        int lcm = findLCM(first, second);
        System.out.println("The lcm of " + first + " and " + second + " is " + lcm);
    }
    public static int GCDNumber(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
    }
    public static int findLCM(int a, int b) {
        int gcd = GCDNumber(a, b);
        return (a*b) / gcd;
    }

}

/*
number = 48, 18
temp = 18
b = 48 % 18 = 12
a = 18

 */
