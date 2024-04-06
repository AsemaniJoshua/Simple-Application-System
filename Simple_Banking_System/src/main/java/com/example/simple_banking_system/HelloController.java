package com.example.simple_banking_system;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;


public class HelloController {
    @FXML
     public AnchorPane myAnchorPane;

    @FXML
    public Label MenuBar;
    @FXML
    public ImageView HomeIcon;
    @FXML
    public Button HomeTab;

    @FXML
    public Button AboutTab;

    @FXML
    public Button ContactUsTab;

    @FXML
    public Button LogInTab;

    @FXML
    public Button SignUpTab;

    @FXML
    public Label Body1;

    @FXML
    public ImageView myImageView1;

    @FXML
    public Button Register;

    @FXML
    public Button BankingServices;

    @FXML
    public Button ContactUs;

    @FXML
    public Button LogIn;

    @FXML
    public Label Footer;

    @FXML
    Stage stage;

    @FXML
    Scene scene;

    @FXML
    Parent root;
    public void displayBodyOne(){
        Body1.setText("WELCOME TO OUR BANKING SYSTEM.\n\n\nWe provide you with " +
                "eligible Banking Services you can ever imagine of. Let us be your number " +
                "one Banking company you can rely on. We serve our customers to their full satisfaction");
    }


    public void AboutPage(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("About.fxml"));
        root = loader.load();
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("About.css").toExternalForm());
        AboutController aboutController = loader.getController();
        aboutController.AboutWords();
        aboutController.AboutFooterWords();
        stage.setScene(scene);
        stage.show();
    }


    public void ContactUsPage(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ContactUs.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("ContactUs.css").toExternalForm());


        stage.setScene(scene);
        stage.show();
    }


    public void LogInPage(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("LogIn.css").toExternalForm());



        stage.setScene(scene);
        stage.show();
    }

    public void SignUpPage(javafx.event.ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("SignUp.css").toExternalForm());



        stage.setScene(scene);
        stage.show();
    }
}