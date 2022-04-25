package Conditionals;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Subject");
        String subject = scan.next();

        System.out.println("Enter the grade");
        int grade = scan.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("The grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("The grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("The grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("The grade is D");
        } else if (grade <= 59) {
            System.out.println("The grade is F");
        } else {
            System.out.println("The number is not in range");

        }
    }
}
