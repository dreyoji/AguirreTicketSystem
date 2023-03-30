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
public class Data_Credentials implements Data<Credentials>{
    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRes = null;
    
    public ArrayList<Credentials> ShowRec(String table)
    {
        ArrayList<Credentials> user=new ArrayList<Credentials>();
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();		
            String qry = "SELECT * FROM " + table;
	    myRes = myStmt.executeQuery(qry);
            System.out.println(qry);
	    while(myRes.next())
            {
                user.add(new Credentials(myRes.getInt("num"), myRes.getString("empnum"), myRes.getString("username"), myRes.getString("password"), myRes.getString("email_add"), myRes.getString("firstname"), myRes.getString("middlename"), myRes.getString("lastname"), myRes.getInt("age"), myRes.getString("birthday"), myRes.getString("phonenum"), myRes.getString("gender"), myRes.getString("residence"), myRes.getString("acctype"), myRes.getString("startdate"), myRes.getString("department"), myRes.getString("position")));
            }				
        }
	catch(SQLException ex)
	{
            JOptionPane.showMessageDialog(null, ex.getMessage());
	} catch (IOException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }        
        return user;
    }    
    
    public void createTable(String table)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "CREATE TABLE `ticketsys`.`credentials` (`num` INT NOT NULL AUTO_INCREMENT,`empnum` VARCHAR(45) NULL,`username` VARCHAR(45) NULL,`password` VARCHAR(45) NULL,`email_add` VARCHAR(45) NULL,`firstname` VARCHAR(45) NULL,`middlename` VARCHAR(45) NULL,`lastname` VARCHAR(45) NULL,`age` INT NULL,`birthday` DATE NULL,`phonenum` VARCHAR(20) NULL,`gender` VARCHAR(30) NULL,`residence` VARCHAR(150) NULL,`acctype` VARCHAR(20) NULL,`startdate` DATE NULL,`department` VARCHAR(45) NULL,`position` VARCHAR(45) NULL,PRIMARY KEY (`num`),UNIQUE INDEX `num_UNIQUE` (`num` ASC) VISIBLE);";

            myStmt.executeUpdate(qry);
	    myStmt.close();
            JOptionPane.showMessageDialog(null, "Table created");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }        
    }

    public void deleteTable(String table)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "DROP TABLE " + table;
            myStmt.executeUpdate(qry);
	    myStmt.close();
            JOptionPane.showMessageDialog(null, "Table deleted");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }        
    }    
    
    public void addRow(String table, Credentials user)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "INSERT INTO credentials VALUES (" + user.getNum() + ", '" + user.getEmpnum() + "', '" + user.getU_name() + "', '" + user.getPass() + "', '" + user.getEmail() + "', '" + user.getF_name() + "', '" + user.getM_name() + "', '" + user.getL_name() + "', '" + user.getAge() + "', '" + user.getBday() + "', '" + user.getPhonenum() + "', '" + user.getGender() +"', '" + user.getResidence() + "', '" + user.getActType() + "', '" + user.getStartdate() + "', '" + user.getDepartment() + "', '" + user.getPosition() + "')" ;
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Entry added");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }         
    } 
    public void editRow(String table, Credentials user)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "UPDATE credentials SET empnum = '" + user.getEmpnum() + "', username = '" + user.getU_name() + "', password = '" + user.getPass() + "', email_add = '" + user.getEmail() + "', firstname = '" + user.getF_name() + "', middlename = '" + user.getM_name() + "', lastname = '" + user.getL_name() + "', age = '" + user.getAge() + "', phonenum = '" + user.getPhonenum() + "', gender = '" + user.getGender() + "', residence = '" + user.getResidence() + "', acctype = '" + user.getActType() + "', startdate = '" + user.getStartdate() + "', department = '" + user.getDepartment() + "', position = '" + user.getPosition() + "' WHERE num = " + "'" + user.getNum() + "'";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            JOptionPane.showMessageDialog(null, "Entry updated");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }        
    } 
    public void deleteRow(String table, Credentials user)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "DELETE FROM" + table + " WHERE num = '" + user.getNum() + "'";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            JOptionPane.showMessageDialog(null, "Entry deleted");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }         
    }
    public void deleteRowSpec(String num)
    {
        try{
            myConn = MySQLConnector.getInstance().getConnection();
            myStmt=myConn.createStatement();
            String qry = "DELETE FROM credentials WHERE num = " + num + "";
            System.out.println(qry);
            myStmt.executeUpdate(qry);
            myStmt.close();
            JOptionPane.showMessageDialog(null, "Entry deleted");            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Data_Credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (myRes != null) try { myRes.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myStmt != null) try { myStmt.close(); } catch (SQLException e) {e.printStackTrace();}
            if (myConn != null) try { myConn.close(); } catch (SQLException e) {e.printStackTrace();}        
        }         
    } 
      
   
}
