package If_Else_Loop;

//6. Write  a program to find the factorial of a given number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n ,factorial=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number : ");
        n=scanner.nextInt();
        for (int i = 1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("The factorial of "+n+" is: "+factorial);
    }
}

