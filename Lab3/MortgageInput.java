/*
 * Koko Aung
 * Homework 2 taking user input
 */

// Import scanner
import java.util.Scanner;

class MortgageInput
{
    public static void main(String [] args)
    {
        // Declare and create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt user for principal amount
        System.out.print("Enter the loan amount (principal): ");
        // Read keyboard input and store in variable principalStr
        String principalStr = keyboard.nextLine();
        
        // Prompt user for APR
        System.out.print("Enter the APR: ");
        // Prompt keyboard input and store in variable aprStr
        String aprStr = keyboard.nextLine();
        
        // Prompt user for term
        System.out.print("Enter the loan period (term): ");
        // Prompt keyboard input and store in variable termStr
        String termStr = keyboard.nextLine();
        
        // Prompt user for home insurance
        System.out.print("Enter home insurance per month: ");
        // Prompt keyboard input and store in variable insuranceStr
        String insuranceStr = keyboard.nextLine();
        
        // Prompt user for tax
        System.out.print("Enter property tax per month: ");
        // Prompt keyboard input and store in variable taxStr
        String taxStr = keyboard.nextLine();        
        
        // Convert principalStr to a double and store in variable principal
        double principal = Double.parseDouble(principalStr);
        // print the principal
        System.out.printf("Principal=$%.2f\n",principal);
        
        //Convert aprStr to a double and store in varibale apr
        double apr = Double.parseDouble(aprStr);
        // print the apr
        System.out.printf("Annual interest=%.2f%%\n",apr);
        
        //Convert termStr to a double and store in varibale term
        int term = Integer.parseInt(termStr);
        // print the term
        System.out.printf("Term=%d years\n",term);
        
        //Convert insuranceStr to a double and store in varibale insurance
        double insurance = Double.parseDouble(insuranceStr);
        // print the insurance
        System.out.printf("Insurance=$%.1f\n",insurance);
        
        //Convert taxStr to a double and store in varibale tax
        double tax = Double.parseDouble(taxStr);
        // print the tax
        System.out.printf("Monthly tax=$%.1f\n",tax);
        
        //Rate of the mortage
        double rate = ((apr)/(100*12));
        
        //number of payment with term * 12
        double numPayment = term *12;
        
        //calculating the total of payment per month
        double monthlyPayment = ((principal*rate*Math.pow(1+rate,numPayment))/(Math.pow(1+rate,numPayment)-1));
        
        monthlyPayment = monthlyPayment+insurance+tax;
        
        //printing out all the string with monthlyPayment in 2 decimal placment
        System.out.printf("Monthly payment is $%.2f\n", monthlyPayment);

        //making new equation for monthlyPayment
        monthlyPayment = monthlyPayment*numPayment;        
        
        //printing out all the string with monthlyPayment in 2 deciaml placemtn & term
        System.out.printf("You end up paying a total of $%.2f over a period of %d yers\n", monthlyPayment,term);
    
        
    }// end of main

}//end class

//For this lab, I didn't run into any problems with the code, but I had small typo problems and this kind of error was hard to fix, if i don't check the code.
//I was able to understand all the code.
