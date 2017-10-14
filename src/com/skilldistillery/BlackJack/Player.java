package com.skilldistillery.BlackJack;

public class Player {
	
	Hand hand; //declare field of type Hand
	
	public Player () { // no args constructor
		
	}
	
	public Player(Hand hand) { //constructor using fields
		this.hand = hand;
	}
	

	public int addCardToHand (Card card) {
		hand.addCardToHand(card);
		return hand.get(0).getRank().getValue();
	}
	

	public void hitStayInput() {
		//need to decide, when prompted, if hit or stay ----> in Driver or here?
		//display values of card 1 and 3 (later display cards / unicode)
		//display combined value of card SET and ask hit or stay
		//if hit, call on the removeCardFromDeck and put that card in Player hand
		//if stay, display "you have stayed with SET VALUE"
	}




	public Hand getHand() { //getter
		return hand;
	}
	
	
}
