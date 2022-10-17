package If_Else_Loop;

//7. Write a program to print prime numbers from 2 to n

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Please Enter a number : ");
            int n = scanner.nextInt();
            System.out.println("Prime Numbers From 2 to "+n+" is : ");
            System.out.println("----------------------------------------");
            for (int i = 2; i <=n ; i++) {
                int count = 0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.print(i+" ");
                }
            }
            System.out.println("");
            System.out.println("----------------------------------------");
        }
        catch (Exception e){
            System.out.println("Please enter an integer number");
        }
    }
}
