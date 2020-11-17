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

public class ShowBooks implements Initializable {
    public TableView table;

    public static class Book {
        private final SimpleStringProperty BookName;
        private final SimpleStringProperty Bookid;
        private final SimpleStringProperty Bookauthor;

        Book(String name, String id, String author){
            this.BookName = new SimpleStringProperty(name);
            this.Bookid = new SimpleStringProperty((id));
            this.Bookauthor = new SimpleStringProperty(author);
        }

        public String getName() {
            return BookName.get();
        }
        public String getId() {
            return Bookid.get();
        }
        public String getAuthor() {
            return Bookauthor.get();
        }

    }
    public ObservableList<Book> books = FXCollections.observableArrayList();
    public TableColumn idCol;
    public TableColumn nameCol;
    public TableColumn authorCol;


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
        String qu = "SELECT * FROM BOOK";
        ResultSet rs = handler.execQuery(qu);
        while(rs.next()){
            String name = rs.getString("BookName");
            String id = rs.getString("BookID");
            String author = rs.getString("BookAuthor");
            System.out.println(name+":"+id+":" +author);
            books.add(new Book(name,id,author));
        }
        table.getItems().setAll(books);
    }

    private void initiCol() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));
    }
}

