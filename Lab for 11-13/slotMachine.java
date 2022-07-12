import java.util.*;

public class slotMachine
{
    public static void main (String[]args)
    {

        //Instance Data//

        int number1;
        int number2;
        int number3;
        String start = "1";
        String end = "0";
        int play;

        //New Scanner and Random Generator//

        Scanner keyboard = new Scanner(System.in);

        Random generator = new Random();

        System.out.println("Type 1 to start the slot machine and 0 to stop playing.");

        play = keyboard.nextInt();

        while (play == 1)
        {
        //Number Generators//

        number1 = generator.nextInt(10);
        number2 = generator.nextInt(10);
        number3 = generator.nextInt(10);

        //Determines if the numbers match and prints the appropriate response//

            if (number1 == number2 && number2 == number3)
            {
                System.out.println("Your numbers are: " + number1 + " " + number2 + " " + number3 + " Congratulations! All three Match!");
            }

            if (number1 == number2 || number1 == number3 || number2 == number3)
            {
                System.out.println("Your numbers are: " + number1 + " " + number2 + " " + number3 + " Not quite, only two match");
            }
            else
            {
                System.out.println("Your numbers are: " + number1 + " " + number2 + " " + number3 + " No numbers match");
            }

            //Asks if player would like to play again//

            System.out.println("Would you like to play again? Type 1 for yes, and 0 for no.");
            {
                play = keyboard.nextInt();
            }
        }
        if (play == 0)
        {
            System.out.println("I hope you had fun.");
        }
    }
}