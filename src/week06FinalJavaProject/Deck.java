package week06FinalJavaProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List <Card> cards = new ArrayList <Card>();
	
	Deck() {
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String [] suits = {"Hearts", "Clubs", "Dimonds", "Spades"};
			
		for (String suit : suits) {
			int value = 2;
				for (String name : names) {
					Card card = new Card (name, suit, value);
					this.cards.add(card);
					value++;
				}
		}
	}
	
	public void shuffle () {
		Collections.shuffle(this.cards);
	}
	
	public Card draw () {
		Card card = this.cards.remove(0);
		return card;
	}
	
}
