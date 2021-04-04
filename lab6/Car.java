/* Koko aung
 * lab6
 */

// All classes inherit from java.lang.Object
public class Car {
   // instance variables
   private String manufacturer;
   private String model;
   private double price;
   
   
   public Car(String man, String mod, double price) {
      //manufacturer = man;
      setManufacturer(man);
      //model = mod;
      setModel(mod);
      //this.gpa = gpa;
      setPrice(price);
   }
   //using toString() function and storing String
   public String toString() {
      String temp = "manufacturer: " + manufacturer + ", model: " + 
         model + ", price: " + price;
      return temp;
   }
   //using toJSON() function and storing String
   public String toJSON() {
      String temp = "    {\n";
      temp += "      \"manufacturer\" : \"" + manufacturer + "\",\n";
      temp += "      \"model\" : \"" + model + "\",\n";
      temp += "      \"price\" : " + price + "\n";
      temp += "    }";
      return temp;
   }
   public void setManufacturer(String man) {
   //triming and storing man as manufacturer
      manufacturer = man.trim();
      //when manufacturer is equal it will stores NOMAN
      if (manufacturer.equals("")) {
         manufacturer = "NOMAN";
      }
   }
   public String getManufacturer() {
   //return back to top
      return manufacturer;
   }
   public void setPrice(double price) {
   //price now this.price
      this.price = price;
      //if this.price is less than 0 than it will into 0
      if (this.price < 0) {
         this.price = 0;
      }
   }
   public double getPrice() {
   //return back to top
      return price;
   }
   public void setModel(String mod) {
   //trima and store mod as model
      model = mod.trim();
      //if model is equals than it will stores NOMODEL
      if (model.equals("")) {
         model = "NOMODEL";
      }
   }
   public String getModel() {
   //return to the top
      return model;
   }
}



