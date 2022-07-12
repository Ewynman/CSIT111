import java.util.Scanner;
public class Star3
{
    public static void main(String[] args)
    {
        int rows = 10;
        System.out.println("Here is your pattern....!!!");
        
         for (int i= rows; i>= 1; i--)
        {
            for (int j=rows; j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }
        

    }
}