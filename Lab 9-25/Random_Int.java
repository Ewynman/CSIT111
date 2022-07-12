// Write a program that generates a random interger in the range of 20 to 40
// inclusive, and displays the sine, cosine, and tangent of that number

import java.util.Random;
 
public class Random_Int
{
	public static void main(String[]arg)
	{
		Random generator = new Random();
		int num1;
 
		num1 = generator.nextInt(21) + 20;
		System.out.println("The randon number between 20-40 is " + num1);
		System.out.println("the sine is " + Math.sin(num1));
		System.out.println("The cosine is " + Math.cos(num1));
		System.out.println("The tanget is " + Math.tan(num1));
 
	}
}