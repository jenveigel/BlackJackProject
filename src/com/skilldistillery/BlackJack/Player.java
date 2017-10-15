package com.skilldistillery.BlackJack;

public class Player {
	
	Hand hand; //declare field of type Hand
	
	public Player () { // no args constructor
		hand = new Hand();
	}
	
	

	public void addCardToHand (Card card) {
		hand.addCardToHand(card);
	
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
