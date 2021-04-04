import java.util.ArrayList;
public class Hand {
   ArrayList<Card> hand;
   public Hand() {
      hand = new ArrayList<Card>();
   }
   public void add(Card c) {
      hand.add(c);
   }
   public String toString() {
      String temp = "[";
      for (int i = 0; i < hand.size(); i++) {
         temp += hand.get(i);
         if (i < hand.size() - 1) {
            temp += ",";
         }
      }
      temp += "]";
      return temp;
   }
   /*
     The getHandValue() method treats all Aces
     as having a value of 1.  This needs to be
     corrected in the final version.
   */
   public int getHandValue() {
      int total = 0;
      boolean ace = false;
      for (int i = 0; i < hand.size(); i++) {
         int value = hand.get(i).getValue();
         if (value > 10){
            value = 10;
         }
         if (value == 1) {
            ace = true;
         }
         total = total + value;
      }
     
      if( ace == true && total + 10 <= 21 )
            total = total + 10;
      return total;
     
   }
}
