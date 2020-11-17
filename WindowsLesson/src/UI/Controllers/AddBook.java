package UI.Controllers;

import Database.DatabaseHandler;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddBook implements Initializable {
    public TextField getBookID;
    public TextField getBookName;
    public TextField getBookAuthor;
    public DatabaseHandler handler;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            handler = DatabaseHandler.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBook(ActionEvent actionEvent) {

        String n = getBookName.getText();
        String i = getBookID.getText();
        String a = getBookAuthor.getText();


        boolean flag = n.isEmpty() || i.isEmpty() || a.isEmpty();

        if(flag) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all Fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
        String st = "INSERT INTO BOOK(BookId, BookName, BookAuthor) VALUES (" +
                "'" + i + "',"+
                "'" + n + "'," +
                "'" + a + "')";

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
    }
}
