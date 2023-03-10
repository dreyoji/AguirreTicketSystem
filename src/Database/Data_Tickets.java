package Database;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Data_Tickets implements Data<Tickets> {

    Connection _myConn = null;
    Statement _myStmt = null;
    ResultSet _myRes = null;

    public void createTable(String table) {
        try {
            // Get connection to database and create statement
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // Query to create table
            String qry = "CREATE TABLE `ticketsys`.`alltickets` "
                    + "(`Number` INT NOT NULL AUTO_INCREMENT, "
                    + "`TicketID` VARCHAR(12) NOT NULL, "
                    + "`RevisionCount` VARCHAR(5) NOT NULL, "
                    + "`SubjectTitle` VARCHAR(45) NULL, "
                    + "`SubjectDesc` VARCHAR(45) NULL, "
                    + "`TicketType` VARCHAR(45) NULL, "
                    + "`PriorityLevel` VARCHAR(45) NULL, "
                    + "`AssignedDepartment` VARCHAR(45) NULL, "
                    + "`AssignedPersonnel` VARCHAR(45) NULL, "
                    + "`DateCreated` VARCHAR(45) NULL, "
                    + "`DateUpdated` VARCHAR(45) NULL, "
                    + "`Status` VARCHAR(45) NULL, "
                    + "`Creator` VARCHAR(45) NULL, "
                    + "PRIMARY KEY (`Number`), "
                    + "UNIQUE INDEX `new_tablecol_UNIQUE` (`TicketID` ASC) VISIBLE);";
            System.out.println(qry);

            // Execute query
            _myStmt.executeUpdate(qry);

            // Show message dialog to confirm table creation
            JOptionPane.showMessageDialog(null, "Table created");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Connection to database failed");
        } finally {
            // Close result set
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                }
            }
            // Close statement
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                }
            }
            // Close connection
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void deleteTable(String table) {
        try {
            // Get database connection instance and create statement object
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // Construct SQL query to delete table
            String qry = "DROP TABLE " + table;

            // Execute SQL query to delete table
            _myStmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Table deleted");

        } catch (SQLException ex) {
            // Handle SQL exception
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } catch (IOException | PropertyVetoException ex) {
            // Handle IO or PropertyVeto exceptions
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            // Close result set, statement, and connection objects
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Retrieve all tickets from the specified table
    public ArrayList<Tickets> ShowRec(String table) {
        ArrayList<Tickets> ticket = new ArrayList<Tickets>();
        try {
            // establish a connection to the database and create a Statement
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // SQL query to retrieve all records from the specified table
            String qry = "SELECT * FROM " + table;

            _myRes = _myStmt.executeQuery(qry);
            System.out.println(qry);

            // iterate over the result set and create Tickets objects with the retrieved data
            while (_myRes.next()) {
                ticket.add(new Tickets(_myRes.getString("TicketID"), _myRes.getInt("RevisionCount"), _myRes.getString("SubjectTitle"), _myRes.getString("SubjectDesc"), _myRes.getString("TicketType"), _myRes.getString("PriorityLevel"), _myRes.getString("AssignedDepartment"), _myRes.getString("AssignedPersonnel"), _myRes.getString("DateCreated"), _myRes.getString("DateUpdated"), _myRes.getString("Status"), _myRes.getString("Creator"), _myRes.getString("Notes"), _myRes.getInt("FollowUp")));
            }
        } catch (SQLException ex) {
            // handle SQL exceptions
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        // return the ArrayList of Tickets objects containing the retrieved data
        return ticket;
    }

    // Retrieve specific records from the database based on a provided SQL query string.
    public ArrayList<Tickets> ShowRecSpec(String parameters) {
        ArrayList<Tickets> ticket = new ArrayList<Tickets>();
        try {
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();
            System.out.println(parameters);
            _myRes = _myStmt.executeQuery(parameters);
            while (_myRes.next()) {
                ticket.add(new Tickets(_myRes.getString("TicketID"), _myRes.getInt("RevisionCount"), _myRes.getString("SubjectTitle"), _myRes.getString("SubjectDesc"), _myRes.getString("TicketType"), _myRes.getString("PriorityLevel"), _myRes.getString("AssignedDepartment"), _myRes.getString("AssignedPersonnel"), _myRes.getString("DateCreated"), _myRes.getString("DateUpdated"), _myRes.getString("Status"), _myRes.getString("Creator"), _myRes.getString("Notes"), _myRes.getInt("FollowUp")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return ticket;
    }

    // Adds a new row to the specified table with the given Tickets object's values.
    public void addRow(String table, Tickets ticket) {
        try {
            // Get a connection to the database and create statement
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // Build the SQL query string using the ticket information and table name
            String qry = "INSERT INTO " + table + "(TicketID, RevisionCount, SubjectTitle, SubjectDesc, TicketType, PriorityLevel, AssignedDepartment, AssignedPersonnel, DateCreated, DateUpdated, Status, Creator, Notes, FollowUp)" + " VALUES ('" + ticket.getId() + "', '" + ticket.getRevCount() + "', '" + ticket.getTitle() + "', '" + ticket.getDescription() + "', '" + ticket.getType() + "', '" + ticket.getPriority() + "', '" + ticket.getDepartment() + "', '" + ticket.getPersonnel() + "' ,'" + ticket.getDateCreated() + "', '" + ticket.getDateUpdated() + "', '" + ticket.getStatus() + "', '" + ticket.getCreator() + "', '" + ticket.getNotes() + "', '" + ticket.getFollowup() + "')";
            System.out.println(qry);

            // Execute the SQL query to add the new row to the table
            _myStmt.executeUpdate(qry);
            System.out.println("Entry added");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            try {
                _myStmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (_myConn != null) {
            try {
                _myConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Updates a row in the given table with the data from the provided ticket object.
    public void editRow(String table, Tickets ticket) {
        try {
            // get a database connection instance and create statement 
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // construct the SQL query to update the row
            String query = "UPDATE " + table + " SET SubjectTitle = " + ticket.getTitle() + ", SubjectDesc = '" + ticket.getDescription() + "', TicketType = '" + ticket.getType() + "', PriorityLevel = '" + ticket.getPriority() + "', AssignedDepartment = '" + ticket.getDepartment() + "', AssignedPersonnel = '" + ticket.getPersonnel() + "', DateCreated = '" + ticket.getDateCreated() + "', DateUpdated = '" + ticket.getDateUpdated() + "', Status = '" + ticket.getStatus() + "', Creator = '" + ticket.getCreator() + "', Notes = '" + ticket.getNotes() + "', FollowUp = '" + ticket.getFollowup() + "' WHERE TicketID = " + "'" + ticket.getId() + "'";

            // print the constructed query for debugging purposes
            System.out.println(query);

            // execute the update query
            _myStmt.executeUpdate(query);
            _myStmt.close();
            System.out.println("Entry updated");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Update in MySQL database table with a new value for the FollowUp column, based on the provided TicketID value.
    public void editRowFollowup(String table, String flag, String num) {
        try {
            // Get database connection and create statement
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // Construct SQL query
            String qry = "UPDATE " + table + " SET FollowUp = '" + flag + "' WHERE TicketID = " + "'" + num + "'";

            // Print SQL query for debugging purposes
            System.out.println(qry);

            // Execute query
            _myStmt.executeUpdate(qry);
            _myStmt.close();
            System.out.println("Entry updated");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Deletes a row from a MySQL database table based on a given parameter and a Tickets object.
    public void deleteRowParam(String table, Tickets ticket, String param) {
        try {
            // Establish connection and create statement
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // Define query to delete row from table based on ticket ID and additional parameter
            String qry = "DELETE FROM " + table + " WHERE TicketID = " + ticket.getId() + param;

            // Print SQL query for debugging purposes
            System.out.println(qry);

            // Execute query
            _myStmt.executeUpdate(qry);
            _myStmt.close();
            System.out.println("Entry deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                _myRes.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (_myStmt != null) {
            try {
                _myStmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (_myConn != null) {
            try {
                _myConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Deletes a row from a specified table based on the TicketID of a given tickets object
    public void deleteRow(String table, Tickets ticket) {
        try {
            // Establish connection and create statement
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // Define query to delete row from table based on ticket ID
            String qry = "DELETE FROM " + table + " WHERE TicketID = " + ticket.getId();

            // Print SQL query for debugging purposes
            System.out.println(qry);

            // Execute query
            _myStmt.executeUpdate(qry);
            _myStmt.close();
            System.out.println("Entry deleted");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                }
            }
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                }
            }
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    // Returns the count of rows that match the provided SQL parameters.
    public int tallyCount(String parameters) {
        int tally = 0;
        try {
            // Create SQL query string using parameters
            String qry = "SELECT COUNT(*) from " + parameters;

            // Get database connection and create statement
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();

            // Execute query and get results
            _myRes = _myStmt.executeQuery(qry);
            System.out.println(qry);

            // Extract tally count from results
            while (_myRes.next()) {
                tally = _myRes.getInt(1);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                }
            }
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                }
            }
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                }
            }
        }
        return tally;
    }

    // Retrieves a list of employees from the database based on a given SQL query string.
    public ArrayList<String> employeeList(String parameters) {

        ArrayList<String> employees = new ArrayList<String>();
        try {
            // Get database connection and create statement
            _myConn = MySQLConnector.getInstance().getConnection();
            _myStmt = _myConn.createStatement();
            String qry = parameters;
            
            _myRes = _myStmt.executeQuery(qry);
            
            while (_myRes.next()) {
                String x = _myRes.getString("combined");
                employees.add(x);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException | PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (_myRes != null) {
                try {
                    _myRes.close();
                } catch (SQLException e) {
                }
            }
            if (_myStmt != null) {
                try {
                    _myStmt.close();
                } catch (SQLException e) {
                }
            }
            if (_myConn != null) {
                try {
                    _myConn.close();
                } catch (SQLException e) {
                }
            }
        }
        return employees;
    }
}
