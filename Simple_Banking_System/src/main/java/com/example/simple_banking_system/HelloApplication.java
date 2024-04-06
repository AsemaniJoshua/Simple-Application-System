package com.example.simple_banking_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        stage.setMaximized(true);
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("Home.css").toExternalForm());
        stage.setTitle("Simple Banking Application");
        HelloController mycontroller = fxmlLoader.getController();
        mycontroller.displayBodyOne();



        stage.setOnCloseRequest(windowEvent -> {
           windowEvent.consume();
           quit(stage);
        });



        Image Stageimage = new Image("C:\\New folder\\Simple_Banking_System\\src\\a.jpg");
        stage.getIcons().add(Stageimage);
        stage.setScene(scene);
        stage.show();
    }

    public void quit(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText(" You are about to exit from this Application !!!");
        alert.setContentText(" Do you want to exit?");

        if (alert.showAndWait().get() == ButtonType.OK){
            JOptionPane.showMessageDialog(null," Thank you for using our Site.");
            stage.close();
        }
    }

    public static void main(String[] args) {

            launch();

    }
}