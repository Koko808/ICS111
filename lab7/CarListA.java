import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class CarListA extends CarList {
   public CarListA() {
      super();
   }
   public void readCSVFile(String filename) {
      File f = new File(filename);
      FileReader fr = null;
      try {
         fr = new FileReader(f);
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
         System.exit(1);
      }
      BufferedReader infile = new BufferedReader(fr);
      try {
         String line = "";
         while ((line = infile.readLine()) != null) {
            String[] tokens = line.trim().split(",");
            String make = tokens[0].trim();
            String model = tokens[1].trim();
            String priceString = tokens[2].trim();
            double price = Double.parseDouble(priceString);
            Car myCar = new Car(make,model,price);
            carList.add(myCar);
         }
      }
      catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
