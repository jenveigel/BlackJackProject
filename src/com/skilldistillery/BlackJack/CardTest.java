package com.skilldistillery.BlackJack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
	Card card;
	@Before
	public void setUp() throws Exception {
		card = new Card(Rank.ACE, Suit.CLUBS);
	}

	@After
	public void tearDown() throws Exception {
		card = null;
	}

	@Test
	public void test() {
		System.out.println(card.toString());
	}

}
