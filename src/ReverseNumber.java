import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Reverse Number");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = reverseNumber(num);
        System.out.println("The Reverse number is: " + reverse);

    }
    public static int reverseNumber(int num) {
        int reverse = 0;
        while(num > 0){
             int digit = num % 10;
             reverse = reverse * 10 + digit;
             num /= 10;
        }
        return reverse;
    }
}
