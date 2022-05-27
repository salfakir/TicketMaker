/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.CheckBox;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Saad
 */
public class ITController implements Initializable {
    
    @FXML
    private Button logout;
    @FXML
    private AnchorPane an;
    @FXML
    private TableView<Ticket> curTable;
    @FXML
    private TableColumn<Ticket, CheckBox> complete;
    @FXML
    private TableColumn<Ticket, String> curReqstr;
    @FXML
    private TableColumn<Ticket, String> curReqTim;
    @FXML
    private TableColumn<Ticket, String> urg;
    @FXML
    private TableColumn<Ticket, String> curTyp;
    @FXML
    private TableColumn<Ticket, String> curDesc;
    @FXML
    private TableView<?> comTable;
    @FXML
    private TableColumn<?, ?> comReqstr;
    @FXML
    private TableColumn<?, ?> comReqTim;
    @FXML
    private TableColumn<?, ?> comTim;
    @FXML
    private TableColumn<?, ?> comTyp;
    @FXML
    private TableColumn<?, ?> comDes;
    @FXML
    private TextField kywrd;
    @FXML
    private ChoiceBox<?> querUrg;
    @FXML
    private ChoiceBox<?> querTyp;
    @FXML
    private Button search;
    @FXML
    private TableView<?> serTable;
    @FXML
    private TableColumn<?, ?> serReqstr;
    @FXML
    private TableColumn<?, ?> serReqTim;
    @FXML
    private TableColumn<?, ?> serTim;
    @FXML
    private TableColumn<?, ?> serTyp;
    @FXML
    private TableColumn<?, ?> serDes;
    ObservableList listPen = FXCollections.observableArrayList ();
    ObservableList listSearch = FXCollections.observableArrayList ();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listSearch.removeAll(listSearch);
        listSearch.add(new Ticket().tList);
        
        
        curReqTim.setCellValueFactory(new PropertyValueFactory<Ticket,String>("tim"));
        urg.setCellValueFactory(new PropertyValueFactory<Ticket,String>("urg"));
        curReqstr.setCellValueFactory(new PropertyValueFactory<Ticket,String>("reqstr"));
        curDesc.setCellValueFactory(new PropertyValueFactory<Ticket,String>("desc"));
        curTyp.setCellValueFactory(new PropertyValueFactory<Ticket,String>("typ"));
        complete.setCellValueFactory(new PropertyValueFactory<Ticket,CheckBox>("c"));
        
        
        serTable.setItems(listSearch);
        curTable.setItems(listPen);
    }    
     @FXML
    private void logout(ActionEvent event) throws IOException {
        Stage stage = (Stage) an.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.setScene(new Scene(root, 600, 400));
    }
    
}
