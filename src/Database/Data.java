package Database;

import java.util.ArrayList;

/**
 * The Data interface provides methods for basic CRUD operations on a database
 * table.
 */
interface Data<T> {

    // Creates a new table with the specified name.
    public void createTable(String table);

    // Deletes the table with the specified name.
    public void deleteTable(String table);

    // Retrieves all records from the specified table.
    public ArrayList<T> ShowRec(String table);

    // Adds a new row to the specified table.
    public void addRow(String table, T obj);

    // Edits an existing row in the specified table.
    public void editRow(String table, T obj);

    //Deletes an existing row from the specified table.
    public void deleteRow(String table, T obj);

}
