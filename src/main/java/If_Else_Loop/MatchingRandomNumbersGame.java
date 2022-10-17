package If_Else_Loop;

// 8. Write a program to generate 2 random numbers which will not be shown to the user.
// Take a user input and match it with any of the random numbers.
// If correct give it 1 point and if incorrect, do not give it any point.
// Finally, repeat this for 10 times and count the point user achieved.

import java.util.Scanner;

public class MatchingRandomNumbersGame {
    public static void main(String[] args) {

        int min = 10;
        int max = 20;

        int points = 0,userInput;
        Scanner scanner = new Scanner(System.in);
        int i=10;
        try{
            while (i>0){
                double random1 = Math.round(Math.random()*(max-min)+min);
                double random2 = Math.round(Math.random()*(max-min)+min);
                System.out.println("Please Guess any number : ");
                userInput = scanner.nextInt();
                if(userInput==random1 || userInput==random2){
                    points++;
                }
                i--;
            }
            System.out.println("-----------------------------------------------");
            System.out.println("Congratulations! You achieved "+points+" points");
        }
        catch (Exception e){
            System.out.println("Please Enter a number ! Thank You.");
        }

    }
}
