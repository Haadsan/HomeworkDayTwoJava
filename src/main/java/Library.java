import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookStock;
    int capacity;


    public Library(int capacity){
        this.bookStock= new ArrayList<>();
        this.capacity = capacity;
    }
//Add a capacity to the library
//    Write a method which returns the number of books in the library.

    public int stockCheck(){
        return this.bookStock.size();
    }
//    Write a method which adds a book to the library stock.
//    write a method to check if stock is full before adding a book

    public void canAddBook(Book book){
        if(stockCheck()< this.capacity){
            this.bookStock.add(book);
        }

    }







}
