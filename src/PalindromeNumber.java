import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the palindrome number program");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindromeNumber(num);
        if (isPalindrome) {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
    public static boolean isPalindromeNumber(int num) {
       int reverse = reverse(num);
       return num == reverse;
    }

    public static int reverse(int num) {
        int reversed = 0;
        while(num > 0){
             int digit = num % 10;
             reversed = reversed * 10 + digit;
             num /= 10;
        }
        return reversed;
    }
}
