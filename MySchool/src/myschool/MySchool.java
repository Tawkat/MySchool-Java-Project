/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.NetworkUtil;

/**
 *
 * @author User
 */
public class MySchool extends Application {
    
    
    public static Stage window;
    public static Scene login,home,university,buet,mit,oxford,buet_cse,buet_me,buet_eee,mit_cse,mit_me,mit_eee;
    public static Scene oxford_cse,oxford_me,oxford_eee;
    //public static NetworkUtil connection;
   public  MySchool()
    {
        
      //  connection=new NetworkUtil("127.0.0.1",44445);
        
    }
    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        Parent root1 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        login = new Scene(root1);
        window.setTitle("MySchool");
        window.setScene(login);
        
        Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        home = new Scene(root2);
        
        Parent root3 = FXMLLoader.load(getClass().getResource("University.fxml"));
        university = new Scene(root3);
        
        Parent root4 = FXMLLoader.load(getClass().getResource("BUET.fxml"));
        buet = new Scene(root4);
        
        Parent root5 = FXMLLoader.load(getClass().getResource("MIT.fxml"));
        mit = new Scene(root5);
        
        Parent root6 = FXMLLoader.load(getClass().getResource("OXFORD.fxml"));
        oxford = new Scene(root6);
        
        Parent root7 = FXMLLoader.load(getClass().getResource("BUET_CSE.fxml"));
        buet_cse = new Scene(root7);
        
        Parent root8 = FXMLLoader.load(getClass().getResource("BUET_EEE.fxml"));
        buet_eee = new Scene(root8);
        
        Parent root9 = FXMLLoader.load(getClass().getResource("BUET_ME.fxml"));
        buet_me = new Scene(root9);
        
        Parent root10 = FXMLLoader.load(getClass().getResource("MIT_CSE.fxml"));
        mit_cse = new Scene(root10);
        
        Parent root11 = FXMLLoader.load(getClass().getResource("MIT_EEE.fxml"));
        mit_eee = new Scene(root11);
        
        Parent root12 = FXMLLoader.load(getClass().getResource("MIT_ME.fxml"));
        mit_me = new Scene(root12);
        
        Parent root13 = FXMLLoader.load(getClass().getResource("OXFORD_CSE.fxml"));
        oxford_cse = new Scene(root13);
        
        Parent root14 = FXMLLoader.load(getClass().getResource("OXFORD_EEE.fxml"));
        oxford_eee = new Scene(root14);
        
        Parent root15 = FXMLLoader.load(getClass().getResource("OXFORD_ME.fxml"));
        oxford_me = new Scene(root15);
       
        
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
