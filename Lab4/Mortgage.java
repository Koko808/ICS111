/* A Mortgage class to represent Mortgage objects
 * Name: Koko Aung
 * 
 * Class is a template or a blueprint of an entity
 * Object is an intance of an class
 */

//making a class called Mortgage
class Mortgage
{
    //Data
    //assgining all the variable into double and int
    double principal, apr;
    int term;
    double monthlyPayment, totalPayment;
    
    // Methods - a sequence of instruction that performs a certain task
    void calculateMonthlyPayment()
    {
        // storing a calculation of apr, store in a new varable, and changing the variable into double
        double mRate= apr/100/12;
        // storing a calculation of term, store in a new varable, and changing the variable into double
        double numPayments = term*12;
        //mutiplying a mRate and principal, and store into new variable
        monthlyPayment = principal * mRate *
//using all the variable doing calculation
Math.pow(1+mRate,numPayments)  /(Math.pow(1+mRate,numPayments)-1);
    }// end of calculateMonthlyPayment
    
    // Methods - a sequence of instruction that performs a certain task
    void calculateTotalPayment()
    {
        
        calculateMonthlyPayment();
        //storing a calculation of term, store in a new varable
        totalPayment = monthlyPayment*term*12;
    }//end of calculateTotalPayment

}//end of class

//In this hw, i didn't have that much problems with doing this class file, because is fast and easy to understand.
//I stays don't understand why line 27 has to be outside of the curly bracket.
