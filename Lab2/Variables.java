/* Koko Aung
 * A program to demonstrate role of variables
 */

class Variables
{
    // Main method
    public static void main(String [] args)
    {
        // Java has static typing - Every variable has to be declared by compile type
        // once declared a variable retains its type, so don't declare again
        
        // Declaration of an interger variable
        int age;
        // Declaration of a floation point variable
        double hourlyPay, wages;
        //Declaration of string
        String name, major, phoneNum;
        
        // Initialize variables using assignment operator = 
        age = 21;
        hourlyPay = 11.00;
        double numHour = 30;
        // Compute wages as hourlyPay times numHours
        wages = hourlyPay*numHour;
        System.out.println("First Week you made $"+wages);
        
        numHour=40;
        wages = hourlyPay*numHour;
        System.out.println("Second Week you made $"+wages);
        
        hourlyPay = hourlyPay +1;
        System.out.println("Upaded pay: "+hourlyPay);
        
        name = "John Doe";
        String info = name + " Age: "+age;
        System.out.println(info);
        
        major = "CSNT";
        phoneNum = "8063132819283";
        info = info +" "+ major +" "+ phoneNum;
        System.out.println(info)
        
    } // End of main method

}// end of class
