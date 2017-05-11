package edu.mcc.java1.blackjack;

import java.util.ArrayList;
import java.util.Random;

//A standard deck of cards has 52 cards
public class Deck 
{
	private static ArrayList<Cards> freshDeck, shuffledDeck;
	private static final String ACES_S = "Ace (Spades)";
	private static final String ACES_H = "Ace (Hearts)";
	private static final String ACES_C = "Ace (Clubs)";
	private static final String ACES_D = "Ace (Diamonds)";
	private static final String TWO_S = "Two (Spades)";
	private static final String TWO_H = "Two (Hearts)";
	private static final String TWO_C = "Two (Clubs)";
	private static final String TWO_D = "Two (Diamonds)";
	private static final String THREE_S = "Three (Spades)";
	private static final String THREE_H = "Three (Hearts)";
	private static final String THREE_C = "Three (Clubs)";
	private static final String THREE_D = "Three (Diamonds)";
	private static final String FOUR_S = "Four (Spades)";
	private static final String FOUR_H = "Four (Hearts)";
	private static final String FOUR_C = "Four (Clubs)";
	private static final String FOUR_D = "Four (Diamonds)";
	private static final String FIVE_S = "Five (Spades)";
	private static final String FIVE_H = "Five (Hearts)";
	private static final String FIVE_C = "Five (Clubs)";
	private static final String FIVE_D = "Five (Diamonds)";
	private static final String SIX_S = "Six (Spades)";
	private static final String SIX_H = "Six (Hearts)";
	private static final String SIX_C = "Six (Clubs)";
	private static final String SIX_D = "Six (Diamonds)";
	private static final String SEVEN_S = "Seven (Spades)";
	private static final String SEVEN_H = "Seven (Hearts)";
	private static final String SEVEN_C = "Seven (Clubs)";
	private static final String SEVEN_D = "Seven (Diamonds)";
	private static final String EIGHT_S = "Eight (Spades)";
	private static final String EIGHT_H = "Eight (Hearts)";
	private static final String EIGHT_C = "Eight (Clubs)";
	private static final String EIGHT_D = "Eight (Diamonds)";
	private static final String NINE_S = "Nine (Spades)";
	private static final String NINE_H = "Nine (Hearts)";
	private static final String NINE_C = "Nine (Clubs)";
	private static final String NINE_D = "Nine (Diamonds)";
	private static final String TEN_S = "Ten (Spades)";
	private static final String TEN_H = "Ten (Hearts)";
	private static final String TEN_C = "Ten (Clubs)";
	private static final String TEN_D = "Ten (Diamonds)";
	private static final String JACK_S = "Jack (Spades)";
	private static final String JACK_H = "Jack (Hearts)";
	private static final String JACK_C = "Jack (Clubs)";
	private static final String JACK_D = "Jack (Diamonds)";
	private static final String QUEEN_S = "Queen (Spades)";
	private static final String QUEEN_H = "Queen (Hearts)";
	private static final String QUEEN_C = "Queen (Clubs)";
	private static final String QUEEN_D = "Queen (Diamonds)";
	private static final String KING_S = "King (Spades)";
	private static final String KING_H = "King (hearts)";
	private static final String KING_C = "King (Clubs)";
	private static final String KING_D = "King (Diamonds)";
	
	public Deck()
	{
		shuffledDeck = new ArrayList<>(52);
		freshDeck = new ArrayList<>(52);
		freshDeck.add(new Cards(ACES_S));
		freshDeck.add(new Cards(ACES_H));
		freshDeck.add(new Cards(ACES_C));
		freshDeck.add(new Cards(ACES_D));
		freshDeck.add(new Cards(TWO_S));
		freshDeck.add(new Cards(TWO_H));
		freshDeck.add(new Cards(TWO_C));
		freshDeck.add(new Cards(TWO_D));
		freshDeck.add(new Cards(THREE_S));
		freshDeck.add(new Cards(THREE_H));
		freshDeck.add(new Cards(THREE_C));
		freshDeck.add(new Cards(THREE_D));
		freshDeck.add(new Cards(FOUR_S));
		freshDeck.add(new Cards(FOUR_H));
		freshDeck.add(new Cards(FOUR_C));
		freshDeck.add(new Cards(FOUR_D));
		freshDeck.add(new Cards(FIVE_S));
		freshDeck.add(new Cards(FIVE_H));
		freshDeck.add(new Cards(FIVE_C));
		freshDeck.add(new Cards(FIVE_D));
		freshDeck.add(new Cards(SIX_S));
		freshDeck.add(new Cards(SIX_H));
		freshDeck.add(new Cards(SIX_C));
		freshDeck.add(new Cards(SIX_D));
		freshDeck.add(new Cards(SEVEN_S));
		freshDeck.add(new Cards(SEVEN_H));
		freshDeck.add(new Cards(SEVEN_C));
		freshDeck.add(new Cards(SEVEN_D));
		freshDeck.add(new Cards(EIGHT_S));
		freshDeck.add(new Cards(EIGHT_H));
		freshDeck.add(new Cards(EIGHT_C));
		freshDeck.add(new Cards(EIGHT_D));
		freshDeck.add(new Cards(NINE_S));
		freshDeck.add(new Cards(NINE_H));
		freshDeck.add(new Cards(NINE_C));
		freshDeck.add(new Cards(NINE_D));
		freshDeck.add(new Cards(TEN_S));
		freshDeck.add(new Cards(TEN_H));
		freshDeck.add(new Cards(TEN_C));
		freshDeck.add(new Cards(TEN_D));
		freshDeck.add(new Cards(JACK_S));
		freshDeck.add(new Cards(JACK_H));
		freshDeck.add(new Cards(JACK_C));
		freshDeck.add(new Cards(JACK_D));
		freshDeck.add(new Cards(QUEEN_S));
		freshDeck.add(new Cards(QUEEN_H));
		freshDeck.add(new Cards(QUEEN_C));
		freshDeck.add(new Cards(QUEEN_D));
		freshDeck.add(new Cards(KING_S));
		freshDeck.add(new Cards(KING_H));
		freshDeck.add(new Cards(KING_C));
		freshDeck.add(new Cards(KING_D));
	}
	
	public ArrayList<Cards> shuffle()
	{
		Random rnd = new Random();
		int location;
		
		while(freshDeck.size() > 0)
		{
			location = rnd.nextInt(freshDeck.size());
			shuffledDeck.add(freshDeck.get(location));
			freshDeck.remove(location);
		}
		
		return shuffledDeck;
	}
	
	public ArrayList<Cards> shuffle(ArrayList<Cards> list)
	{
		ArrayList<Cards> afterShuffle = new ArrayList<>(52);
		Random rnd = new Random();
		int location;		
		
		while(list.size() > 0)
		{
			location = rnd.nextInt(list.size());
			afterShuffle.add(list.get(location));
			list.remove(location);
		}
		
		return afterShuffle;
	}
	
}
