/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package library;

/**
 *
 * @author Kutoma
 */
public class Book implements java.io.Serializable {

    private String title;
    private String author;
    private int accessionNumber;
    private String iISBNNumber;
    private Member borrower = null;
    private static int bookCount = 0;

    public Book(String name, String authorName, String isbn){
        title = name;
        author = authorName;
        iISBNNumber = isbn;
        accessionNumber = bookCount++;
    }

    public void setAccNumber(int num)
    {
        bookCount = num;
    }
    
    public void setCurrentBorrower(Member theBorrower) {
        borrower = theBorrower;
    }

    public void removeBorrower() {
        borrower = null;
    }

    public Member getBorrower() {
        return borrower;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return iISBNNumber;
    }

    public int getAccNumber() {
        return accessionNumber;
    }

    public String getTitle() {
        return title;
    }


    public String toString() {
        String template = "title: %1$s, author: %2$s, ISBN: %3$s, AN: %4$s, borrower: %5$s";
        String borrowerName = borrower != null ? borrower.getMemName() : "null";
        return String.format(template, title, author, iISBNNumber, accessionNumber, borrowerName);
    }

    public boolean isOnLoan() {
        if(borrower != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
