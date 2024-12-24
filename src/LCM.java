import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the LCM program");
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int lcm = LCMOfTwoNumber(num1,num2);
        System.out.println("The lcm of two numbers is: " + lcm);

    }
    public static int LCMOfTwoNumber(int first, int second) {
         int i = 1;
         while(i<=second){
              int factor = first * i ;
              if(factor % second == 0){
                  return factor;
              }
              i++;
         }
         return 0;
    }
}

/*
LCM - Least Common Multiple(if two number divided and value is zero)
i = 1
number suppose = 12, 18
factor = 1 * 12
12%18 = not
i = 2
factor = 2 * 15 = 30
30 % 18 = 12
 */