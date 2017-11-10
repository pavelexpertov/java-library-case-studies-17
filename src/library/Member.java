/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package library;

/**
 *
 * @author Kutoma
 */
public class Member implements java.io.Serializable {
    private String name;
    private int memberNumber;
    private SetOfBooks currentLoans = new SetOfBooks();
    private static int memberCount = 0;

    public Member(String aName){
     name = aName;
     memberNumber = memberCount++;
     currentLoans = new SetOfBooks();
    }
    
    public void setMemberCount(int num)
    {
        memberCount = num;
    }

    public int getMemNumber()
    {
        return memberNumber;
    }

    public String getMemName()
    {
        return name;
    }

    public String toString(){
        return Integer.toString(memberNumber) + " " + name;
    }

    public void borrowBook(Book aBook){
        currentLoans.addBook(aBook);
        aBook.setCurrentBorrower(this);
    }

    public void returnBook(Book aBook) {
        currentLoans.removeBook(aBook);
        aBook.removeBorrower();
    }

    public SetOfBooks getBooksOnLoan() {
        return currentLoans;
    }
}
