package UI.Controllers;

import Database.DatabaseHandler;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddCheckout implements Initializable {
    public TextField getStudentIDCheckout;
    public TextField getStudentNameCheckout;
    public TextField getStudentEmailCheckout;
    public TextField getBookIDCheckout;
    public TextField getBookNameCheckout;
    public TextField getBookAuthorCheckout;
    public DatabaseHandler handler;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            handler = DatabaseHandler.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCheckout(ActionEvent actionEvent) throws SQLException {
        String n = getStudentNameCheckout.getText();
        String i = getStudentIDCheckout.getText();
        String email = getStudentEmailCheckout.getText();
        String bID = getBookIDCheckout.getText();
        String bn = getBookNameCheckout.getText();
        String ba = getBookAuthorCheckout.getText();


        boolean flag = n.isEmpty() || i.isEmpty()|| email.isEmpty() || bID.isEmpty() || bn.isEmpty() || ba.isEmpty();
        if(flag) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all Fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
        handler.createCheckoutTable();
        try {
            int chkBookIdResult = checkBookId(bID);
            int chkStudentIdResult = checkStudentId(i);
            if(chkBookIdResult==1 && chkStudentIdResult==1){
                String st = "INSERT INTO CHECKOUT(Id, StudentId, StudentName, StudentEmail, BookId, BookName, BookAuthor) VALUES (" +
                        //USER NEEDS TO CHANGE THE ID EVERYTIME THEY CHECKOUT
                        "'3',"+
                        "'" + i + "',"+
                        "'" + n + "',"+
                        "'" + email + "'," +
                        "'" + bID + "'," +
                        "'" + bn + "'," +
                        "'" + ba + "')";
                System.out.println(st);
                if(handler.execAction(st)){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Saved");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Error with inputting data");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                    return;
                }
            } else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Student ID / Book ID does not exists");
                alert.setHeaderText(null);
                alert.showAndWait();
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int checkBookId(String bookId) throws SQLException{
        DatabaseHandler handler = DatabaseHandler.getInstance();
        String qu = "SELECT * FROM BOOK where bookid = '"+bookId+"'";
        ResultSet rs = handler.execQuery(qu);
        while(rs.next()){
            String name = rs.getString("BookName");
            String id = rs.getString("BookID");
            String author = rs.getString("BookAuthor");
            System.out.println(name+":"+id+":" +author);
            return 1;

        }
        return 0;

    }
    public int checkStudentId(String studentId) throws SQLException{
        DatabaseHandler handler = DatabaseHandler.getInstance();
        String qu = "SELECT * FROM STUDENT where id = '"+studentId+"'";
        ResultSet rs = handler.execQuery(qu);
        while(rs.next()){
            String name = rs.getString("name");
            String id = rs.getString("id");
            String email = rs.getString("email");
            System.out.println(name+":"+id+":" +email);
            return 1;

        }
        return 0;

    }

}
