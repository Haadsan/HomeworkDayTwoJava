import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book();
    }

    @Test
    public void libraryStockCheck(){
        assertEquals(0, library.stockCheck());
    }

    public void canAddBook(){
        library.canAddBook(book);
        assertEquals(2, library.stockCheck());
    }

//    @Test
//    public void canRemoveBook(){
//        library.canAddBook(book);
//        library.canAddBook(book);
//        assertEquals(2, library.stockCheck());
//        library.removeBook(book);
//        assertEquals(1, library.stockCheck());
//    }



}
