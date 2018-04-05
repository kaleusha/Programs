/******************************************************************************
 *  Purpose: Print the Cards the received by the 4 Players
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   15-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class DeckOfCards {
	public static void main(String[] args) {
		int noOfPlayers = 4;
		int noOfCards = 9;
		Utility utility = new Utility();

		String[] deckOfCards = utility.assignDeckOfCards();

		String[] deckOfShuffleCards = utility.shuffle(deckOfCards);

		String[][] playerCards = utility.distribute(deckOfShuffleCards, noOfPlayers, noOfCards);

		
		utility.printSortedCards(playerCards, noOfPlayers, noOfCards);

}
}