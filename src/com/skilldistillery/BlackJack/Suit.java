package com.skilldistillery.BlackJack;

public enum Suit {
    HEARTS('\u2665'), SPADES('\u2660'), CLUBS('\u2663'), DIAMONDS('\u2666');  //in ordinal value here 
    
    public final char pic;

	Suit(char pic) {
		this.pic = pic;
	}

//	public char getPic() {
//		return pic;
//	}
    
    //suit.ordinal()
}
