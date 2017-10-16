package com.skilldistillery.BlackJack;


public class GameDriver {

	
	public static void main(String[] args) {
		Game game = new Game();
				// game driver says to start a new game.
		System.out.println("Welcome. Let's play some BlackJack.");
		
				//<------- calls over to Game class to do 
		game.startNewGame();
		game.showPlayerHand();
		game.showPlayerHandValue();
		game.showDealerInitialHand();
		game.hitStayLogic();
		game.dealerHitStay();
		
		
	}

}
