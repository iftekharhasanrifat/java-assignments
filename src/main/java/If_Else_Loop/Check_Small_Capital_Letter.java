package If_Else_Loop;

//1. Write a program to check if inputted letter is small or capital

import java.util.Scanner;

public class Check_Small_Capital_Letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an Alphabet : ");
        char letter = scanner.next().charAt(0);
        if(letter>='A' && letter<='Z'){
            System.out.println(letter+" is a Capital Letter");
        }
        else if(letter>='a' && letter<='z'){
            System.out.println(letter+" is a Small Letter");
        }
        else {
            System.out.println(letter+" is not an Alphabet");
        }
    }
}
