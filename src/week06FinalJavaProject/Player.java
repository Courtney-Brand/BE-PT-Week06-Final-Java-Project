package week06FinalJavaProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List <Card> hand = new ArrayList <Card>();
	private int score = 0;
	private String name;
	
	public Player (String name, int score, List <Card> hand) {
		this.setName(name);
		this.score = 0;
		this.hand = new ArrayList <Card>();
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Player 1: " + name + "Score: " + score + "Cards in hand: ");
		for (Card card: hand) {
			card.describe();
		}
	}
	
	public Card flip () {
		Card card = this.hand.remove(0);
		return card;
	}
	
	public void draw(Deck deck, List<Card> hand) {
		Card card = deck.draw();
		this.hand.add(card);
		}
	
	public void incrementScore () {
		score++;
	}
	
}
