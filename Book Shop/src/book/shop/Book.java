/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package book.shop;

/**
 *
 * @author lenovo
 */
public class Book {
    private int ISBN;
    private String bookTitle;
    private String authorFirstName;
    private String authorLastName;
    
    public Book() {
    }
    public Book(int ISBN, String bookTitle, String authorFirstName, String authorLastName) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int getISBN() {
        return ISBN;
    }
    
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    
    public void setauthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public String getAuthorLastName(){
        return authorLastName;
    }
    
}
