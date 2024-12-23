import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: ");
        int num = sc.nextInt();
        int result = num >> 1;
        System.out.println("The result is: " +result);
    }
}
