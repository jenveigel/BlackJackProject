package com.skilldistillery.BlackJack;

public class Dealer  {
	Hand hand; //field variables for Hand object and Deck object
	Deck deck;
	
	public Dealer() { //no args constructor
		deck = new Deck();
		hand = new Hand();
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
	
	public void addCardToHand (Card card) {
		hand.addCardToHand(card);
	}
	
	public int getInitialValueOfHand() {
		return getHand().getHand().get(0).getRank().getValue();	
		}
		
	public Hand getHand() {
		return hand;
	}

	public Deck getDeck() {
		return deck;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
