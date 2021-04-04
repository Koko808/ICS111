public class CarBase {
   protected String make;
   protected String model;
   protected double price;
   public CarBase(String mk, String md, double pr) {
      make = mk.trim();
      model = md.trim();
      price = pr;
   }
   public String getMake() {
      return make;
   }
   public String getModel() {
      return model;
   }
   public double getPrice() {
      return price;
   }
   public void setMake(String s) {
      make = s.trim();
   }
   public void setModel(String s) {
      model = s.trim();
   }
   public void setPrice(double p) {
      price = p;
   }
}
