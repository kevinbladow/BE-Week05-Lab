package week05;

//2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Deck {

	
	// define properties

	List<Card> cards = new ArrayList<Card>();  //define the ArrayList
	
	public Deck() {
		
		String[] suits = {"Clubs", "Spades", "Hearts","Diamonds"}; //define suits
		String[] names = {"Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King", "Ace"};  // define names
	
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < names.length; j++) {

				Card playingCard = new Card();   // could also just call the card object directly/
				playingCard.setName(names[j]);
				playingCard.setSuit(suits[i]);
				playingCard.setValue(j+2);
				this.cards.add(playingCard);
					} // end for j loop
				} // end for i loop
	}
	
	// getters and setters

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	
	public void shuffle() {// method shuffle
		
		Random random = new Random();  // call random class or look at collections.shuffle method
		
		
		for (int i = 0; i < cards.size(); i ++) {
			cards.set(random.nextInt(52),cards.get(i));
					System.out.println("Number " + i + "\t" + random.nextInt(52));  // diagnostic
		}
	}
	
		/*
		 * -----------------alternate shuffle method to maybe try
		 * import java.util.*;
	
	public class Shuffle {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList(args);
	        Collections.shuffle(list);
	        System.out.println(list);
	    }
	}
		 */
	
	
	public Card draw() { // method draw. draw a card, removing that card from the deck and reducing the number of cards in the deck by one
		Card card = this.cards.remove(0);  // removes the top card
		/* my code was the hard way
		  
		 Card card = new Card();
		
		card = cards.get(0);        // copy the top card object
		for (int i = 0; i < cards.size(); i ++) {
			if (cards.get(i).getName() !="null") {
				cards.set(i,cards.get(i+1));
				cards.get(cards.size()-1 -i).setName("null");
				cards.get(cards.size()-1 -i).setSuit("null");
				cards.get(cards.size()-1 -i).setValue(0);	// be carefull not to lose track of the cards.  All cards still need a value, but must be flagged as dealt
			} 
		}*/
	return card;
		
		
	}
		
	public void describe() {
		System.out.println("Deck of cards:-------------------------");
		for (Card card : this.cards) {
			card.describe();
		}
	}
}
		
 
