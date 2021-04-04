/* Koko Aung
 * Lab4
 */
 
// import scanner
import java.util.Scanner;
//import ArrayList
import java.util.ArrayList;
//Start of class
class lab4 
{
    //Start of public
    public static void main(String[] args) 
    {
        //Declare and create Scanner object
        Scanner keyboard = new Scanner(System.in);
        //Declareing a new variable
        Deck myDeck = new Deck();
        
        Hand playerHand = new Hand();
        
        playerHand.add(myDeck.nextCard());
        //performing the shuffling
        myDeck.shuffle();
        //making a list of Card and store with hand
        ArrayList<Card> hand = new ArrayList<Card>();
        //performing shuffling
        myDeck.shuffle();
            
        //setting boolean GameTest to true
        boolean testGame = true;
        //printing out string
        System.out.println("Starting with an empty hand");
        System.out.println(" ");
        //setting total int to 0
        int total = 0;
        //while loop for GameTest
        while (testGame) 
        {
            //Declearing a new String variable called answer and setting it to "h"
            String answer = "h";
            // Asking userinput and stores as wishInput and trim
            System.out.print("Do you with to hit or stand (h/s)? ");
            String wishInput = keyboard.nextLine();
            wishInput = wishInput.trim();
            
            // if the wishInput is equal to answer
            if (wishInput.equals(answer)) 
            {
                //making the card array and storing the 1 card
                Card [] card = new Card [1];
                //Getting the card from the mydeck and store the nextCard as Card[0]
                card[0] = myDeck.nextCard();
                //stoing all card into hand
                hand.add(card[0]);
                //making for loop as cards 
                for (Card cards: card ) 
                {
                    //geting cardValue and stores value
                    int value = cards.getValue();
                    //printing string with name of card, card array
                    System.out.println("Your card: " + card[0]);
                    System.out.println("Hit after drawing card: " + hand);
                    //adding value each time it runs and stores as total
                    total += value;
                    //if the total is less than or equal to 21
                    if(total <= 21)
                    {
                        //print out string with number
                        System.out.println("Hand value:" + total);
                    }
                    //if the tital is greater than 21
                    else if (total >21)
                    {
                        //it will print out string and number
                        System.out.println("Hand value:" + total);
                        System.out.println("Sorry you busted");
                        //setting testGame as false to stop the loop
                        testGame = false;
                    }
                }
            }
            //if the wishInput is equal to s
            if (wishInput.equals("s"))
            { 
                //setting testGame as false to stop the loop
                testGame = false;
            }
        }
        
    } // end of public 
} //end of class



/*
 * Sample RunStarting with an empty hand
 
Do you with to hit or stand (h/s)? h
Your card: Eight of SPADES
Hit after drawing card: [Eight of SPADES]
Hand value:8
Do you with to hit or stand (h/s)? h
Your card: Seven of HEARTS
Hit after drawing card: [Eight of SPADES, Seven of HEARTS]
Hand value:15
Do you with to hit or stand (h/s)? h
Your card: Queen of DIAMONDS
Hit after drawing card: [Eight of SPADES, Seven of HEARTS, Queen of DIAMONDS]
Hand value:27
Sorry you busted


Starting with an empty hand
 
Do you with to hit or stand (h/s)? h
Your card: Ten of HEARTS
Hit after drawing card: [Ten of HEARTS]
Hand value:10
Do you with to hit or stand (h/s)? h
Your card: Jack of SPADES
Hit after drawing card: [Ten of HEARTS, Jack of SPADES]
Hand value:21
Do you with to hit or stand (h/s)? s


Starting with an empty hand
 
Do you with to hit or stand (h/s)? h
Your card: Jack of SPADES
Hit after drawing card: [Jack of SPADES]
Hand value:11
Do you with to hit or stand (h/s)? h
Your card: Jack of HEARTS
Hit after drawing card: [Jack of SPADES, Jack of HEARTS]
Hand value:22
Sorry you busted
* 
*/
