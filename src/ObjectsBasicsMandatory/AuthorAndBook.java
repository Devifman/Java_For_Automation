package ObjectsBasicsMandatory;

public class AuthorAndBook {

  public static class  Author {
      String firstname,lastname;
      Author(String firstname,String lastname){
          this.firstname = firstname;
          this.lastname = lastname;


      }

    public String fulname(){
        return  (firstname + " "+lastname);
      }
  }

  public  static class Book {
      String tittle,author; double price;
      Book(String tittle,String author, double price){
          this.tittle = tittle;
          this.author = author;
          this.price = price;

      }
      public  String bookdetails(){
          return "Tittle: "+ tittle + "\n" + "Author: " + author + "\n" +"Price: "+ price + "$";
      }
  }
    public static void main (String[]args){
    Author Firstman = new Author("Russel","Winderand");
    Book Javabook = new Book("Developing Java Software",Firstman.fulname(),79.75);
        System.out.println(Javabook.bookdetails());

    }

}
