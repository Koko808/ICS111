// All classes inherit from java.lang.Object
public class Lightbulb {
   // instance variables
   private String description;
   private String bulbType;
   private int rating;
   private double price;
   
   public Lightbulb(String desc, String bType, int rng, double pr) {
      //description = desc;
      setDescription(desc);
      //BulbType = bType;
      setBulbType(bType);
      //Rating = rng
      setRating(rng);
      //this.price = pr;
      setPrice(pr);
   }
   public String toString() {
      String temp = "description: " + description + ", bulbType: " +
        bulbType + ", rating: " + rating + ", price:" + price;
      return temp;
   }
   
   public String toJSON() {
      //public String toJSON() {
      String temp = "    {\n";
      temp += "      \"description\" : \"" + description + "\",\n";
      temp += "      \"bulbType\" : \"" + bulbType + "\",\n";
      temp += "      \"rating\" : \"" + rating + "\",\n";
      temp += "      \"price\" : " + price + "\n";
      temp += "    }";
      return temp;
   }
   
   //mutator methods that sets description to NODESC
   //If mutator for description is passed an empty String
   public void setDescription(String desc) {
      description = desc.trim();
      if (description.equals("")) {
         description = "NODESC";
      }
   }
   public String getDescription() {
      return description;
   }//mutator methods that sets bulbType to BTYPE
   //If mutator for bulbType is passed an empty String
   public void setBulbType(String bType) {
      bulbType = bType.trim();
      if (bulbType.equals("")) {
         bulbType = "NOBTYPE";
      }
   }
   public String getBulbType() {
      return bulbType;
   } //set the rating to zero if the mutator for rating is passed a negative number
   public void setRating(int rating) {
      this.rating = rating;
      if (this.rating < 0) {
         this.rating = 0;
      }
   }
   public int getRating() {
      return rating;
   }
   //set the price to zero if the mutator for price is passed a negative number
   public void setPrice(double price) {
      this.price = price;
      if (this.price < 0) {
         this.price = 0;
      }
   }
   public double getPrice() {
      return price;
   }
   
}
