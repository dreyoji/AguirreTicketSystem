/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author boxro
 */
public class Data_Tickets implements Data<Tickets> {
    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRes = null;

    public void createTable(String table) {
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = "CREATE TABLE `ticketsys`.`alltickets` (`Number` INT NOT NULL AUTO_INCREMENT,`TicketID` VARCHAR(12) NOT NULL,`RevisionCount` VARCHAR(5) NOT NULL,`SubjectTitle` VARCHAR(45) NULL,`SubjectDesc` VARCHAR(45) NULL,`TicketType` VARCHAR(45) NULL,`PriorityLevel` VARCHAR(45) NULL,`AssignedDepartment` VARCHAR(45) NULL,`AssignedPersonnel` VARCHAR(45) NULL,`DateCreated` VARCHAR(45) NULL,`DateUpdated` VARCHAR(45) NULL,`Status` VARCHAR(45) NULL,`Creator` VARCHAR(45) NULL,PRIMARY KEY (`Number`),UNIQUE INDEX `new_tablecol_UNIQUE` (`TicketID` ASC) VISIBLE);";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Table created");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public void deleteTable(String table) {
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = "DROP TABLE " + table;
            myStmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Table deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public ArrayList<Tickets> ShowRec(String table) {
        ArrayList<Tickets> ticket = new ArrayList<Tickets>();
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = "SELECT * FROM alltickets";
            myRes = myStmt.executeQuery(qry);
            System.out.println(qry);
            while (myRes.next()) {
                ticket.add(new Tickets(myRes.getString("TicketID"), myRes.getInt("RevisionCount"),
                        myRes.getString("SubjectTitle"), myRes.getString("SubjectDesc"), myRes.getString("TicketType"),
                        myRes.getString("PriorityLevel"), myRes.getString("AssignedDepartment"),
                        myRes.getString("AssignedPersonnel"), myRes.getString("DateCreated"),
                        myRes.getString("DateUpdated"), myRes.getString("Status"), myRes.getString("Creator"),
                        myRes.getString("Notes"), myRes.getInt("FollowUp")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return ticket;
    }

    public ArrayList<Tickets> ShowRecSpec(String parameters) {
        ArrayList<Tickets> ticket = new ArrayList<Tickets>();
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            System.out.println(parameters);
            myRes = myStmt.executeQuery(parameters);
            while (myRes.next()) {
                ticket.add(new Tickets(myRes.getString("TicketID"), myRes.getInt("RevisionCount"),
                        myRes.getString("SubjectTitle"), myRes.getString("SubjectDesc"), myRes.getString("TicketType"),
                        myRes.getString("PriorityLevel"), myRes.getString("AssignedDepartment"),
                        myRes.getString("AssignedPersonnel"), myRes.getString("DateCreated"),
                        myRes.getString("DateUpdated"), myRes.getString("Status"), myRes.getString("Creator"),
                        myRes.getString("Notes"), myRes.getInt("FollowUp")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return ticket;
    }

    public void addRow(String table, Tickets ticket) {
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = "INSERT INTO " + table
                    + "(TicketID, RevisionCount, SubjectTitle, SubjectDesc, TicketType, PriorityLevel, AssignedDepartment, AssignedPersonnel, DateCreated, DateUpdated, Status, Creator, Notes, FollowUp)"
                    + " VALUES ('" + ticket.getId() + "', '" + ticket.getRevcount() + "', '" + ticket.getTitle()
                    + "', '" + ticket.getDesc() + "', '" + ticket.getType() + "', '" + ticket.getPriority() + "', '"
                    + ticket.getDepartment() + "', '" + ticket.getPersonnel() + "' ,'" + ticket.getDateCreated()
                    + "', '" + ticket.getDateUpdated() + "', '" + ticket.getStatus() + "', '" + ticket.getCreator()
                    + "', '" + ticket.getNotes() + "', '" + ticket.getFollowup() + "')";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            System.out.println("Entry added");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public void editRow(String table, Tickets ticket) {
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = "UPDATE " + table + " SET SubjectTitle = " + ticket.getTitle() + ", SubjectDesc = '"
                    + ticket.getDesc() + "', TicketType = '" + ticket.getType() + "', PriorityLevel = '"
                    + ticket.getPriority() + "', AssignedDepartment = '" + ticket.getDepartment()
                    + "', AssignedPersonnel = '" + ticket.getPersonnel() + "', DateCreated = '"
                    + ticket.getDateCreated() + "', DateUpdated = '" + ticket.getDateUpdated() + "', Status = '"
                    + ticket.getStatus() + "', Creator = '" + ticket.getCreator() + "', Notes = '" + ticket.getNotes()
                    + "', FollowUp = '" + ticket.getFollowup() + "' WHERE TicketID = " + "'" + ticket.getId() + "'";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            System.out.println("Entry updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public void editRowFollowup(String table, String flag, String num) {
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = "UPDATE " + table + " SET FollowUp = '" + flag + "' WHERE TicketID = " + "'" + num + "'";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            System.out.println("Entry updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public void deleteRowParam(String table, Tickets ticket, String param) {
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = "DELETE FROM " + table + " WHERE TicketID = " + ticket.getId() + param;
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            System.out.println("Entry deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public void deleteRow(String table, Tickets ticket) {
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = "DELETE FROM " + table + " WHERE TicketID = " + ticket.getId();
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            System.out.println("Entry deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public int tallyCount(String parameters) {
        int tally = 0;
        try {
            String qry = "SELECT COUNT(*) from " + parameters;
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            myRes = myStmt.executeQuery(qry);
            System.out.println(qry);
            while (myRes.next()) {
                tally = myRes.getInt(1);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return tally;
    }

    public ArrayList<String> employeeList(String parameters) {

        ArrayList<String> employees = new ArrayList<String>();
        try {
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt = myConn.createStatement();
            String qry = parameters;
            myRes = myStmt.executeQuery(qry);
            while (myRes.next()) {
                String x = myRes.getString("combined");
                employees.add(x);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (myRes != null)
                try {
                    myRes.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myStmt != null)
                try {
                    myStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (myConn != null)
                try {
                    myConn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return employees;

    }
}
