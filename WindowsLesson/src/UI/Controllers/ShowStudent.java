package UI.Controllers;

import Database.DatabaseHandler;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ShowStudent implements Initializable {

    public TableView table;

    public static class Student {
        private final SimpleStringProperty name;
        private final SimpleStringProperty id;
        private final SimpleStringProperty email;

        Student(String name, String id, String email){
            this.name = new SimpleStringProperty(name);
            this.id = new SimpleStringProperty((id));
            this.email = new SimpleStringProperty(email);
        }

        public String getName() {
            return name.get();
        }
        public String getId() {
            return id.get();
        }
        public String getEmail() {
            return email.get();
        }

    }
    public ObservableList<Student> students = FXCollections.observableArrayList();
    public TableColumn idCol;
    public TableColumn nameCol;
    public TableColumn emailCol;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initiCol();
        try {
            loadData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void loadData() throws SQLException {
        DatabaseHandler handler = DatabaseHandler.getInstance();
        String qu = "SELECT * FROM STUDENT";
        ResultSet rs = handler.execQuery(qu);
        while(rs.next()){
            String name = rs.getString("name");
            String id = rs.getString("id");
            String email = rs.getString("email");

            students.add(new Student(name,id,email));
        }
        table.getItems().setAll(students);
    }

    private void initiCol() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
    }
}
