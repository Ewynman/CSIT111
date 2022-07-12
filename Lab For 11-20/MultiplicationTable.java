//Design and implement an application that produces a multiplication table, showing the results of multiplying the integers 1 through 12 by themselves.
import java.util.Scanner;
public class MultiplicationTable
{
  public static void main(String[] args) {

        final int TOTAL = 12;

        for(int i = 1; i <= TOTAL; i++)
        {
           for(int j = 1; j<=TOTAL; j++)
           {
              if(i*j<10)
                 System.out.print(j+"*"+i+" = "+i*j +"     ");
              else if(10<=i*j & i*j<100)
                 System.out.print(j+"*"+i+" = "+i*j +"    ");
              else if(100<=i*j & i*j<1000)
              System.out.print(j+"*"+i+" = "+i*j +"   ");
        }
        System.out.println("");
    }

}
}