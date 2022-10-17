package If_Else_Loop;

//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100

public class Sum_Of_Numbers_Divisible_By_5 {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 1;i<=100;i++){
            if(i%5==0){
                sum+=i;
            }
        }
        System.out.println("Total Sum : "+sum);
    }
}
