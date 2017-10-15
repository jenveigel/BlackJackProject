package com.skilldistillery.BlackJack;

public class Game {
	Dealer dealer;
	Player player;
	
	
	public Game() { //no args constructor
		dealer = new Dealer();
		player = new Player();
	}


	public void startNewGame() {
		
		dealer.shuffleBlackJackDeck();
		
		//dealer deals initial hands
		player.addCardToHand(dealer.drawCard());
		dealer.addCardToHand(dealer.drawCard());
		player.addCardToHand(dealer.drawCard());
		dealer.addCardToHand(dealer.drawCard());
		
	
		System.out.println("Player " + player.getHand().toString());
		player.getHand().calculateValueOfHand();
		
		//*****Need to hide card 1 and calculate value only of cards 2+
		System.out.println("Dealer Hand: [" + dealer.getHand().getHand().get(0).toString() + "]");
		System.out.println("Dealer " + dealer.getInitialValueOfHand());
	
		
		
		//Adding third card works for player
//		player.addCardToHand(dealer.drawCard());
//		System.out.println("Player " + player.getHand().toString());
//		player.getHand().calculateValueOfHand();
		
		//Adding third card to dealer works as well
		dealer.addCardToHand(dealer.drawCard());
		System.out.println("Dealer " + dealer.getHand().toString());
		dealer.getHand().calculateValueOfHand();
		
		System.out.println("Enter \"1\" to Hit or \"0\" Stay?");
		//STEP 1 - start new game; here...we are saying the player gets a new card
		//by Dealer passing the drawCard result to Player via Player's addCard method
	}
	

// getters for Dealer and Player vvvvvvvvvvvvvvvv
	
	
	
}
