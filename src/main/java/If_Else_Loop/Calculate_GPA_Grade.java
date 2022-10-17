package If_Else_Loop;

//2.Write a program to calculate GPA and find grade

import java.util.Scanner;

public class Calculate_GPA_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGradePoints =0,marks,gradePoints,GPA;
        boolean passStatus = true;
        System.out.println("Please Enter Number Of Subject : ");
        int numberOfSubject = scanner.nextInt();
        System.out.println("Enter the mark of the subjects : ");
        for (int i = 1;i<=numberOfSubject;i++){
            marks = scanner.nextDouble();
            if(marks<=100){
                if(marks>=80){
                    gradePoints = 5.00;
                    System.out.println("Marks : "+marks+" | "+"Grade Points : "+gradePoints+" | "+ "Grade : A+");
                }
                else if(marks>=70 && marks<80){
                    gradePoints = 4.00;
                    System.out.println("Marks : "+marks+" | "+"Grade Points : "+gradePoints+" | "+ "Grade : A");
                }
                else if(marks>=60 && marks<70){
                    gradePoints = 3.50;
                    System.out.println("Marks : "+marks+" | "+"Grade Points : "+gradePoints+" | "+ "Grade : A-");
                }
                else if(marks>=50 && marks<60){
                    gradePoints = 3.00;
                    System.out.println("Marks : "+marks+" | "+"Grade Points : "+gradePoints+" | "+ "Grade : B");
                }
                else if(marks>=40 && marks<50){
                    gradePoints = 2.00;
                    System.out.println("Marks : "+marks+" | "+"Grade Points : "+gradePoints+" | "+ "Grade : C");
                }
                else if(marks>=33 && marks<40){
                    gradePoints = 1.00;
                    System.out.println("Marks : "+marks+" | "+"Grade Points : "+gradePoints+" | "+ "Grade : D");
                }
                else {
                    gradePoints = 0.00;
                    passStatus = false;
                    System.out.println("Marks : "+marks+" | "+"Grade Points : "+gradePoints+" | "+ "Grade : F");
                }
                totalGradePoints+=gradePoints;
            }
            else {
                System.out.println("Please Enter the marks correctly");
                System.exit(0);
            }
        }

        System.out.println("-----------------------------------------------");
        if (passStatus){
            GPA = totalGradePoints/numberOfSubject;
            System.out.println("GPA : "+ String.format("%.2f",GPA) );

            if(GPA==5.00){
                System.out.println("Grade : A+");
            }
            else if(GPA>=4.00 && GPA<5.00){
                System.out.println("Grade : A");
            }
            else if(GPA>=3.50 && GPA<4.00){
                System.out.println("Grade : A-");
            }
            else if(GPA>=3.00 && GPA<3.50){
                System.out.println("Grade : B");
            }
            else if(GPA>=2.00 && GPA<3.00){
                System.out.println("Grade : C");
            }
            else if(GPA>=1.00 && GPA<2.00){
                System.out.println("Grade : D");
            }
            else {
                System.out.println("Grade : F");
            }
        }
        else {
            System.out.println("GPA : "+ String.format("%.2f",0.00));
            System.out.println("Grade : F");
        }
    }
}