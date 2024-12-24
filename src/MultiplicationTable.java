import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        multiplicationTableResult(number);

    }
    public static void multiplicationTableResult(int number){
        int i = 1 ;
        while(i<= 10){
            System.out.println(number + "X" + i + " = " + (number * i));
            i++;
        }
    }
}

