#BlackJack

Built a BlackJack game with dealer and one player

###Implemented the following:

*Enums with multiple parameters
*Objects
*JUnit Test
*Methods (could have used more in Game logic, but I was having trouble getting them to work)

###Used the following classes:

- Rank (Enum)
- Suit (Enum)
- Card
- Deck 
- Hand
- Player
- Dealer
- Game
- GameDriver (w/ main)

At the start of a new game, dealer shuffles the deck of cards.

Player is dealt one card, then Dealer is dealt one card.
Player is dealt a second card, then Dealer is dealt a second card which is hidden.
Player is prompted to Hit or Stay. When Player stays, game moves onto Dealer logic.

If Player hits, they are dealt another card, and prompted to make a decision again.
If Player's hand value reaches over 21, Player busts and the game ends.

Dealer's complete hand is shown. If 21, dealer wins.
If less than or equal to 16, Dealer hits and receives another card. 
If over 16 but less than 21, Dealer's hand value is compared to Player's hand value.
Greatest value wins the game. 


