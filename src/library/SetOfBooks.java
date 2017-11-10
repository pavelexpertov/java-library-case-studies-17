/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Kutoma
 */
public class SetOfBooks extends ArrayList<Book> {


public SetOfBooks(){

    super();
}

public void addBook(Book aBook){
    this.add(aBook);
}

public SetOfBooks findBooksByAuthor(String authorName){
    String lowerAuthName = authorName.toLowerCase();
    SetOfBooks foundBooksList = new SetOfBooks();
    for (Book b : this){
        if (b.getAuthor().toLowerCase().contains(lowerAuthName))
            foundBooksList.addBook(b);
    }
    return foundBooksList;
}

public SetOfBooks findBooksByTitle(String titleName){
    String lowerTitleName = titleName.toLowerCase();
    SetOfBooks foundBooksList = new SetOfBooks();
    for (Book b : this){
        if (b.getTitle().toLowerCase().contains(lowerTitleName))
            foundBooksList.addBook(b);
    }
    return foundBooksList;
}

public Book findBookByAccNumber(int accNumber){
    /*
     * accNumber - accession number is a unique identifier for a book.
     * It's incremented by one automatically when a new book is added.
    */
    for (Book b : this){
        if (b.getAccNumber() == accNumber)
            return b;
    }
    //NEED TO IMPLEMENT AN EXCEPTION
    return null;
}

public SetOfBooks findBooksByISBN(String isbn){
    SetOfBooks foundBooksList = new SetOfBooks();
    for (Book b : this) {
        if (b.getISBN().equals(isbn))
            foundBooksList.add(b);
    }
    return foundBooksList;
}


public void removeBook(Book uneededBook) {
    int index = this.indexOf(uneededBook);
    if(index != -1) {
        this.remove(index);
    }
}

}
