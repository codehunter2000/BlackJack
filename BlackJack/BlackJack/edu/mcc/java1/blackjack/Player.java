package edu.mcc.java1.blackjack;

public class Player 
{
	private String name;
	private int wins, losses;
	
	public Player()
	{
		name = null;
		wins = 0;
		losses = 0;
	}
	
	public Player(String name)
	{
		this.name = name;
		wins = 0;
		losses = 0;
	}
	
	
	public void addWin()
	{
		wins++;
	}
	
	public void addLoss()
	{
		losses++;
	}

	public String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}
	
	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}
}
