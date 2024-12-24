import java.util.Scanner;

public class SumofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum of Numbers!");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumOfNumbers(num);
        System.out.println("The sum of the numbers is: " + sum);

    }
    public static int sumOfNumbers(int n) {
        int sum = 0;
        while (n > 0) {
             sum += n % 10;
             n /= 10;
        }
        return sum;
    }
}
