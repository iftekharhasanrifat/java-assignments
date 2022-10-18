package Function_Array;

//5. Take 5 numbers from users in an array.
// Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()

import java.util.Scanner;

public class Average_Even_Odd_Array {

    public double average(int array[]){
        double average;
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total+=array[i];
        }
        average = total/(array.length*1.0);
        return average;
    }
    public int countEvenNumbers(int array[]){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public int countOddNumbers(int array[]){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Average_Even_Odd_Array average_even_odd_array = new Average_Even_Odd_Array();
        System.out.println("Please enter 5 numbers");
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        double average = average_even_odd_array.average(arr);
        int countEvenNumbers = average_even_odd_array.countEvenNumbers(arr);
        int countOddNumbers = average_even_odd_array.countOddNumbers(arr);
        System.out.println("The Average Number is : "+average);
        System.out.println("There are "+countEvenNumbers+" Even Numbers & "+countOddNumbers+" Odd Numbers");

    }
}
