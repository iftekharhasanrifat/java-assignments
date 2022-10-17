package If_Else_Loop;

//10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

import java.util.Scanner;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        int number ;
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how  many numbers do you want to input :  ");
        number = scanner.nextInt();
        System.out.println("Enter "+number+" Numbers");
        int userInput;
        for (int i = 0; i < number; i++) {
            userInput = scanner.nextInt();
            if(userInput>largestNumber){
                largestNumber = userInput;

            }
            if(userInput<smallestNumber) {
                smallestNumber = userInput;
            }
        }
        System.out.println("-----------------------------------");
        System.out.println(largestNumber+" is the largest number");
        System.out.println(smallestNumber+" is the smallest number");
    }
}
