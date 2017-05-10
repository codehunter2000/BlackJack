package edu.mcc.java1.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game 
{
	Deck cards;
	ArrayList<Cards> deck, computerHand, player1Hand;
	Player computer, player1;
	static int player1Score, computerScore;
	
	public Game()
	{
		System.out.println("Please enter your name: ");
		Scanner keyboard = new Scanner(System.in);
		String userName = keyboard.nextLine();
		cards = new Deck();
		deck = new ArrayList<Cards>();
		computerHand = new ArrayList<>();
		player1Hand = new ArrayList<>();
		computer = new Player("Computer");
		player1 = new Player(userName);
		keyboard.close();
		deal();
		play();
	}
	
	public void deal()
	{
		computerHand.add(deck.get(0));
		deck.remove(0);
		player1Hand.add(deck.get(0));
		deck.remove(0);
		computerHand.add(deck.get(0));
		deck.remove(0);
		player1Hand.add(deck.get(0));
		deck.remove(0);
		calcScore();
	}
	
	public void computersMove()
	{
		if (computerScore <= 15)
		{
			computerHand.add(deck.get(0));
			deck.remove(0);
			System.out.println("Computer hits. \n");
		}
		
		else
			System.out.println("Computer stands. \n");
	}
	
	public void play()
	{
		boolean done = false;
		String choice;
		char stayOrGo;
		while (!done)
		{
			System.out.println(player1.getName() + "'s hand");
			for (Cards card : player1Hand)
				System.out.println(card.getName());
			System.out.println();
			System.out.println("Hit (H) or Stay (S)?");
			Scanner input = new Scanner(System.in);
			choice = input.nextLine();
			stayOrGo = choice.charAt(0);
			if (stayOrGo == 'H' || stayOrGo == 'h')
			{
				player1Hand.add(deck.get(0));
				deck.remove(0);
				System.out.println("Player hits. \n");
			}
			
			else if (stayOrGo == 'S' || stayOrGo == 's')
			{
				done = true;
				System.out.println("Player stands. \n");
			}
			else
				System.out.println("Input not recognized. Try again!");
			
			computersMove();
			calcScore();
			if (player1Score >  computerScore)
			{
				System.out.println(player1.getName() + " wins!");
				done = true;
			}
			
			else if (computerScore > player1Score)
			{
				System.out.println("Computer wins!");
				done = true;
			}
			
			else if (computerScore == 21 && player1Score == 21)
			{
				System.out.println("Tie!");
				done = true;
			}
			
			else if (player1Score > 21)
			{
				System.out.println(player1.getName() + " busted!");
				System.out.println("Computer wins!");
				done = true;
			}
			
			else if (computerScore > 21)
			{
				System.out.println("Computer busted!");
				System.out.println(player1.getName() + " wins!");
				done = true;
			}
			
			input.close();
		}
	}
	
	public void calcScore()
	{
		player1Score = 0;
		computerScore = 0;
		for (Cards card : player1Hand)
		{
			if (card.getName().contains("Two"))
				player1Score  += 2; 
			if (card.getName().contains("Three"))
				player1Score  += 3;
			if (card.getName().contains("Four"))
				player1Score  += 4; 
			if (card.getName().contains("Five"))
				player1Score  += 5; 
			if (card.getName().contains("Six"))
				player1Score  += 6; 
			if (card.getName().contains("Seven"))
				player1Score  += 7; 
			if (card.getName().contains("Eight"))
				player1Score  += 8; 
			if (card.getName().contains("Nine"))
				player1Score  += 9;
			if (card.getName().contains("Ten"))
				player1Score  += 10; 
			if (card.getName().contains("Jack"))
				player1Score  += 10; 
			if (card.getName().contains("Queen"))
				player1Score  += 10; 
			if (card.getName().contains("King"))
				player1Score  += 10; 
			if (card.getName().contains("Ace"))
				if((player1Score += 11) <= 21)
					player1Score += 11;
				else if ((player1Score += 11) > 21)
					player1Score += 1;					
		}
		
		for (Cards card : computerHand)
		{
			if (card.getName().contains("Two"))
				computerScore  += 2; 
			if (card.getName().contains("Three"))
				computerScore  += 3;
			if (card.getName().contains("Four"))
				computerScore  += 4; 
			if (card.getName().contains("Five"))
				computerScore  += 5; 
			if (card.getName().contains("Six"))
				computerScore  += 6; 
			if (card.getName().contains("Seven"))
				computerScore  += 7; 
			if (card.getName().contains("Eight"))
				computerScore  += 8; 
			if (card.getName().contains("Nine"))
				computerScore  += 9;
			if (card.getName().contains("Ten"))
				computerScore  += 10; 
			if (card.getName().contains("Jack"))
				computerScore  += 10; 
			if (card.getName().contains("Queen"))
				computerScore  += 10; 
			if (card.getName().contains("King"))
				computerScore  += 10; 
			if (card.getName().contains("Ace"))
				if((computerScore += 11) <= 21)
					computerScore += 11;
				else if ((computerScore += 11) > 21)
					computerScore += 1;			
		}
	}
}
