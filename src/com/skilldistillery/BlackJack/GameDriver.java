package com.skilldistillery.BlackJack;

import java.util.Scanner;

public class GameDriver {

	Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		Game game = new Game();
		// game driver says to start a new game.
		System.out.println("Welcome. Let's play some BlackJack.");
		
		//<------- calls over to Game class to do 
		game.startNewGame();
		
		
	
		
		
		//Deck d = new Deck(gd.displayDeck());

		//System.out.println(d);
		
	}

}
