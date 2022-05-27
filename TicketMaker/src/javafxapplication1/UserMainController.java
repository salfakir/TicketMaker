/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import static java.time.LocalDate.now;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Spliterator;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
/**
 * FXML Controller class
 *
 * @author Saad
 */
public class UserMainController implements Initializable {
ObservableList list = FXCollections.observableArrayList ();
    @FXML
    private ChoiceBox<String> urgency;
    @FXML
    private ChoiceBox<String> type;
    @FXML
    private TextArea desc;
    @FXML
    private TableView com;
    @FXML
    private TableView <Pen>pen;
    
    
    @FXML
    private TableColumn<Pen,String> penReqTim;
    @FXML
    private TableColumn<Pen,String>  penUrgency;
    @FXML
    private TableColumn<Pen,String>  penType;
    @FXML
    private TableColumn<Pen,String>  penDes;
    
    
    @FXML
    private TableColumn<Com,String>  comReqTim;
    @FXML
    private TableColumn<Com,String>  itSpec;
    @FXML
    private TableColumn<Com,String>  comTim;
    @FXML
    private TableColumn<Com,String>  comType;
    @FXML
    private TableColumn<Com,String>  comDes;
    
    
    @FXML
    private AnchorPane an;
    @FXML
    private Button logout;
    @FXML
    private Button submit;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
        //com.getColumns().addAll("10-11-19", "jon johnson", "18-11-19", "software", "software is crashing");
        //new TableColumn("24-10-19"), new TableColumn("not urgent"),  new TableColumn("hardware"), new TableColumn("laptop overheating")
    }    
    private void loadData(){
        list.removeAll(list);
        String a ="urgent", b = "not urgent";
        list.addAll(a,b);
        urgency.getItems().addAll(list);
        urgency.setValue("not urgent");
        list.removeAll(list);
        String c ="account";
        a="software";
        b="hardware";
        list.addAll(a,b,c);
        type.getItems().addAll(list);
        
        penReqTim.setCellValueFactory(new PropertyValueFactory<Pen,String>("tim"));
        penUrgency.setCellValueFactory(new PropertyValueFactory<Pen,String>("urg"));
        penType.setCellValueFactory(new PropertyValueFactory<Pen,String>("typ"));
        penDes.setCellValueFactory(new PropertyValueFactory<Pen,String>("desc"));
        
        list.removeAll(list);
        list.addAll(new Pen().pList);
        pen.setItems(list);
        
        
        ObservableList li = FXCollections.observableArrayList ();
        comReqTim.setCellValueFactory(new PropertyValueFactory<Com,String>("reqTim"));
        comTim.setCellValueFactory(new PropertyValueFactory<Com,String>("comTim"));
        itSpec.setCellValueFactory(new PropertyValueFactory<Com,String>("it"));
        comType.setCellValueFactory(new PropertyValueFactory<Com,String>("typ"));
        comDes.setCellValueFactory(new PropertyValueFactory<Com,String>("desc"));
        li.removeAll(li);
        
        new Com("24-5-19","29-5-19", "jon johnson", "software", "laptop crashing");
        new Com("29-5-18","01-6-18", "some dude, other dude", "software", "chrome crashing");
        new Com("14-3-17","15-3-17", "sam man", "software", "computer slow");
        li.addAll(new Com().cList);
        com.setItems(li);
    }
    
    
     @FXML
    private void logout(ActionEvent event) throws IOException {
        Stage stage = (Stage) an.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.setScene(new Scene(root, 600, 400));
    }
    @FXML
    private void submit(ActionEvent event) throws IOException {
        new Pen(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now()), urgency.getValue().toString(), type.getValue().toString(), desc.getText() );
        new Ticket(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now()),"bob", urgency.getValue().toString(), type.getValue().toString(), desc.getText() );
        list.removeAll(list);
        list.addAll(new Pen().pList);
    }
}
