package week06FinalJavaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner playerInput = new Scanner (System.in);
		Deck deck =new Deck();
	
		
		List<Card> p1Hand = new ArrayList <Card>();
		List<Card> p2Hand = new ArrayList <Card>();
		
		System.out.println("+--+--+--+--+--+");
		System.out.println("  Lets play WAR!");
		System.out.println("+--+--+--+--+--+");
		System.out.println(" ");
		
		deck.shuffle();
		
		System.out.println("Player one, please enter your name: " );
		String player1Name = playerInput.nextLine();
		Player player1 = new Player (player1Name, 0, p1Hand);
		
		System.out.println("Player two, please enter your name: " );
		String player2Name = playerInput.nextLine();
		Player player2 = new Player (player2Name, 0, p2Hand);
		
		for (int i =0; i < 52; i++) {
			if (i %2 ==0) {
				player1.draw(deck, p1Hand);
			} else {
				player2.draw(deck, p2Hand);
			}
		}
		
		System.out.println("Welcome " + player1.getName() + " and " + player2.getName() + "!");
		System.out.println(" ");
		
		for (int i = 1; i <=26; i++) {
			Card card1 = player1.flip();
			System.out.print(player1.getName() + ": ");
			card1.describe();
			Card card2 = player2.flip();
			System.out.print(player2.getName() + ": ");
			card2.describe();
				if (card1.getValue() > card2.getValue()) {
					player1.incrementScore();
					System.out.println(player1.getName() + " gets a point!");
				} else if (card2.getValue() > card1.getValue()) {
					player2.incrementScore();
					System.out.println("The point goes to " + player2.getName() + "!");
				} else {
					System.out.println("Draw! Cards have equal value. No one gets a point.");
				}
				System.out.println("The score is now Player one, " + player1.getName() + ": " + player1.getScore() + " 	 Player two, " + player2.getName() + ": " + player2.getScore());
				System.out.println(" ");
		}
		
		System.out.println("The final score is " + player1.getScore() + " to " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Congratulations " + player1.getName() + "! You win!");
			} else if (player1.getScore() < player2.getScore()) {
				System.out.println("Congratulations " + player2.getName() + "! You win!");
			} else {
				System.out.println("It's a draw!");
			}
		
		playerInput.close();
	}
}
