/* Koko Aung
 * A program to calculate student tuition
 */
import java.util.Scanner;

class StudentData
{
    public static void main(String[] args)
    {
        // Declare Variables
        String name1;
        int credits1;
        double tuition1;
        
        // Setup the scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt user for their name and store in variable name
        System.out.print("Enter name of student: ");
        name1 = keyboard.nextLine();
        
        // prompt the user for number of credits
        System.out.print("Enter the number of credit: ");
        String creditsStr = keyboard.nextLine();
        credits1 = Integer.parseInt(creditsStr);
        
        // Calculate the tuition
        tuition1 = credits1*200;
        // Print the tuition owed by the student
        System.out.println("Student "+name1+" has to pay $"+tuition1);
        
        
        
        // Declare Variables
        String name2;
        int credits2;
        double tuition2;
        
        // Prompt user for their name and store in variable name
        System.out.print("Enter name of student: ");
        name2 = keyboard.nextLine();
        
        // prompt the user for number of credits
        System.out.print("Enter the number of credit: ");
        creditsStr = keyboard.nextLine();
        credits2 = Integer.parseInt(creditsStr);
        
        // Calculate the tuition
        tuition2 = credits2*200;
        // Print the tuition owed by the student
        System.out.println("Student "+name2+" has to pay $"+tuition2);
        
        
    
    }//End of Main

}//End of Class
