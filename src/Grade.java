import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator");
        System.out.print("Enter your marks: ");
        int marks = in.nextInt();

        if(marks >= 90 ){
            System.out.println("Your grade is A");
        }
        else if(marks >= 75 ){
            System.out.println("Your grade is B");
        }
        else if(marks >= 60 ){
            System.out.println("Your grade is C");
        }
        else if(marks >= 30 ){
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("Your grade is F");
        }
    }
}
