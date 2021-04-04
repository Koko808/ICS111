public class CarListB extends CarListA {
   public CarListB() {
      super();
   }
   public String toXML() {
      String temp = "<?xml version=\"1.0\" ?>\n";
      temp += "<cars>\n";
      for (Car car : carList) {
         temp += car.toXML() + "\n";
      }
      temp += "</cars>";
      return temp;
   }
   public String toJSON() {
      String temp = "{\n  \"cars\" : [\n";
      for (int i = 0; i < carList.size(); i++) {
         temp += carList.get(i).toJSON();
         if (i < carList.size() - 1) {
            temp += ",";
         }
         temp += "\n";
      }
      temp += "  ]\n}";
      return temp;
   }
}
