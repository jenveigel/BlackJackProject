package com.skilldistillery.BlackJack;

public class Game {
	Dealer dealer;
	Player player;
	
	
	public Game() { //no args constructor
		dealer = new Dealer();
		player = new Player();
	}


	public void startNewGame() {
		player.addCardToHand(dealer.drawCard());
			
		//STEP 1 - start new game; here...we are saying the player gets a new card
		//by Dealer passing the drawCard result to Player via Player's addCard method
	}
	

// getters for Dealer and Player vvvvvvvvvvvvvvvv
	
	
	
}
