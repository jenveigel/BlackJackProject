package com.skilldistillery.BlackJack;

import java.util.Scanner;

public class Game {
	Dealer dealer;
	Player player;

	Scanner kb = new Scanner(System.in);

	public Game() { // no args constructor
		dealer = new Dealer();
		player = new Player();
	}

	public void startNewGame() {

		dealer.shuffleBlackJackDeck();

		// dealer deals initial hands
		player.addCardToHand(dealer.drawCard());
		dealer.addCardToHand(dealer.drawCard());
		player.addCardToHand(dealer.drawCard());
		dealer.addCardToHand(dealer.drawCard());
	}

	// Player's hand and total value is displayed
	public void showPlayerHand() {
		System.out.println("\nPlayer " + player.getHand().toString());
	}

	public void showPlayerHandValue() {
		// int playerHandValue = player.getHand().calculateValueOfHand();
		System.out.println("Total " + player.getHand().calculateValueOfHand());
		// return playerHandValue;
	}

	public void showDealerHand() {
		System.out.println("\nDealer Hand: [" + dealer.getHand().toString() + "]");
	}

	public void showDealerHandValue() {
		System.out.println("Total " + dealer.getHand().calculateValueOfHand());
	}

	public void showDealerInitialHand() { // Hides card 2: shows only card 1 & value of card 1
		System.out.println("\nDealer Hand: [" + dealer.getHand().getHand().get(0).toString() + "]");
		System.out.println("Total " + dealer.getInitialValueOfHand());
	}

	public void hitStayLogic() {
		if (player.getHand().calculateValueOfHand() == 21) { // what if dealer has 21 too...?
			System.out.println("BlackJack! You Win");
			System.exit(0);
		}

		System.out.println("\nEnter \"1\" to Hit or \"0\" Stay?");
		String hitStayChoice = kb.next();

		if (hitStayChoice.equals("0")) {
			System.out.println("You have chosen to stay at " + player.getHand().calculateValueOfHand());
		} else if (hitStayChoice.equals("1")) {
			
			do { 
			player.addCardToHand(dealer.drawCard());
			System.out.println("\nPlayer " + player.getHand().toString());
			System.out.println("Total " + player.getHand().calculateValueOfHand());
					
			if (player.getHand().calculateValueOfHand() == 21) {
				System.out.println("BlackJack! You Win");
				System.exit(0);
			} else if (player.getHand().calculateValueOfHand() > 21) {
				System.out.println("BUST! Dealer wins. :(");
				System.exit(0);
			} else if (player.getHand().calculateValueOfHand() < 21) {		
					System.out.println("\nEnter \"1\" to Hit or \"0\" Stay?");
					hitStayChoice = kb.next();
					if (hitStayChoice.equals("0")){
						System.out.println("You have chosen to stay at " + player.getHand().calculateValueOfHand());
					}
				} 
			}while (hitStayChoice.equals("1"));

		}

		System.out.println("");
	}

	public boolean dealerHitStay() {
		System.out.println("\nDealer " + dealer.getHand().toString() + "]");
		System.out.println("Dealer's total is " + dealer.getHand().calculateValueOfHand());
		while (dealer.getHand().calculateValueOfHand() <= 16) {
			System.out.println("Dealer Hits");
			dealer.addCardToHand(dealer.drawCard());
			System.out.println("\nDealer " + dealer.getHand().toString() + "]");
			System.out.println("Dealer's total is " + dealer.getHand().calculateValueOfHand());
			if (dealer.getHand().calculateValueOfHand() > 21) {
				System.out.println("Dealer busted. You win!");
			}
		}
		if (dealer.getHand().calculateValueOfHand() > player.getHand().calculateValueOfHand()) {
			System.out.println("\nDealer wins.");
		}
		if (dealer.getHand().calculateValueOfHand() < player.getHand().calculateValueOfHand()) {
			System.out.println("\nYOU WIN!");
		}
		if (dealer.getHand().calculateValueOfHand() == player.getHand().calculateValueOfHand()) {
			System.out.println("Push...or...it would be a Push if you were betting money.");
		}
		return true;
	}
}
