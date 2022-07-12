import java.util.Scanner;
public class LeapYearLoop {
   public static void main(String[] args)
   {
      int year;
      Scanner scan = new Scanner(System.in);
      year = 1;
      while(year> 0){
         System.out.println("Enter a year to see if it is a leap year");
         year = scan.nextInt();
            
         while (year < 1582) 
         {
            System.out.print("\nPlease enter a different year above 1582\n");
            year = scan.nextInt();
         }
         if (year % 4 == 0) 
         {
            if(year % 100 ==0 && year % 400 != 0)
            {
               System.out.println(year + " is not a leap year\n\n");
            }
            else 
            {
               System.out.println(year + " is a leap year\n");
            }

         } 
         else 
         {
            System.out.println(year + " is not a leap year\n\n");
         }
          System.out.println("Enter a year to see if it is a leap year or enter 0 to quit");
          year = scan.nextInt();
      }
   }
}