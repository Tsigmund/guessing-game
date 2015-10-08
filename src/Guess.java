//Guessing game
//by Trevor Sigmund
//10/8/15

import java.util.Random;
import java.util.Scanner;

class Guess{

public static void main(String args[]){
	System.out.println("Guessing game.");
	Random rand = new Random(System.currentTimeMillis());
	int randomNum = rand.nextInt(101)+1;
	int guess;
	boolean win = false;
	Scanner s = new Scanner(System.in);
	System.out.print("Guess a number between 1 and 100: ");

	for(int i=0; i<10; i++){
		guess = s.nextInt();
		if(guess > randomNum)
			System.out.println("Your guess is too high! Guess again:");
		if(guess < randomNum)
			System.out.println("Your guess is too low! Guess again: ");
		if(guess == randomNum){
			System.out.println("Correct! You Win!");
			win = true;
			break;
		}//end if
	}//end for
	if(win == false)
		System.out.println("Sorry! Out of guesses... Try again!");

}

}
