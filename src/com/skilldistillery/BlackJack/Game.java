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

		// Player's hand and total value is displayed
		System.out.println("\nPlayer " + player.getHand().toString());
		player.getHand().calculateValueOfHand();

		// Dealer's hand is displayed -- Hides card 2 and shows only card 1 and value of
		// card 1
		System.out.println("\nDealer Hand: [" + dealer.getHand().getHand().get(0).toString() + "]");
		System.out.println("Total " + dealer.getInitialValueOfHand());

		if (player.getHand().calculateValueOfHand() == 21) {
			System.out.println("BlackJack! You Win");
			System.exit(0);
			// except what about if dealer has 21 too...?
		}

		System.out.println("\nEnter \"1\" to Hit or \"0\" Stay?");

		String hitStayChoice = kb.next();
		while (player.getHand().calculateValueOfHand() < 21) {
			if (hitStayChoice.equals("1")) {
				player.addCardToHand(dealer.drawCard());
				System.out.println("\nPlayer " + player.getHand().toString());
				System.out.println("Total " + player.getHand().calculateValueOfHand());
			} else if (hitStayChoice.equals("0")) {
				System.out.println("You have chosen to stay at " + player.getHand().calculateValueOfHand());
			}
		}
		if (player.getHand().calculateValueOfHand() > 21) {
			System.out.println("BUST! Dealer wins. :(");
		}
		// Adding third card works for player
		// player.addCardToHand(dealer.drawCard());
		// System.out.println("Player " + player.getHand().toString());
		// player.getHand().calculateValueOfHand();

		// Adding third card to dealer works as well
		// dealer.addCardToHand(dealer.drawCard());
		// System.out.println("Dealer " + dealer.getHand().toString());
		// dealer.getHand().calculateValueOfHand();

		// STEP 1 - start new game; here...we are saying the player gets a new card
		// by Dealer passing the drawCard result to Player via Player's addCard method
	}

	// getters for Dealer and Player vvvvvvvvvvvvvvvv

}
