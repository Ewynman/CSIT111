public class BookShelf
{
   public static void main(String[] args)
   {
      //Book book1, book2, book3;
      
      Book book1 = new Book("Programming in Java", "James Smith","Pavol's Publishing", "5/1/2014");
      Book book2 = new Book("Programming in VB.net", "Pavol", "Computer Publishing",  "12/5/2014");
      Book book3 = new Book("Programming in C#", "Daniel Somebody", "Some Publishing", "2/1/2013");
      
      System.out.println(book1);
      System.out.println(book2);
      System.out.println(book3);
   }
}