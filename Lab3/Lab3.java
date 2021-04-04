/* Koko aung
 * Lab 3
 */

class Lab3 {  // start of class

   public static void main(String[] args) { // start of entry point
   
      Deck myDeck = new Deck();  // storing Deck as myDeck
      
      myDeck.shuffle();  // using shuffle functions from Deckfiles
      
      Card [] cards = new Card[10];  // making array of 10 with Card and storing into cards
      
      for (int i = 0; i < 10; i++) {	// print 10 cards before shuffling
      	
        cards[i] = myDeck.nextCard();  // storing each card from myDeck into cards array by using nextCard functions

     }
     
     for (Card card : cards ) { // start of for loop with cards as card
     
        System.out.println(card);  // printing out each card from array
        
        Card.Suit suit = card.getSuit(); // stroing getSuit function in to suit
        
        int value = card.getValue();  // storing getValue as value and interger

        if (( suit == Card.Suit.HEARTS) || ( suit == Card.Suit.DIAMONDS)) {  // if card is Heart ot Diamonds are equal, it will print out as "card is red"
        
        	System.out.println("Card is red");
        }
        else {   // else it will print out "card is black"
        	System.out.println("Card is black ");
        } 
        if (value < 6) {   //if the value of the card is less than 6, it will print out "card has a small value"
            System.out.println("Card has a small value");
        }
        else if (value >= 6 && value <= 10) {  //any card value from 6  to 10 , it will print out as "card has a large value"
            System.out.println("Card has a large value");
        }
        else {   //any number greater than 10 will be print as That's a picture card
            System.out.println("That's a picture card");
        }
        System.out.println("  ");  // this is for skipping
        
     } // end of for loop
     
   }  // end of entry point
   
}  // end of class
