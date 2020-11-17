package UI.Controllers;

import Database.DatabaseHandler;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import javax.xml.crypto.Data;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddStudent implements Initializable {
    public TextField getID;
    public TextField getName;
    public TextField getEmail;
    public DatabaseHandler handler;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            handler = DatabaseHandler.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(ActionEvent actionEvent) {
        String n = getName.getText();
        String i = getID.getText();
        String email = getEmail.getText();


        boolean flag = n.isEmpty() || i.isEmpty()|| email.isEmpty() ;
        if(flag) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all Fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
        String st = "INSERT INTO STUDENT(Id,name, email) VALUES (" +
                "'" + i + "',"+
                "'" + n + "',"+
                "'" + email + "')";
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
