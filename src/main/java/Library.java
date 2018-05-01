import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookStock;
    int capacity;


    public Library(int capacity){
        this.bookStock= new ArrayList<>();
        this.capacity = capacity;
    }

    public int stockCheck(){
        return this.bookStock.size();
    }







}
