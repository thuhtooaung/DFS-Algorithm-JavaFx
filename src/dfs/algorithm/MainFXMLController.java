/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs.algorithm;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Thuhtooaung
 */
public class MainFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    //Data Model
    Data d = new Data();
    String allEdges = "";
    String fullEdges = "";
    String[] resultEdges;
    
    
    @FXML
    TextField vertex;
    
    @FXML
    TextField edge;
    
    @FXML
    TextField startNode;
    
    @FXML
    Button addVer;
    
    @FXML
    Button addEdge;
    
    @FXML 
    Button addNode;
    
    @FXML
    Button simulate;
    
    @FXML 
    Label nov;
    
    @FXML
    Label edg;
    
    @FXML 
    Label stn;
   
    @FXML
    Label Result;
    
    @FXML
    Label min;
    
    int ne = 0;
    @FXML
    private void addVertex(Event e){
        String v = vertex.getText();
        nov.setText(v);
        d.setVertex(Integer.parseInt(v));
        ne = Integer.parseInt(v) - 1;
        min.setText("min :"+ne+"-edges");
    }
    
    int count = 0;
    @FXML
    private void addEdges(Event e){
        String a = edge.getText();
        allEdges += "("+a+ ")"+" ";
        edg.setText(allEdges);
        fullEdges += a+"-";
        d.setFullEdg(fullEdges.substring(0, fullEdges.length()-1));
        edge.clear();
        count++;
        if(count >= ne){
            simulate.setDisable(false);
        }
    }
    
    @FXML 
    private void addStartNode(Event e){
        String s = startNode.getText();
        stn.setText(s);
        d.setStartNode(Integer.parseInt(s));
    }
    
    
    @FXML
    private void simulateDFS(Event e){
        Graph g = new Graph(d.getVertex());
        String res = d.getFullEdg();
        String[] s = res.split("-");
        for(int i=0;i<s.length;i++){
            String str = s[i];
            String[] x = str.split(",");
            g.addEdge(Integer.parseInt(x[0]), Integer.parseInt(x[1]));
        }
        
        g.DFS(d.getStartNode());
        Result.setText(g.result);
    }
    
}
