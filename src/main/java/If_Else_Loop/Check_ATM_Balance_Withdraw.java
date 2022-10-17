package If_Else_Loop;

//4. Write a program to check balance and withdraw money from ATM booth using if else or switch case

import java.util.Scanner;

public class Check_ATM_Balance_Withdraw {
    public static void main(String[] args) {
        int balance = 50000, withdraw;
        int option;
        System.out.println("Please Choose from the options below");
        System.out.println("1. Check Balance");
        System.out.println("2. Money Withdraw");
        System.out.println("3. Exit");
        System.out.println("Please enter your choice : ");

       try{
           Scanner scanner = new Scanner(System.in);
           option = scanner.nextInt();

           switch (option){
               case 1:
                   System.out.println("-----------------------------");
                   System.out.println("Your current balance : "+balance);
                   break;
               case 2:
                   try {
                       System.out.println("Enter the amount you want to withdraw : ");
                       withdraw = scanner.nextInt();
                       System.out.println("-----------------------------");
                       if(withdraw>balance){
                           System.out.println("Insufficient Balance");
                       }
                       else {
                           balance -=withdraw;
                           System.out.println("Withdraw Successfull!");
                           System.out.println("Your current balance is : "+balance);
                       }
                       break;
                   }
                   catch (Exception e){
                       System.out.println("Please enter amount correctly");
                   }
                   break;
               case 3:
                   System.exit(0);
               default:
                   System.out.println("Please choose from the options");
                   break;
           }
       }
       catch (Exception e){
           System.out.println("Please choose options correctly");
       }
    }
}
