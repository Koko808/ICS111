import java.util.ArrayList;
public class CarList {
   protected ArrayList<Car> carList;
   public CarList() {
      carList = new ArrayList<Car>();
   }
   public void add(Car c) {
      carList.add(c);
   }
   public String toCSV() {
      String temp = "";
      for (Car car : carList) {
         temp += car.toCSV() + "\n";
      }
      return temp;
   }
}
