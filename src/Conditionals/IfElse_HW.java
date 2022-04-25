package Conditionals;

/*
Score 94 to 100 ( Excellent)
Score 90 to 93 ( Very good)
Score 85 to 89 ( Good)
Score 80 to 84( Average)
Score 70 to 79 ( poor)
Score 60 to 69 (pass)
Score  50 to 59 (need to repeat this Course)
Use scanner with if if ,else, &&, || ,
 */

import java.util.Scanner;

public class IfElse_HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("******** 'The Grading Policy' ********");

        System.out.println("Enter the course name:");
        String subject = scan.next();

        System.out.println("Enter the score:");
        int score = scan.nextInt();

        if (score >= 94 && score <= 100) {
            ;
            System.out.println("It is an 'Excellent' score");
        } else if (score >= 90 && score <= 93) {
            System.out.println("It is a 'Very Good' score");
        } else if (score >= 85 && score <= 89) {
            System.out.println("It is a 'Good' score");
        } else if (score >= 80 && score <= 84) {
            System.out.println("It is an 'Average' score");
        } else if (score >= 70 && score <= 79 ) {
            System.out.println("It is a 'Poor' score");
        } else if (score >=60 && score <=69) {
            System.out.println("It is a 'Pass' score");
        } else if (score >= 50 || score == 59) {
            System.out.println("Need to retake the course");
        } else {
            System.out.println("Ban for 1 semester");
        }
    }
}
