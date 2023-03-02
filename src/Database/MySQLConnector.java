/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author boxro
 */
public class MySQLConnector {
    String addr = "snboots.ddns.net:3310/ticketsys";
    String address = "jdbc:mysql://" + addr ;
    String user = "admin";
    String pass = "titingkayad";
    
    private static MySQLConnector datasource;
    private BasicDataSource ds;
    
    public MySQLConnector()throws IOException, SQLException, PropertyVetoException{
 


            ds = new BasicDataSource();
            ds.setUrl(address);
            ds.setUsername(user);
            ds.setPassword(pass);
 
 
            ds.setMinIdle(5);
            ds.setMaxIdle(10);
            ds.setMaxOpenPreparedStatements(50);
  
}
    
    public static MySQLConnector getInstance() throws IOException, SQLException, PropertyVetoException {
        if (datasource == null) {
            datasource = new MySQLConnector();
            return datasource;
        } else {
            return datasource;
        }
    }

    public Connection getConnection() throws SQLException {
        return this.ds.getConnection();
    }    
    
    
}
