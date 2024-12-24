import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime Generator");
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }


    }

    public static boolean isPrime(int n) {
         int i = 2;
         while (i<n) {
             if (n % i == 0) {
                 return false;
             }
             i++;
         }
    return true;
    }
}
