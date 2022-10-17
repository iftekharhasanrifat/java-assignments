package If_Else_Loop;

//9. Write a program to sum of user input until users input ‘q’ from keyboard

import java.util.Scanner;

public class SumOfUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        char ch ;
        do{
            System.out.println("Please Enter a number : ");
            sum += scanner.nextInt();
            System.out.println("Sum : "+sum);
            System.out.println("Do you want to continue ? ");
            ch = scanner.next().charAt(0);
        }while(ch!='q');
    }
}
