//importing a java ArrayList
import java.util.ArrayList;

class TestLightbulbList {
    public static void main(String[] args) {
        // adding the new LightbulbList to myList, making an arraylist
        LightbulbList myList = new LightbulbList();
        //adding a new lb called l1 and inputting desc as EcoSmart Dimmable
        //bulbType as LED rating: 60 price is 1.62
        Lightbulb l1 = new Lightbulb("Philips Dimmable","LED",60,1.85);
        //adding the l1 into mylist
        myList.add(l1);
        //adding a new lb and inputting desc as Philips Dimmable
        //bulbtype as LED rating : 60 price is 1.85
        myList.add(new Lightbulb("EcoSmart Dimmable","LED",60,1.62));
        //adding a new lb and inputting desc as EcoSmart Dimmable
        //bulbType as LED rating: 100 price is 2.97
        myList.add(new Lightbulb("EcoSmart Dimmable","LED",100,2.97));
        //printing the lblist into a JSON format using toJSON() method
        System.out.println(myList.toJSON());
    }
}

/*
{
  "lightbulbs" : [
    {
      "description" : "Philips Dimmable",
      "bulbType" : "LED",
      "rating" : "60",
      "price" : 1.85
    },
    {
      "description" : "EcoSmart Dimmable",
      "bulbType" : "LED",
      "rating" : "60",
      "price" : 1.62
    },
    {
      "description" : "EcoSmart Dimmable",
      "bulbType" : "LED",
      "rating" : "100",
      "price" : 2.97
    }
  ]
}
*/

/*Questions
 * 1.Explain some of the advantages of using a JSON file for
 * storing information such as the course list information. (3 points)
 *
 * The advantages of using a JSON file for storing information such as course list information are
 * JSON is a lightweight data, and JSON stores the data in arrays which makes data transfer easier.
 *
 *
 *
 * 2.Explain how your program would be different if you did not use a
 * Lightbulb class or a LightbulbList class and instead just wrote this as a single application class.
 * Compare the two methods in terms of a) complexity of the main method,
 * b) ease of creating to the output file and c) reusability of your code.
 *
 * My program would be different if I did not use a Lightbulb class or a LightbulbList class
 * and just wrote as a single application class by having the classes, it will
 * make the code less complex. If I didn't make these classes and chose to do a single application class, 
 * there will be complexity of main method and making output file, and there will be reusability of code. 
 * Instead, separated application class will only consists the while loops for the y/n input, 
 * and it will just call on the lightbulblists and lightbulbs classes.  
 *
 */ 
