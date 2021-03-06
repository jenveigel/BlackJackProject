package com.skilldistillery.BlackJack;

public class Card {
	private Rank rank; //do I need to change this? And if so, will it jack up Deck class?
	private Suit suit;
	
	
	public Card(Rank r, Suit s) {
		rank = r;
		suit = s;
	}
	

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(rank);
		builder.append(" of ");
		builder.append(suit.pic);
		return builder.toString();
	}

		//auto-created w/ Eclipse source menu
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

		//auto-created w/ Eclipse source menu
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
}
