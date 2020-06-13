import java.util.ArrayList;

public class CardGameHand {

	 
	private int handSize;
	private ArrayList <PlayingCard> cardHand = new ArrayList<PlayingCard>();
	/*
	public class ArrayList<E>{
		private static final int defaultsize = 52;
		private E [] elements;
		private int size;
		
	}	
		*/
	
	 

	 
	public CardGameHand(int handSize) {
		this.handSize = handSize;
	}
	
	
	public void addCard(PlayingCard card) {
		this.cardHand.add(card);
		
	}
	
	public void removeCard(PlayingCard card) {
		this.cardHand.remove(card);
		
	}
	public void printSuit(String suit) {
		for(int i=0; i < cardHand.size(); i++ ) {
			if (this.cardHand.get(i).getSuit().equals(suit)) {
				System.out.println(this.cardHand.get(i).getRank());
			}


		}
		
	}
	
	public void printRank(String rank) {
		for(int i=0; i < cardHand.size(); i++ ) {
			if (this.cardHand.get(i).getRank().equals(rank)) {
				System.out.println(this.cardHand.get(i).getSuit());
			}


		}
		
	}
	
	 public boolean clear() {
		 int size = cardHand.size();
	        for (int i=0; i < size; i++) {
	        	   this.cardHand.remove(0);
	        }
	         
	        
	        return true;
	    }
	    
	 @Override
	 public String toString() {
		 if (this.cardHand.size()==0) {
			 return "[]";
		 }
		 else {
			 StringBuilder sb = new StringBuilder("[");
		 for(int i=0; i < cardHand.size(); i++ ) {
			sb.append("["+this.cardHand.get(i).toString() + "]\n");
		 }
		 return sb.toString();
		 }
	 }
	public static void main(String[] args) {

		PlayingCard card1 = new PlayingCard("Spade","Ace");
		PlayingCard card2 = new PlayingCard("Spade","One");
		PlayingCard card3 = new PlayingCard("Spade","Two");
		PlayingCard card4 = new PlayingCard("Club","Five");
		PlayingCard card5 = new PlayingCard("Club","Five");
		PlayingCard card6 = new PlayingCard("Club","King");
		PlayingCard card7 = new PlayingCard("Heart","One");
		PlayingCard card8 = new PlayingCard("Heart","Seven");
		PlayingCard card9 = new PlayingCard("Heart","Two");
		PlayingCard card10 = new PlayingCard("Diamond","Queen");
		PlayingCard card11 = new PlayingCard("Diamond","Ace");
		PlayingCard card12 = new PlayingCard("Club","Five");
		
		
		
		CardGameHand test = new CardGameHand(12);
		test.addCard(card1);
		test.addCard(card2);
		test.addCard(card3);
		test.addCard(card4);
		test.addCard(card5);
		test.addCard(card6);
		test.addCard(card7);
		test.addCard(card8);
		test.addCard(card9);
		test.addCard(card10);
		test.addCard(card11);
		test.addCard(card12);
		
		System.out.println(test.toString());
		//testing printSuit and printRank
		System.out.println(">---Diamonds");
		test.printSuit("Diamonds");
		System.out.println(">---Spades");
		test.printSuit("Spades");
		System.out.println(">----Hearts");
		test.printSuit("Hearts");
		System.out.println(">----Clubs");
		test.printSuit("Clubs");
		
		System.out.println(">---One");
		test.printRank("One");
		System.out.println(">---Two");
		test.printRank("Two");
		System.out.println(">----Ace");
		test.printRank("Ace");
		System.out.println(">----Queen");
		test.printRank("Queen");
		//remove card works
		test.removeCard(card12);
		test.removeCard(card11);
		System.out.println(test.toString());
		
		//clear works
				test.clear();
		
				System.out.println(test.toString());
	}
}
