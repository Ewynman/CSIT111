//Write a class called Book that contains instance data for the title, author, publisher, and copyright date.
//Define the book constructor to acceopt and initialize this data. Incluse setter and getter methods for all instance data.
//Include a toString method that returns a nicley formated multiline disc4riptyion of the book

public class Book
{
   private String _title;
   private String _author;
   private String _publisher;
   private String _copyright;
   
   public Book(String title, String author, String publisher, String copyright)
   {
      _title = title;
      _author = author;
      _publisher = publisher;
      _copyright = copyright;
   }
   
   public String getTitle()
   {
      return _title;
   }
   public String getAuthor()
   {
      return _author;
   }
   public String getPublisher()
   {
      return _publisher;
   }
   public String getCopyright()
   {
      return _copyright;
   }
   
   public void setTitle(String title)
   {
      _title = title;
   }
   public void setAuthor(String author)
   {
      _author = author;
   }
   public void setPublisher(String publisher)
   {
      _publisher = publisher;
   }
   public void setCopyright(String copyright)
   {
      _copyright = copyright;
   }
   
   public String toString()
   {
     String Description = new String  ("Title: " + _title + "\n" + "Author: " + _author + "\n" + "Publisher: " + _publisher + "\n" + "Copyright: " + _copyright + "\n\n");
      return Description;
   }
   
}