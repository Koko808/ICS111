import java.util.ArrayList;
public class CarList {
   private ArrayList<Car> carList;
   public CarList() {
      carList = new ArrayList<Car>();
   }
   public void add(Car car) {
      carList.add(car);
   }
   public String toString() {
      String temp = "";
      for (Car c : carList) {
         temp += c.toString() + "\n";
      }
      return temp;
   }
   public String toJSON() {
      String temp = "";
      temp += "{\n  \"cars\" : [\n";
      for (int i = 0; i < carList.size(); i++) {
          //printing all carList with the Car.java toJSON() method
          temp += carList.get(i).toJSON();
          //printing "," expect the last car list
          if (i < carList.size() -1) {
            temp += ",";
          }
          //moving next line
          temp += "\n";
      }
      temp += "  ]\n}";
      return temp;
   }
}
