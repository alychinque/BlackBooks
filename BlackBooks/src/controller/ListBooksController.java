/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.BlackBooks;
import view.ListBooks;

/**
 *
 * @author alychinque
 */
public class ListBooksController {

    private final ListBooks view;

    public ListBooksController(ListBooks view) {
        this.view = view;
    }

    public void back() {
        BlackBooks bb = new BlackBooks(1);
        this.view.dispose();
        bb.setVisible(true);
    }
    
}
