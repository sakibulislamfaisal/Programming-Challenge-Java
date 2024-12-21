import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the age group");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age <13){
            System.out.println("You are child");
        }
        else if(age >13 && age <=18){
            System.out.print("You are Teenager");
        }
        else if(age >18 && age < 60){
            System.out.print("You are Adult");
        }
        else{
            System.out.println("You are senior citizen");
        }
    }
}
