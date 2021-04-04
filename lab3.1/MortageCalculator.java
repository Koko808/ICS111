/* Koko Aung
 * HW 1
 */
 
//Class declaration
 class MortageCalcaulator
 {
    // Main method
    public static void main(String [] args)
    {
    
    // Part 1
    //setting var as int and double
    int numPayment;
    double principal,apr;
    
    //actuall price of the mortage 
    principal = 800000;
    
    //Monthly percentace rate of the mortage
    apr = 3.85;
    
    //numbers of terms in year for mortage in int
    int term = 30;
    
    //Rate of the mortage in double
    double rate = ((apr)/(100*12));
    
    //number of payment with term * 12 in int
    int numPayments = term *12;
    
    //calculating the total of payment per month in double
    double monthlyPayment = ((principal*rate*Math.pow(1+rate,numPayments))/(Math.pow(1+rate,numPayments)-1));
    
    //printing out all the string with principal in  1 decimal placement
    System.out.printf("Principal=$%.1f\n", principal);
    
    //printing out all the string with apr in 2 decimal placment
    System.out.printf("Annual interest=%.2f%%\n", apr);
    
    //printing out all the string with term
    System.out.printf("Term=%d years\n", term);
    
    //printing out all the string with monthlyPayment in 2 decimal placment
    System.out.printf("Monthly payment is $%.2f\n", monthlyPayment);
    
    //making new equation for monthlyPayment
    monthlyPayment = monthlyPayment*numPayments;
    
    //printing out all the string with monthlyPayment in 2 deciaml placemtn & term
    System.out.printf("You end up paying a total of $%.2f over a period of %d yers\n", monthlyPayment,term);
    
    //Parts 2
    //Printing out string
    System.out.println("Part 2");
    
    //Monthly percentace rate of the mortage
    apr = 3.35;
    
    //numbers of terms in year for mortage
    term = 15;
    
    //Rate of the mortage
    rate = ((apr)/(100*12));
    
    //number of payment with term * 12
    numPayment = term *12;
    
    //calculating the total of payment per month
    monthlyPayment = ((principal*rate*Math.pow(1+rate,numPayment))/(Math.pow(1+rate,numPayment)-1));
    
    //printing out all the string with principal in  1 decimal placement
    System.out.printf("Principal=$%.1f\n", principal);
    
    //printing out all the string with apr in 2 decimal placment
    System.out.printf("Annual interest=%.2f%%\n", apr);
    
    //printing out all the string with term
    System.out.printf("Term=%d years\n", term);
    
    //printing out all the string with monthlyPayment in 2 decimal placment
    System.out.printf("Monthly payment is $%.2f\n", monthlyPayment);
    
    //making new equation for monthlyPayment
    monthlyPayment = monthlyPayment*numPayment;
    
    //printing out all the string with monthlyPayment in 2 deciaml placemtn & term
    System.out.printf("You end up paying a total of $%.2f over a period of %d yers\n", monthlyPayment,term);
    
    }// end of main
    
}//end of class




/*Reflection
 * 
 * The thing that i'll remember from this lab will be, how i didn't have to aasigned any of the variable on part 2 because i had done it on part 1.
 * Also, the problemes that I had faced were typo, and forgetting semicolon at the end or putting to many parentheses in formular.
 * 
 */
