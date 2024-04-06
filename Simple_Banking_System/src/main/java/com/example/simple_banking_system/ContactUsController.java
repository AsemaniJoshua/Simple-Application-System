package com.example.simple_banking_system;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactUsController {

    @FXML
    public Label ContactUsWords;

    @FXML
    public Label Number1;

    @FXML
    public Label Number2;

    @FXML
    public Label WhatsAppNumber;

    @FXML
    public Button BackToHome;

    @FXML
    Stage stage;

    @FXML
    Scene scene;

    @FXML
    Parent root;

    public void BackToHomePageFromContactPage(javafx.event.ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Home.css").toExternalForm());
        HelloController helloController = loader.getController();
        helloController.displayBodyOne();
        stage.setScene(scene);
        stage.show();
    }
}
