/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alychinque
 */
public class Borrow {
    private String idReader, titleBook;
    private boolean lent;

    public Borrow(String idReader, String titleBook, boolean lent) {
        this.idReader = idReader;
        this.titleBook = titleBook;
        this.lent = lent;
    }

    public String getIdReader() {
        return idReader;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public boolean isLent() {
        return lent;
    }
    
    @Override
    public String toString(){
        return this.titleBook;
    }
    
    
}
