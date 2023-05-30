package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Aryan Bhardwaj
 * @author Aryan Bhardwaj May 30, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13)+1);
            card.setSuit(Card.SUITS[random.nextInt(3)+0]);
            hand[i] = card;
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the card value: ");
        int valueCard = input.nextInt();
        
        System.out.print("Enter the suit of card(Diamonds = 0, Hearts = 1, Clubs = 2, Spades = 3): ");
        int suitCard = input.nextInt();
        
        Card genCard = new Card();
        genCard.setValue(valueCard);
        genCard.setSuit(Card.SUITS[suitCard - 1]);
        
        boolean matchCard = false;
        for (Card card : hand) {
            if (card.getValue() == genCard.getValue() && card.getSuit().equals(genCard.getSuit())) {
                matchCard = true;
                break;
            }
        }

        if (matchCard) {
            printInfo();
        } else {
            System.out.println("No Match !!!!");
        }
    
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Aryan Bhardwaj 30 May 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is ARYAN BHARDWAJ, but you can call me by my first name ARYAN");
        System.out.println();
        
        System.out.println("My career ambitions: To be a SOFTWARE DEVELOPER & WEB DEVELOPER");
        System.out.println("-- To achieve great heights in IT field");
        System.out.println("-- Get a good GPA in my studies");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- PROGRAMMING");
        System.out.println("-- Reading BOOKS");
        System.out.println("-- Watching WEB-SHOWS");
        System.out.println("-- Playing FOOTBALL");

        System.out.println();
        
    
    }

}
