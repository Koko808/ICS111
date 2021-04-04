/*Koko Aung
 * lab 7
 * 
*/

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
class Lab7 {
   public static void main(String[] args) throws IOException {
      //using CarLisB() as myList
      CarListB myList = new CarListB();
      //Stores sting and double into myList
      myList.add(new Car("Honda","Fit",19999.39));
      //read the CSV file into myList
      myList.readCSVFile("cars.csv");
      //print out myList as XML
      System.out.println(myList.toXML());
      
      //stores null as outfile using printwriter
      PrintWriter outfile = null;
      //user scanner mathod as keyb
      Scanner keyb = new Scanner(System.in);
      //asking user a question
      System.out.print("Enter name of JSON file to write to: ");
      //stores the keyb as fileMade and trim
      String fileMade = keyb.nextLine().trim();
      
      //store fileMade as f with File 
      File f = new File(fileMade);
      //store f as fw with FileWriter
      FileWriter fw = new FileWriter(f);
      // store fw as outfile with PrintWriter
      outfile = new PrintWriter(fw);
      
      //print out the toJSON() in outfile
      outfile.print(myList.toJSON());
      //close the outfile
      outfile.close();
      
   }
}
/*
 1.In your Lab7 code, you use the readCSVFile() method.  The readCSVFile() method is not defned in the CarListB class.  
 * Explain why you are able to use that method in your Lab7 code. (1 point)
 * 
 * The reason why we are able to use the mehod in our lab7 code. It's because CarListB and A are connected, so wedon't need to have another readCSVFile() method
 * in CarListB file.
 * 
 * 
 2.In the CarListB.java fle, you use the variable carList on lines 8, 16, 17 and 18.  But, that variable is not defned in the CarListB class.  
 * Explain how this code is able to work. (1 point)
 * 
 * CarList.java is connected to Car.java, and Car.java is connected to CarListB.java because of that we were able to use carList method for line 8, 16,17, and 18
 * CarListB.java.
 * 
 * 
 3.For the CarListA class, list all the properties that are directly accessible. (1 point)
 * 
 * CarListA calss, able to access FileWriter, buffer reader, readCSVfile, filenotfound, and IOException.
 * 
 * 
 4.Would it be possible to combine CarList, CarListA and CarListB.  What would be the advantage of combining those classes?  
 * What would be the disadvantage of combining those classes?  (2 points)
 * 
 * 
 * Yes, it'll be possible to combine Carlist, CarListA and CarListB. The advantage of comnining those classes gives us one whole code of file and not repeating import
 * java.io. The disadvantage of combining those classes will be very messy and there will be reusability of code.
 * 
 * 
 * Sample Run:
 * 
 * <?xml version="1.0" ?>
<cars>
  <car>
    <make>Honda</make>
    <model>Fit</model>
    <price>19999.39</price>
  </car>
  <car>
    <make>Toyota</make>
    <model>Camry</model>
    <price>24123.99</price>
  </car>
  <car>
    <make>Nissan</make>
    <model>Altima</model>
    <price>23999.69</price>
  </car>
</cars>
Enter name of JSON file to write to: file.json
 * 
