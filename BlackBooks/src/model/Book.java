/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alychinque
 */
public class Book {
    private String idBook, authorFirstName, authorLastName, bookTitle, genre;
    
    public Book(String id, String authorFirstName, String authorLastName, String bookTitle, String genre) {
        this.idBook = id;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.bookTitle = bookTitle;
        this.genre = genre;
    }

    public String getIdBook() {
        return idBook;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getGenre() {
        return genre;
    }
    
}
