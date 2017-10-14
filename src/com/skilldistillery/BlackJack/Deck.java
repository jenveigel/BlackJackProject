package com.skilldistillery.BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	private Card card;
	
	private List<Card> deck = new ArrayList<>(52);
	


	public Deck(List<Card> deck) { // no args constructor -- probably not needed...
		this.deck = deck;
	}

	public Deck() { // Deck constructor vvvvvvvv this is how we get a deck

		for (Rank r : Rank.values()) {
			for (Suit s : Suit.values()) {
				deck.add(new Card(r, s)); // can we do addAll?
			}
		}
	}
	
	public Card removePlayedCardFromDeck() {
			return deck.remove(0); //need old value and new value
		}
	
	public void displayDeck() {
		for (Card card : deck) {
			System.out.println(card);
		}
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
		for (Card card : deck) {
			System.out.println("******Shuffled Deck********");
			System.out.println(card);
		}
	}
}