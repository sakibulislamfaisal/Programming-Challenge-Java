import java.util.Scanner;

class BitwiseOperationOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitwise OR Operator");
        System.out.print("Enter input your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter input your second number: ");
        int num2 = sc.nextInt();

        int result = num1 | num2;
        System.out.println("The result is: " + result);
    }
}
