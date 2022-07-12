//Design an implement an application that prints the first few verses of the traveling song "One hundred Bottles of Beer.
//"Use a loop so that each iteration prints one verse. Read the number of verses to print from the user. Validate the input. 
//The following are the first two verses of the song: 100 bottles of beer on the wall, 100 bottles of beer, If one of those bottles should happen to fall, 
//99 bottles of beer on the wall, 99 bottles of beer on the wall, 99 bottles of beer, If one of those bottles should happen to fall, 98 bottles of beer on the wall.

import java.util.Scanner;
public class PrintSong
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("-----------------------------------------");
  System.out.println("    One Hundred Bottles of Beer    ");
  System.out.println("-----------------------------------------");
  System.out.println("Please enter number of verses to print: ");
  int numberOfVerses = scan.nextInt();
  System.out.println("-----------------------------------------");
  int numberOfBeers = 100;
  for(int i=0;i<numberOfVerses;i++)
  {
   System.out.println(numberOfBeers + " bottles of beer on"
    + " the wall");
   System.out.println(numberOfBeers + " bottles of beer");
   System.out.println("If one of those bottles should happen"
   	+ " to fall");
   numberOfBeers--;
   System.out.println(numberOfBeers + " bottles of beer on"
    + " the wall");
  }
 }
}