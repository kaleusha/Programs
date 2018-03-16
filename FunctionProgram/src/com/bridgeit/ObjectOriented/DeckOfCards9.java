/******************************************************************************
 *  Purpose: Print the Cards the received by the 4 Players
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   15-03-2018
 ******************************************************************************/
package com.bridgeit.ObjectOriented;

import com.bridgeit.utility.Utility;

public class DeckOfCards9 {
public static void main(String[] args) {
		
		Utility utility = new Utility();
		String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String ranks[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		utility.deckOfCards(suits,ranks);
	}	

}
