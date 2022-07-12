import java.util.Scanner;
public class Star1
{
     public static void main(String[] args)
    {
        int rows = 10;

        System.out.println("Here is your pattern....!!!");
        
        for (int i= rows-1; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                 System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}