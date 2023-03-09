package Database;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Establishes a connection to a MySQL database using Apache DBCP2 connection
 * pool. Implements the Singleton pattern to ensure only one instance of the
 * connection pool is created.
 */
public class MySQLConnector {

    // Database connection details
    private String _address = "jdbc:mysql://snboots.ddns.net:3306/ticketsys2";
    private String _user = "admin";
    private String _password = "titingkayad";

    private static MySQLConnector _instance;
    private BasicDataSource _dataSource;

    // Constructs a new instance of the MySQLConnector class and initializes the connection pool.
    private MySQLConnector() throws IOException, SQLException, PropertyVetoException {
        // Initialize the connection pool
        _dataSource = new BasicDataSource();
        _dataSource.setUrl(_address);
        _dataSource.setUsername(_user);
        _dataSource.setPassword(_password);
        _dataSource.setMinIdle(5);
        _dataSource.setMaxIdle(10);
        _dataSource.setMaxOpenPreparedStatements(50);
    }

    // Returns the instance of the MySQLConnector class.
    public static synchronized MySQLConnector getInstance() throws IOException, SQLException, PropertyVetoException {
        if (_instance == null) {
            _instance = new MySQLConnector();
        }
        return _instance;
    }

    //Returns a connection to the database from the connection pool.
    public Connection getConnection() throws SQLException {
        return _dataSource.getConnection();
    }
}
