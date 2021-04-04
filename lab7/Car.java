public class Car extends CarBase {
   public Car(String make, String model, double price) {
      super(make,model,price);
   }
   public String toCSV() {
      return make + "," + model + "," + price;
   }
   public String toXML() {
      String temp = "  <car>\n";
      temp += "    <make>" + make + "</make>\n";
      temp += "    <model>" + model + "</model>\n";
      temp += "    <price>" + price + "</price>\n";
      temp += "  </car>";
      return temp;
   }
   public String toJSON() {
      String temp = "    {\n";
      temp += "      \"make\" : \"" + make + "\",\n";
      temp += "      \"model\" : \"" + model + "\",\n";
      temp += "      \"price\" : " + price + "\n";
      temp += "    }";
      return temp;
   }
}
