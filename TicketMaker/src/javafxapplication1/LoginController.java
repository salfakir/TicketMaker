/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Saad
 */
public class LoginController implements Initializable {

    @FXML
    private AnchorPane an;
    @FXML
    private TextField usr;
    @FXML
    private TextField pass;
    @FXML
    private Button submit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
        Stage stage = (Stage) an.getScene().getWindow();
        String cont="";
        if (usr.getText().equals("bob"))
            cont="userMain.fxml";
        else if(usr.getText().equals("jon"))
            cont = "IT.fxml";
        else{
            System.exit(0);
        }
        Parent root = FXMLLoader.load(getClass().getResource(cont));
        stage.setScene(new Scene(root, 600, 400));
    }
    
}
