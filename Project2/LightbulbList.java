/*Koko Aung
 *CarList for lab6
 */
import java.util.ArrayList;
public class LightbulbList {
   //making the ArrayList for Lightbulb
   private ArrayList<Lightbulb> lbList ;
   public LightbulbList() {
      //setting lbList into a new ArrayList
      lbList = new ArrayList<Lightbulb>();
   }
   public void add(Lightbulb lb) {
      lbList.add(lb);
   }
   public String toString() {
      String temp = "";
      for (Lightbulb l : lbList) {
         temp += l.toString() + "\n";
      }
      return temp;
   }
   public String toJSON() {
      String temp = "";
      temp += "{\n  \"lightbulbs\" : [\n";
      //for loop for lighbulb lightbulbs to lblist
      for (int i = 0; i < lbList.size(); i++) {
          temp += lbList.get(i).toJSON();
          if (i < lbList.size() -1) {
            temp += ",";
          }
          temp += "\n";
      }
      temp += "  ]\n}";
      return temp;
   }
}



