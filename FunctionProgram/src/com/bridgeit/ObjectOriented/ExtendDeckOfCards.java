/******************************************************************************
 *  Purpose: Print the Player and the Cards received by each Player.
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   16-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class ExtendDeckOfCards {
	public static void main(String[] args) {
		int noOfPlayers = 4;
		int noOfCards = 9;
		Utility utility = new Utility();

		String[] deckOfCards = utility.assignDeckOfCards();

		String[] deckOfShuffleCards = utility.shuffle(deckOfCards);

		String[][] playerCards = utility.distribute(deckOfShuffleCards, noOfPlayers, noOfCards);

		System.out.println("Cards before sorting...");
		System.out.println();

		utility.printDistibutedCards(playerCards, noOfPlayers, noOfCards);
		System.out.println("Cards after sorting...");

		utility.printSortedCards(playerCards, noOfPlayers, noOfCards);

	}


}
