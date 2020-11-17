package UI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindow implements Initializable {


    public ListView<String> listview = new ListView<>();
    public TextField messageText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Runs when window opens");
    }

    void loadWindow(String location, String title) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource(location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showStudentWindow(ActionEvent actionEvent) {
        loadWindow("../Layouts/showStudent.fxml", "Add Student");
    }

    public void addMessage(ActionEvent actionEvent) {
        String message = messageText.getText();
        listview.getItems().add(message);
        messageText.clear();
    }


    public void addStudent(ActionEvent actionEvent) {
        loadWindow("../Layouts/addstudent.fxml", "Add Student");
    }

    public void addBook(ActionEvent actionEvent) {
        loadWindow("../Layouts/addBook.fxml", "Add Book");
    }

    public void showBooks(ActionEvent actionEvent) {
        loadWindow("../Layouts/showBooks.fxml", "Add Book");
    }

    public void checkoutBook(ActionEvent actionEvent) {
        loadWindow("../Layouts/AddCheckout.fxml", "Add Checkout");
    }


}
