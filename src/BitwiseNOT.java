import java.util.Scanner;

public class BitwiseNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = ~num;
        System.out.println("The result is: " +result);
    }
}
