//Write a program that reads a string from the user and prints it one character per line.

import java.util.Scanner;
 
public class printCharacters{
 
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        a=sc.nextLine();
 
        System.out.println("Output :");
 
        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }
    }
}