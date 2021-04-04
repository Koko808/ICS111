/*
 * Set done to false
 * While not done
 *    Ask user to enter a name or blank when done, store as name
 *    Trim name
 *    If name is ""
 *       Set done to true
 *    Else
 *       Add name to names
 */

import java.util.*; // Scanner, ArrayList

class ReadIntoArrayList {
   public static void main(String[] args) {
      Scanner keyb = new Scanner(System.in);
      ArrayList<String> names = new ArrayList<String>();
      boolean done = false;

      while (!done) {
         System.out.print("Enter a name or leave blank when done: ");
         String name = keyb.nextLine().trim();
         if (name.equals("")) {
            done = true;
         }
         else {
            names.add(name);
         }
      } // end while

      for (String name : names) {
         System.out.println(name);
      }

   } // end main
}
