package Function_Array;

//1. Take input from a user and check if the number exists in the array
//        let the array is [1,3,5,7,2,4,6,8]
//        Input: 7
//        Output: Found in the position 3
//        Input: 9
//        Output: Found no element

import java.util.Scanner;

public class Search_Number_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = {1,3,5,7,2,4,6,8},location=0;
        boolean isExist = false;
        System.out.println("Please Enter a number to search : ");
        int userInput;
        try {
            userInput= scanner.nextInt();
            for (int i = 0; i <num.length ; i++) {
                if(num[i]==userInput){
                    isExist = true;
                    location=i;
                }
            }
            if(isExist){
                System.out.println("Found in the position "+location);
            }
            else {
                System.out.println("Found no element");
            }
        }catch (Exception e){
            System.out.println("Please give a valid input");
        }
    }
}
