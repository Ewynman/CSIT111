//Write a java program that determines and prints the number of odd,
//even,and zero digits in an interger value read from the keyboard

import java.util.Scanner;

 public class oddEvenZero{
 public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);

System.out.print("Enter a four-digit integer value: ");

String input = scan.next();

int numOfOdd = 0;

int numOfEven = 0;

int numOfZero = 0;

for(int i = 0; i < input.length(); i++){

char c = input.charAt(i);

int num = Integer.parseInt(Character.toString(c));

if(num == 0)

numOfZero++;

else if(num%2 == 0)

numOfEven++;

else

numOfOdd++;

}

System.out.println("Number of odd: " + numOfOdd);

System.out.println("Number of even: " + numOfEven);

System.out.println("Number of zero: " + numOfZero);

}

}