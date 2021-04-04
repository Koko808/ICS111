/*Koko Aung
 *Lab 6
 */

//importing a java ArrayList
import java.util.ArrayList;

class TestCarList {
    public static void main(String[] args) {
        //adding the new CarList to myList
        CarList myList = new CarList();
        //adding a new car to c1 
        Car c1 = new Car("Toyota", "Camry",22425);
        //adding the c1 into myList
        myList.add(c1);
        //addung a new Car and inputing myList 
        myList.add(new Car("Nissan","Sentra",17190));
        //addung a new Car and inputing myList 
        myList.add(new Car("Ford","Mustang",32210));
        
        //making a new ArrayList called as carList
        ArrayList<String> carList = new ArrayList<String>();
        //adding a String into carList
        carList.add("Toyota Camry");
        //adding a String into carList
        carList.add("Nissan Sentra");
        //adding a String into carList
        carList.add("Ford Mustang");
        
        //making a new ArrayList called as priceList
        ArrayList<Object> priceList = new ArrayList<Object>();
        //adding a double into priceList
        priceList.add(22425.0);
        //adding a double into priceList
        priceList.add(17190.0);
        //adding a double into priceList
        priceList.add(32210.0);
        //making a index for loop that print out each array list
        for (int i = 0; i < carList.size(); i++) {
            //printinf out carList array and printList array
            System.out.println(carList.get(i) + ", price: $" + priceList.get(i));      
        }
        //printing empty Space
        System.out.println(" ");
        //Printing first car list with toJSON method
        System.out.println(c1.toJSON());
        //printing empty Space
        System.out.println(" ");
        //printing all car list with toJSON method
        System.out.println(myList.toJSON());
    }
}

/*
 * Sample Run
Toyota Camry, price: $22425.0
Nissan Sentra, price: $17190.0
Ford Mustang, price: $32210.0
 
    {
      "manufacturer" : "Toyota",
      "model" : "Camry",
      "price" : 22425.0
    }
 
{
  "cars" : [
    {
      "manufacturer" : "Toyota",
      "model" : "Camry",
      "price" : 22425.0
    },
    {
      "manufacturer" : "Nissan",
      "model" : "Sentra",
      "price" : 17190.0
    },
    {
      "manufacturer" : "Ford",
      "model" : "Mustang",
      "price" : 32210.0
    }
  ]
}
*/

