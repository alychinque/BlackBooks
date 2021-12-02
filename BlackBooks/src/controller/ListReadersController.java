/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Book;
import model.Reader;
import view.EditReader;
import view.ListReaders;
import view.Readers;

/**
 *
 * @author alychinque
 */
public class ListReadersController {
    
    private final ListReaders view;
    private javax.swing.JTable table;
    
    public ListReadersController(ListReaders view) {
        this.view = view;
    }

    public void back() {
        Readers rd = new Readers();
        this.view.dispose();
        rd.setVisible(true);
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

    public int getReader(String id, ArrayList<Reader> readers) {
        for(int i=0; i< readers.size(); i++){
            if(readers.get(i).getIdReader().equalsIgnoreCase(id)){
                System.out.println("returned: "+i);
                return i;
            }
            System.out.println(i);
        }
        return -1;
    }

    public void goEditReader(int index, ArrayList<Reader> readers) {
        EditReader er = new EditReader(index, readers);
        this.view.dispose();
        er.setVisible(true);
    }
    
}
