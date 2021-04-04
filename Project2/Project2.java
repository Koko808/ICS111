//import printWriting
import java.io.PrintWriter;
//import fileWrite
import java.io.FileWriter;
//import file
import java.io.File;
//import IOException
import java.io.IOException;
//import Scanner
import java.util.Scanner;
//import ArrayList
import java.util.ArrayList;
public class Project2 {
    public static void main(String[] args) throws IOException
    {
        //store null as outfile with printWriting
        PrintWriter outfile = null;
        //store scanner as keyb with Scanner
        Scanner keyb = new Scanner(System.in);
        //printing out string
        System.out.print("Enter name of JSON file to write to: ");
        //make userinput as fileMade and trim()
        String fileMade = keyb.nextLine().trim();
        
        //store fileMade as f with File 
        File f = new File(fileMade);
        //store f as fw with FileWriter
        FileWriter fw = new FileWriter(f);
        // store fw as outfile with PrintWriter
        outfile = new PrintWriter(fw);
        
        //store lightbulbList() as myList
        LightbulbList myList = new LightbulbList();

        //set LoopRun as true
        boolean loopRun = true;
        
        //making while loop with loopRun
        while (loopRun)
        {
            //printing out String
            System.out.print("Enter a lightbulb (y/n)? ");
            //make userinput as userInput and trim()
            String userInput = keyb.nextLine().trim();
            
            //if the userInput is y
            if (userInput.equals("y")) {
                //make userinput as lightBulb and trim()
                System.out.print("Enter lightbulb description: \n");
                String lightBulb = keyb.nextLine().trim();
                
                //make userinput as lightType and trim()
                System.out.print("Enter lightbulb type: ");
                String lightType = keyb.nextLine().trim();
                
                //make userinput as lightRating and trim()
                System.out.print("Enter lightbulb rating: ");
                String lightRating = keyb.nextLine();
                //converting lightRating into Integer & stores as rating
                int rating = Integer.parseInt(lightRating);
                
                //make userinput as lightPrice and trim()
                System.out.print("Enter lightbulb price per bulb: ");
                String lightPrice = keyb.nextLine();
                //converting lightPrice into Integer & stores as price
                double price = Double.parseDouble(lightPrice);
                
                //stores lightBulb,lightType,rating,pice as a list & into l1 with Lightbulb
                Lightbulb l1 = new Lightbulb(lightBulb,lightType,rating,price);
                //add the l1 into myList
                myList.add(l1);
            }
            
            //if userInput is n than loopRun will be false
            if (userInput.equals("n")) {
                loopRun = false;
            }
        }
        //store myList.toJSON() in outfile
        outfile.print(myList.toJSON());
        //close the outfile
        outfile.close();
    }
}

/*
 Enter name of JSON file to write to: test.json
Enter a lightbulb (y/n)? y
Enter lightbulb description: 
EcoSmart Dimmable
Enter lightbulb type: LED
Enter lightbulb rating: 60
Enter lightbulb price per bulb: 1.62
Enter a lightbulb (y/n)? y
Enter lightbulb description: 
Philips Dimmable
Enter lightbulb type: LED
Enter lightbulb rating: 60
Enter lightbulb price per bulb: 1.85
Enter a lightbulb (y/n)? y
Enter lightbulb description: 
EcoSmart Dimmable
Enter lightbulb type: LED
Enter lightbulb rating: 100
Enter lightbulb price per bulb: 2.97
Enter a lightbulb (y/n)? n
*/
