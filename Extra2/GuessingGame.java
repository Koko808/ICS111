/*Koko Aung
 * 10/5/2020
 * GuessingGame
 */

import java.util.Scanner;
class GuessingGame 
{
    
    public static void main(String[] args) 
    {
      Scanner keyb = new Scanner(System.in);
      boolean gameRunning = true;
      while (gameRunning) 
      {
        int answer = 60;
        System.out.print("Guess a number 1 to 100 here: ");
        String guessString = keyb.nextLine();
        guessString = guessString.trim();
        int guess = Integer.parseInt(guessString);
         
        if (guess > answer){
            System.out.println("Too high, guess lower");
        }
        else if (guess < answer){
            System.out.println("Too low, guess higher");
        }
        else
        {
            System.out.println("Yay, you got it");
            gameRunning = false;
        }
      }
    }
}
