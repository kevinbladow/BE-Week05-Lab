package week05;


public class Card {  //Class for playing card
	
		// define properties
		private String name;
		private String suit;
		private int value;
		
		public Card() {} // default constructor to create without args
		
		
		public Card(String name, String suit,int value) {  // assign characteristics
			this.name = name;
			this.suit = suit;
			this.value = value;
		}

		// Getters and Setters 
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getSuit() {
			return suit;
		}


		public void setSuit(String suit) {
			this.suit = suit;
		}


		public int getValue() {
			return value;
		}


		public void setValue(int value) {
			this.value = value;
		}
		
		public void describe() {  //used to give information about the specific card
			
		System.out.println("Card Description : The " + this.name + " of " + this.suit + " with a value of " + this.value);
		//System.out.println("----------------");
		//System.out.println("The " + name + " of " + suit + " with a value of " + value);
	
		}
}
