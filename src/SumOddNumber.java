import java.util.Scanner;

public class SumOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum Odd Number");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumOddNumber(num);
        System.out.println("The sum of odd numbers till: " + num + " is: " + sum);

    }
    public static int sumOddNumber(int num) {
         int sum = 0;
         int i = 1 ;
         while (i <= num) {
              sum = sum + i;
              i = i + 2;
         }
         return sum;

    }
}
