/* Koko Aung
* Project1
* 
*/

/*While programRunning
 *  player while loop
 *  dealer while loop
 *  Ask user to play again (y/n)?andstore response
 *  If response is not "y"
 *      Set programRunning to false
 *
 */
 // Import scanner
import java.util.Scanner;
class project1
{
    public static void main(String[] args)
    {
        //declare and create scanner object
        Scanner keyb = new Scanner(System.in);
        //setting boolean program run to true
        boolean programRun = true;
        //declaring total as an int and setting value to 0
        int total = 0;
        //declaring total1 as an int and setting value to 0
        int total1 = 0;
        //while loop for ProgramRun
        while (programRun)
        {
            //declaring a new variable called myDeck
            Deck myDeck = new Deck();
            //performing the shuffling function of the myDeck
            myDeck.shuffle();
            //declaring a new variable called playerHand
            Hand playerHand = new Hand();
            //declaring a new variable called dealerHand
            Hand dealerHand = new Hand();
            //adding a playerhand card into the player's next card
            playerHand.add(myDeck.nextCard());
            //adding a dealerhand card into the dealer's next card
            dealerHand.add(myDeck.nextCard());
            playerHand.add(myDeck.nextCard());
            //using next card function for card upCard
            Card upCard = myDeck.nextCard();
            //add function for dealerhand in upcard
            dealerHand.add(upCard);
            //printing dealer's upcard
            System.out.println("Dealer's upcard is " + upCard);
            //printing player's cards
            System.out.println("Players cards:\n" + playerHand);
            //setting boolean playerplaying to true
            boolean playerPlaying = true;
            boolean dealerPlaying = true;
            //declaring pHand as an int and set value to 0
            int pHand = 0;
            int dHand = 0;
            //using the gethandvalue function for phand and dhand
            dHand = playerHand.getHandValue();
            pHand = playerHand.getHandValue();
            System.out.println("Your Hand is " + pHand);
           
            // player while loop
            while (playerPlaying)
            {
                //if playerhand equals to 21, it will print you won
                //and ends the program
                if (pHand == 21)
                {
                    System.out.println("you have won");
                    playerPlaying = false;
                }
                //if player hand not equal to 21
                //program will ask player if they want to hit or sit
                if (pHand != 21)
                {
                    System.out.print("Do you wish to hit or stand (h/s)? ");
                    String wishInput = keyb.nextLine().trim();
                   // if user answer h ot hit, they will be given another card
                    if (wishInput.equals("h"))
                    {
                        Card [] card = new Card [1];
                        card[0] = myDeck.nextCard();
                        playerHand.add(card[0]);
                        System.out.println(playerHand);
                       //for loop for the cards
                        for (Card cards: card)
                        {
                            //storinf playerhand into total1
                            total1 = pHand;
                            //value declared as an int and using the get value function
                            int value = card[0].getValue();
                            //if value greater than or equal 10
                            //value will be set to 10
                            if (value >= 10)
                            {
                                value = 10;
                            }//if value equal to 1
                            else if (value == 1)
                            {   //if playerhand less than or equal to 10
                                //value will be set to 11
                                if (pHand <= 10)
                                {
                                    value = 11;
                                }//if phand is less than 10, value is 1
                                else if (pHand > 10)
                                {
                                    value = 1;
                                }
                            }//adding total1 and value and storing to total
                            total = total1 + value;
                            //storing total into playerhand
                            pHand = total;
                            System.out.println(card[0]);
                           //if total is lessthan or eqaul to 21, player wins
                           //program stops
                            if (total <= 21)
                            {
                                if (total == 21)
                                {
                                    System.out.println("Player got 21");
                                    System.out.println("Player win");
                                    playerPlaying = false;
                                    programRun = false;
                                }
                                else
                                {
                                    System.out.println("Hand value: " + total);
                                }
                            }//if total is greater than 21, player loses
                            else if (total > 21)
                            {
                                System.out.println("Hand Value:" + total);
                                System.out.println("Sorry you busted");
                                //System.out.println("Dealer won");
                                playerPlaying = false;
                                programRun = true;
                                //dealerPlaying = true;
                            }
                       
                        }
                    }
                   // if player wishes to sit, program stops
                    if (wishInput.equals("s"))
                    {
                        playerPlaying = false;
                    }
               
                }
            }//while loop for dealer playing
           
             while(dealerPlaying)
            {
               //if dealer's hand is greater or equal to 17
                if (dHand >= 17)
                {   // it will print out dealers hand value
                    System.out.println("Dealer hand:" + dealerHand);
                    System.out.println("Dealer Hand value:"+dHand);
                    //and dealerPlayin loop will set to false
                    dealerPlaying = false;
                   
                }
                //if dealerhand is less than 17
                if (dHand < 17)
                {   //it will add a new card into the dealers hand
                    Card [] card = new Card [1];
                    card[0] = myDeck.nextCard();
                    dealerHand.add(card[0]);
                    //printing dealers cards
                    System.out.println("Dealer hand after drawing card:" + dealerHand);
                    //for loop for card in cards
                    for (Card cards: card)
                    {
                        //storing dealer hand into total1
                        total1 = dHand;
                        //declaring value as int, and using getvalue function
                        int value = card[0].getValue();
                        //if value is greater or equal to 10
                        if (value >= 10)
                        {
                            //value will be set to 10
                            value = 10;
                        }
                        //if value equal to 1
                        else if (value == 1)
                        {   //if dealer hand is less or equal to 10
                            if(dHand <= 10)
                            {   //value is set to 11
                                value = 11;
                            }//if dealer hand is greater than 10
                            else if (dHand > 10)
                            {   //value is set to 1
                                value = 1;
                            }
                        }//adding total1 and value and storing intp total
                        total = total1 + value;
                        //storing total into dealer hand
                        dHand = total;
                       //if dealerhand is less or equal to 21
                        if (dHand <= 21)
                        {   //if dealer hand equals to 21, dealer wins
                            // and dealer playing while loop is set to false
                            if (dHand == 21)
                            {
                                //System.out.println("You lose");
                                dealerPlaying = false;
                            }
                            else
                            {   //printing out dealer hand value
                                System.out.println("Dealer hand value:" + dHand);
                                //System.out.println("Dealer won");
                            }
                        }//id dealer hand is greater than 21
                        else if (dHand > 21)
                        {   //dealer loses or busts
                            System.out.println("Dealer hand value:" + dHand);
                            System.out.println("Dealer bust");
                            //System.out.println("Player win");
                        }
                    }//setting boolean dealerPlaying to false
                    dealerPlaying = false;
                }
            }//if player hand and dealer hand is not equal to 21
            if (pHand != 21 && dHand != 21)
            {   //if player and dealerhand less than or equal to 21
                if (pHand <=21 && dHand <=21)
                {   //if phand value is greater than dealerhand,
                    //player wins
                    if(pHand > dHand)
                    {
                        System.out.println("Player won");
                    }
                    else if(dHand > pHand)
                    {   //else dealer wins
                        System.out.println("Dealer won");
                    }
                }
            }
            if(pHand == dHand)
            {
                System.out.println("Tie");
            }

            //if player wants to play again, program will return to the while loop
            //player will be able to play again
            System.out.print("Do you want to play again (y/n)? ");
            String response = keyb.nextLine().trim();
            System.out.println(" ");
            //if player's response is not y, program ends
            if (!response.equalsIgnoreCase("y"))
            {
            programRun = false;
            }
        }
    }
}
