/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs.algorithm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 *
 * @author Thuhtooaung
 */
public class FXMLDocumentController implements Initializable {
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
   @FXML
   Button startBtn;
   
   @FXML 
   private void Startbtn(Event e){
       try{
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainFXML.fxml"));
           Parent root1 = (Parent) fxmlLoader.load();
           Stage stage = new Stage();
           stage.setTitle("Depth First Search Algorithm Simulation...");
           stage.setScene(new Scene(root1));
           stage.show();
           //Stage init_stage = (Stage) startBtn.getScene().getWindow();
           //init_stage.close();
       } catch (Exception exc){
           System.out.println("Cannot load new window");
       }
   }
}
