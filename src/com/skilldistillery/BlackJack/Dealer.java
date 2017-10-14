package com.skilldistillery.BlackJack;

public class Dealer {
	Hand hand; //field variables for Hand object and Deck object
	Deck deck;
	
	public Dealer() { //no args constructor
		this.deck = new Deck();
	}
	
	public Dealer(Hand hand, Deck deck) { //constructor w/ hand & deck
		this.hand = hand;
		this.deck = deck;
	}
	
	public void shuffleBlackJackDeck() {
		deck.shuffleDeck();
	}
	
	public Card drawCard() {
		return deck.removePlayedCardFromDeck();
		
	}

	public Hand getHand() {
		return hand;
	}

	public Deck getDeck() {
		return deck;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
