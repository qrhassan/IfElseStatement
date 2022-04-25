package Conditionals;

import java.util.Scanner;

public class IfElseScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the ticket no.");
        int ticket = scan.nextInt();

        System.out.println("Enter the customer name");
        String subject = scan.next();

        System.out.println("Enter the impact no.");
        int impact = scan.nextInt();

        if (impact==3 ) {
            System.out.println("High Priority");
        } else if (impact==2) {
            System.out.println("Medium Priority ");
        } else if (impact==1) {
            System.out.println("Low Priority");
        } else {
            System.out.println("Invalid impact no.");
        }
    }
}
