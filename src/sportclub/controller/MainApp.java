/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportclub.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author TOP
 */
public class MainApp extends Application {
    
    private Stage primaryStage;
    private static BorderPane rootLayout;
    
    @Override
    public void start(Stage primaryStage) {
       this.primaryStage = primaryStage;
       
       initRootLayout();
       
       showMainOverview();
    }
    
    public void initRootLayout(){
        try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/sportclub/views/RootLayout.fxml"));
            this.rootLayout = (BorderPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showMainOverview(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/sportclub/views/MainOverview.fxml"));
            AnchorPane mainOverview = (AnchorPane) loader.load();
            
            rootLayout.setCenter(mainOverview);
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Stage getPrimaryStage(){
        return this.primaryStage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
