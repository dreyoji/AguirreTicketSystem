/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.util.ArrayList;

/**
 *
 * @author boxro
 */
interface Data <T> {
    
public void createTable(String table);    
public void deleteTable(String table);
public ArrayList <T> ShowRec(String table);
public void addRow(String table, T obj);
public void editRow(String table, T obj);
public void deleteRow(String table, T obj);

    
}
