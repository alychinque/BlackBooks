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
    private String id;
    private String authorFirstName;
    private String authorLastName;
    private String booTitle;
    private String genre;

    public Book(String id, String authorFirstName, String authorLastName, String booTitle, String genre) {
        this.id = id;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.booTitle = booTitle;
        this.genre = genre;
    }
}
