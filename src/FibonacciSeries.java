import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci Series Program");
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series Value is: ");
        fibonacciSeries(n);
    }
    public static void fibonacciSeries(int num) {
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        int first = 0 , second = 1;
        while(first + second <= num){
             int third = first + second;
             System.out.print(third +" ");
             first = second;
             second = third;
        }
    }
}
