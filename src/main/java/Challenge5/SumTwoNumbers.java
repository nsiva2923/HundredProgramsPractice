package Challenge5;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to out calculator");
        System.out.print("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your number is " + sum);
    }
}
