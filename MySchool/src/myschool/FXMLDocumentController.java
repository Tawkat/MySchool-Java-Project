/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    ///*****************LOG IN **********************
    @FXML
    Label label_welcome_myschool;
    @FXML
    Label label_login_username;
    @FXML
    Label label_login_password;
    @FXML
    Label label_login_verification;
    @FXML
    TextField text_login_username;
    @FXML
    TextField text_login_password;
    @FXML
    Button button_login;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        if(event.getSource()==button_login)
        {
            if(text_login_username.getText().equals("admin") && text_login_password.getText().equals("1234"))
            {
               // MySchool.connection.write("admin");
                label_login_verification.setText("");
                text_login_username.setText("");
                text_login_password.setText("");
                MySchool.window.setScene(MySchool.home);
            }
            else
            {
               text_login_username.setText("");
               text_login_password.setText("");
                label_login_verification.setText("Invalid Username or Password");
                
            }
            
        }
        ///******************LOG IN***********************************
    }
    
    
    /*@FXML
    private void setmouseover(MouseEvent event)
    {
        if(event.getSource()==button_buet)
        {
            button_buet.setStyle("-fx-font-style:italic");
            //button_buet.set
            button_buet.setStyle("-fx-background-color:black");
           // button_buet.setStyle("-fx-font-size:20");
            
        }
    }
    @FXML
    private void setmouseout(MouseEvent event)
    {
        if(event.getSource()==button_buet)
        {
            button_buet.setStyle("-fx-font-style:arial");
            //button_buet.setStyle("-fx-font-setTextFill:cyan");
          //  button_buet.setStyle("-fx-background-color:black");
           // button_buet.setStyle("-fx-font-size:20");
        }
    }*/
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
