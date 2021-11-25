/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Book;
import model.DAO.BookDAO;
import view.BlackBooks;
import view.ListBooks;

/**
 *
 * @author alychinque
 */
public class ListBooksController implements ActionListener {

    private final ListBooks view;
    private BookDAO bookdao;
    private javax.swing.JTable table;

    public ListBooksController(ListBooks view) {
        this.view = view;
        bookdao = new BookDAO();
    }

    public void back() {
        BlackBooks bb = new BlackBooks();
        this.view.dispose();
        bb.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "Failed deleting the connection");
        }
    }

    public void sortTable(String selected, ArrayList<Book> library) {
        int column = 0;
        switch (selected) {
            case "title":
                column = 0;
                break;
            case "name":
                column = 1;
                break;
            case "surname":
                column = 2;
                break;
            case "genre":
                column = 3;
                break;
        }
        String[] columns = new String[]{"Title", "Author's name", "Author's surname", "Genre"};
        table = new javax.swing.JTable(){
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            };
        };
        Object rowInfoData[] = new Object[4];
        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Title", "Author's name", "Author's surname", "Genre"
                }
        ));
        DefaultTableModel infoTableModel = (DefaultTableModel) table.getModel();
        infoTableModel.setRowCount(0);

        for (int i = 0; i < library.size(); i++) {
            rowInfoData[0] = library.get(i).getBookTitle();
            rowInfoData[1] = library.get(i).getAuthorFirstName();
            rowInfoData[2] = library.get(i).getAuthorLastName();
            rowInfoData[3] = library.get(i).getGenre();

            infoTableModel.addRow(rowInfoData);
        }

        TableRowSorter<TableModel> s = new TableRowSorter<TableModel>(table.getModel());
        //sort JTable rows
        table.setRowSorter(s);
        java.util.List<RowSorter.SortKey> sortList = new ArrayList<>(4);
        sortList.add(new RowSorter.SortKey(column, SortOrder.ASCENDING));
        s.setSortKeys(sortList);
        view.setjTableSortedName(table);
    }
}
