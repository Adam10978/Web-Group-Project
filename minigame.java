//Guessing word game 
//user has 3 guesses to guess the correct word 
package Game;
import java.util.Scanner;

public class Game {<!-- start class -->

	public static void main(String[] args) {//start main 
		//Scanner
		Scanner keyboardInput = new Scanner(System.in);
		
		//name of variables
		String secretWord = "water";
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		//allows user to enter guess
		while(!guess.equals(secretWord) && !outOfGuesses) {//start while
			//if statement to check if user used all guesses
			if(guessCount < guessLimit) {//start if
				System.out.println("Please enter your guess: ");
				guess = keyboardInput.nextLine();
				guessCount++;
			}//end if
			//tells user they're out of guesses
			else {//start else
				outOfGuesses = true;
			}//end else
		}//end while
		//user guesses correctly
		if(outOfGuesses) {//start if
			System.out.println("You Lose! Out of Guesses");
		}//end if
		else {//start else
			System.out.println("You Win!!");
		}//end else
	}//end main
}//end class
