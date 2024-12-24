import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Armstrong Number");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("It is an Armstrong number");
        }
        else {
            System.out.println("It is not an Armstrong number");
        }
    }
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        //calculate the digits
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        //calculate sum of digit
        while(num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num = num / 10;

        }
        return sum == originalNum;
    }
}
