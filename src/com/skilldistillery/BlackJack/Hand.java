package com.skilldistillery.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	private List<Card> hand; 
	//need two new hands. one for Player and one for Dealer--put each in it's own class

	public Hand() { //no args constructor 
		hand = new ArrayList<>();
	}
	

	public List<Card> getHand() { //getter for Hand which is a list of cards
		return hand;
	}
	
	public void addCardToHand (Card card) {
		hand.add(card);
	}
	
	
	public int calculateValueOfHand() {
		int handValue = 0;
		for (int i = 0; i < hand.size(); i++) {
			handValue += hand.get(i).getRank().getValue();
			
		}
		return handValue;
	
	}
	
	public int getHandSize() {
//		int handSize = 0;
//		handSize = hand.size();
//	return handSize;
		return hand.size();
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand: ");
		builder.append(hand);
		return builder.toString();
	}
	
	
	
	//will need to make a new hand for Player of cards 1 and 3 from deck
	
	//will need to make new hand for Dealer of cards 2 and 4 from deck
	
	// <---- Jump to Player
	
	//will need to add cards when requested by Player or Dealer
}
