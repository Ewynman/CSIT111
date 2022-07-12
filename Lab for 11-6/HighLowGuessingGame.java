//Write a program that plays the Hi-Lo guessing game withnumbers. 
//The program should pick a random number between1 and 100 (inclusive), 
//then repeatedly prompt the user to guessthe number. On each guess, 
//report to the user that he or sheis correct or that the guess is high or low. 
//Continue acceptingguesses until the user guesses correctly or chooses to quit. 
//Use a sentinel value to determine whether the user wants to quit.
//Count the number of guesses and report that value when theuser guesses correctly. 
//At the end of each game (by quitting ora correct guess), 
//prompt to determine whether the user wantsto play again. Continue playing games until the user choosesto stop.
import java.util.Scanner;
import java.util.Random;

public class HighLowGuessingGame {
    public static void main(String[] args)
    {
        int guess, answer, count = 0;
        String restart;

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("What number do you guess (enter 0 to quit)? ");
        guess = scan.nextInt();

        answer = generator.nextInt(100) + 1; // randomly generates a number between 1-100

        do // loops through game until user gets answer correct or quits
        {
            count++;

            if (guess == 0) // if user enters 0 to quit game, this message is displayed
            {
                System.out.println("\nQuitting game");
                System.out.println("\nWould you like to play again?(Enter Y for Yes, N for No)");
                restart = scan.next();
                if (restart.equalsIgnoreCase("Y"))
                {
                    System.out.print("Enter a number to start playing");
                    guess = scan.nextInt();
                }
                else
                    break;
            }
            if (guess == answer)
            {
                System.out.println("That's correct! You made " + count + " guesses.");
                System.out.println("Would you like to play again?");
                restart = scan.next();
                if (restart.equalsIgnoreCase("Y"))
                {
                    System.out.print("Enter a number to start playing");
                    guess = scan.nextInt();
                }
                else
                    break;
            }
            if (guess < answer)
            {
                System.out.print("Your guess is too low, try again."   + count + " guesses.");
                guess = scan.nextInt();
            }
            if (guess > answer)
            {
                System.out.print("Your guess is too high, try again."  + count + " guesses.");
                guess = scan.nextInt();
            }

        }
        while (guess != 0);

        System.out.print("Thanks for playing!");
    }
}