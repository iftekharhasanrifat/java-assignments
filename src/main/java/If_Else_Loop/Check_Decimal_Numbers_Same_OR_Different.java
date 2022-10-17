package If_Else_Loop;

//3. Input 2 decimal numbers and check if thenumber2 are both same or different up to two decimal places.
//E.g 120.546 & 120.241

import java.util.Scanner;

public class Check_Decimal_Numbers_Same_OR_Different {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first decimal Number : ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter Second decimal Number : ");
        double number2 = scanner.nextDouble();
        number1 = Math.round(number1 * 100);
        number1 = number1 / 100;
        number2 = Math.round(number2 * 100);
        number2 = number2 / 100;
        if (number1 == number2)
        {
            System.out.println("They are the same up to two decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
