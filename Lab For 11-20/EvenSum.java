//Write a program that reads an interger value and prints the sum of all even intergers between 2 and the input value inclusive
//Print an error message if the input value is less than 2. 

import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number larger than 2");
        int num = input.nextInt();
        if (num >= 2) {
            int sum = 0;
            for (int i = 2; i <= num; i +=2) {
                sum += i;
            }
            System.out.println("The sum of all even numbers between 2 and the input is " + sum);
                } else {
            System.out.println("Invalid, please enter a number above 2");
        }
    }
}