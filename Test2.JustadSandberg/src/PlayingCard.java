
public class PlayingCard {
	
	private String suit;
	private String rank;
	
	public PlayingCard(String suit, String rank) {
		this.suit = suit;
		this.rank=rank;
	}

	public String getSuit() {
		return suit;
	}


	public String getRank() {
		return rank;
	}



	@Override
	public int hashCode() {
		 int hash = 31;
		 hash = hash + rank.hashCode();
		 hash = hash + suit.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		PlayingCard test = (PlayingCard) obj;
		return suit.equals(test.suit) && rank.equals(test.rank);
		
		
	
	}
	@Override 
	public String toString() {
		
		return (this.rank + " of " + this.suit +"'s");
	}
	
}
