package com.skilldistillery.BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public static void main(String[] args) {
		List<Card> deck = new ArrayList<>(52);

		// for (Suit s : Suit.values()) {
		// for (Rank r : Rank.values()) {
		// deck.add(new Card(r, s));
		// }
		// }

		for (Rank r : Rank.values()) {
			for (Suit s : Suit.values()) {
				deck.add(new Card(s, r));
			}
		}

		for (Card card : deck) {
			System.out.println(card);
		}

		System.out.println("******Shuffled Deck********");

		Collections.shuffle(deck);
		for (Card card : deck) {
			System.out.println(card);

		}

	}
}