/* Koko Aung
 * The main driver class for creating Mortgage object
 * 
 */ 

// Import scanner
import java.util.Scanner;
//making a class called MortgageDriver
class MortgageDriver
{
    public static void main(String[] args)
    {
        // Declare and create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // Declare a Mortgage object, and Allocate memory for the object
        Mortgage m1 = new Mortgage();
        //storing value into variable that is under m1 object
        m1.principal = 800000;
        //storing value into variable that is under m1 object
        m1.apr = 3.85;
        //storing value into variable that is under m1 object
        m1.term = 30;
        //calculating the total payment for m1
        m1.calculateTotalPayment();
        //printing string
        System.out.println("First mortgage");
        //printing string and m1.monthlypayment with 2 decimal place 
        System.out.printf("Monthly payment is %.2f\n",m1.monthlyPayment);
        //printing string. m1.totalpayment and m1.term with 2 decimal place 
        System.out.printf("Total payment is %.2f over a period of %d years\n",m1.totalPayment,m1.term);
    
        // Declare a Mortgage object, and Allocate memory for the object
        Mortgage m2 = new Mortgage();
        //storing value into variable that is under m2 object
        m2.principal = 800000;
        //storing value into variable that is under m2 object
        m2.apr = 3.35;
        //storing value into variable that is under m2 object
        m2.term = 15;
        //calculating the total payment for m2
        m2.calculateTotalPayment();   
        //printing string
        System.out.println("First mortgage");
        //printing string and m2.monthlypayment with 2 decimal place 
        System.out.printf("Monthly payment is %.2f\n",m2.monthlyPayment);
        //printing string. m2.totalpayment and m2.term with 2 decimal place
        System.out.printf("Total payment is %.2f over a period of %d years\n",m2.totalPayment,m2.term);
   
        // Declare a Mortgage object, and Allocate memory for the object
        Mortgage m3 = new Mortgage();
        //storing value into variable that is under m3 object
        m3.principal = 800000;
        //storing value into variable that is under m3 object
        m3.apr = 3.5;
        //storing value into variable that is under m3 object
        m3.term = 20;
        //calculating the total payment for m3
        m3.calculateTotalPayment();   
        //printing string
        System.out.println("First mortgage");
        //printing string and m3.monthlypayment with 2 decimal place 
        System.out.printf("Monthly payment is %.2f\n",m3.monthlyPayment);
        //printing string. m3.totalpayment and m3.term with 2 decimal place
        System.out.printf("Total payment is %.2f over a period of %d years\n",m3.totalPayment,m3.term);
        
        //making a if statement that can find a lowest numbers from each variables
        if (m1.totalPayment<m2.totalPayment && m1.totalPayment<m3.totalPayment)
        {
            //printing out the string
            System.out.println("First mortgage has the lowest total payment!");
        }
        //making a if statement that can find a lowest numbers from each variables
        if (m2.totalPayment<m1.totalPayment && m2.totalPayment<m3.totalPayment)
        {
            //printing out the string
            System.out.println("Second mortgage has the lowest total payment!");
        }
        //making a if statement that can find a lowest numbers from each variables
        if (m3.totalPayment<m1.totalPayment && m3.totalPayment<m2.totalPayment)
        {
            //printing out the string
            System.out.println("Third mortgage has the lowest total payment!");
        }
    
    
    }//end of public


}//end of class

//For this code, i got some mistakes with semicolon and forgot to put period after m1, m2 and m3.
//This code was long and having a differnet files can help us understand much more better.
