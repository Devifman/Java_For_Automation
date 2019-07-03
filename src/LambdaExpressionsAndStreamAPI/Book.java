package LambdaExpressionsAndStreamAPI;

import ObjectsBasicsMandatory.AuthorAndBook;

public class Book {
    public String title;
    public Author author;
    public double price;

    Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Tittle: " + this.title + "\n" + "Author: " + this.author.getFullname() + "\n" + "Price: " + price + "$";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
