/* Koko Aung
 * Pratice 1
 */

//Class declaration
 class Pratice1
 {
    // Main method
    public static void main(String [] args)
    {
    
        {
        //Frist Problem
        
        double radius = 5.5;
        
        //Firnding perimeter & area by using formula
        double perimeter = 2*radius*Math.PI;
        double area = radius*radius*Math.PI;
        
        //printing out string & float with 2 decimal placement
        System.out.println("-----------------------------------------");
        System.out.printf("The perimeter of circle is %.2f\n", perimeter);
        System.out.printf("The area of circle is %.2f\n", area);
        
        }//First End
        
        {
        //Second problem
        
        int year = 312032486;
        
        //Finding the total of people
        double total = ((365*24*60*60/7.0)-(365*24*60*60/13.0)+(365*24*60*60/45.0));
        
        //Adding constance total with each years
        double yearOne = year+total;
        double yearTwo = yearOne+total;
        double yearThree = yearTwo+total;
        double yearFour = yearThree+total;
        double yearFive = yearFour+total;
        
        //Printing string & number of peoples in zero placement
        System.out.println("-----------------------------------------");
        System.out.printf("Population at the end of first year %.0f\n",yearOne);
        System.out.printf("Population at the end of second year %.0f\n",yearTwo);
        System.out.printf("Population at the end of third year %.0f\n",yearThree);
        System.out.printf("Population at the end of fourth year %.0f\n",yearFour);
        System.out.printf("Population at the end of fifth year %.0f\n",yearFive);
        System.out.println("-----------------------------------------");
        
        }//Second End
    
        {
        //Third problem
        
        //organizing numbers and vriable
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;
        
        //using the formula and putting ino X & y
        double x = (((e*d)-(b*f))/((a*d)-(b*c)));
        double y = (((a*f)-(e*c))/((a*d)-(b*c)));
        
        //Printing string & x and y in 2 decimal placement
        System.out.printf("x is %.2f\n", x);
        System.out.printf("y is %.2f\n", y);
        System.out.println("-----------------------------------------");
        
        }//Third End
    
    }// Main End

 }// Class End
