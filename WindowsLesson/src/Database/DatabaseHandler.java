package Database;

import javax.swing.*;
import java.sql.*;

public class DatabaseHandler {
    private static DatabaseHandler handler = null;

    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;

    public DatabaseHandler(){
        createConnection();
        createStudentTable();
        createBookTable();
    }

    public static DatabaseHandler getInstance() throws SQLException {
        if(handler == null){
            handler = new DatabaseHandler();
        }
        return handler;
    }

    private void createStudentTable() {
        String TABLE_NAME = "STUDENT";
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + " already exists");
            } else {
                String statement = "CREATE TABLE " + TABLE_NAME + "("
                        + "id varchar(200) primary key,\n"
                        + "name varchar (200),\n"
                        + "email varchar (200))";

                System.out.println(statement);
                stmt.execute(statement);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage() + "setting up database");
        }
    }



    public void createCheckoutTable() {
        String TABLE_NAME = "CHECKOUT";
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + " already exists");
            } else {

                String statement = "CREATE TABLE " + TABLE_NAME + "("
                        + "Id varchar(200) primary key,\n"
                        + "StudentId varchar (200),\n"
                        + "StudentName varchar (200),\n"
                        + "StudentEmail varchar (200), \n"
                        + "BookId varchar(200),\n"
                        + "BookName varchar(200),\n"
                        + "BookAuthor varchar(200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage() + "setting up database");
        }
    }

    private void createBookTable() {
        String TABLE_NAME = "BOOK";
        try {
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + " already exists");
            } else {
                String statement = "CREATE TABLE " + TABLE_NAME + "("
                        + "BookID varchar(200) primary key,\n"
                        + "BookName varchar(200),\n"
                        + "BookAuthor varchar(200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage() + "setting up database");
        }
    }


    private void createConnection() {
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(DB_url);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public ResultSet execQuery(String query){
        ResultSet resultSet;
        try{
            stmt = conn.createStatement();
            resultSet =stmt.executeQuery(query);
        }catch(SQLException e) {
            System.out.println("Exception at Execute query");
            return null;
        }
        return resultSet;
    }

    public boolean execAction(String qu){
        try{
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error:" + e.getMessage(), "Error Occured",JOptionPane.ERROR_MESSAGE);
            System.out.println("exception at execQuery" + e.getLocalizedMessage());
            return false;
        }
    }


}
