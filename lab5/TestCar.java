class TestCar {
   public static void main(String[] args) {
      Car car = new Car("Toyota","Camry",22425);
      System.out.println(car);
      Car car2 = new Car("Toyota","Camry",22425);
      //System.out.println(s2);
      System.out.println("JSON representation");
      System.out.println(car2.toJSON());
      car2.setManufacturer("Toyota");
      System.out.println(car2);
      System.out.println(car.getManufacturer());
      car2.setPrice(22425);
      System.out.println("Toyota Camry's price is : " + car2.getPrice());
      car2.setModel("Camry");
      System.out.println("car2's model is : " + car2.getModel());
   }
}
