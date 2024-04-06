package com.example.simple_banking_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class SignUpController {



    @FXML
    public javafx.scene.control.Button SignUpButton;
    @FXML
    public javafx.scene.control.Button BackButton;

    @FXML
    public javafx.scene.control.Button LogInButton;



    @FXML
    public javafx.scene.control.TextField PassField;
    @FXML
    public javafx.scene.control.Label SignUpCover;
    @FXML
    public javafx.scene.control.TextField UserField;

    Stage stage;

    Scene scene;

    Parent root;

    String UserUsername, UserPassword;

     public void checkSignUp(){
         /*
        if (UserField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(" ERROR ");
            alert.setHeaderText(" Please Fills cannot be left empty !!!");
            SignUpButton.setVisible(false);
        }
        if (PassField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(" ERROR ");
            alert.setHeaderText(" Please Fills cannot be left empty !!!");
            SignUpButton.setVisible(false);
        }


        if (!UserField.getText().isEmpty() && !PassField.getText().isEmpty()){
            SignUpButton.setVisible(true);
        }
        */


    }

    public void setSignUpButton(ActionEvent actionEvent) throws IOException {
            if (!UserField.getText().isEmpty() && !PassField.getText().isEmpty()){

                FXMLLoader loader = new FXMLLoader(getClass().getResource("Input.fxml"));
                root = loader.load();
                stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("IndividualPage.css").toExternalForm());


                UserUsername = UserField.getText();
                UserPassword = PassField.getText();
                IndividualPageController a = loader.getController();
                a.setDisplayUsername(UserUsername);
                a.Invisibles();

                /*a.setFinalBalance();*/

                stage.setScene(scene);
                stage.show();

            }
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Please fill all blank spaces in the fields");

                if (alert.showAndWait().get() == ButtonType.OK){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
                    root = loader.load();
                    stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    scene.getStylesheets().add(getClass().getResource("SignUp.css").toExternalForm());



                    stage.setScene(scene);
                    stage.show();
                }
            }

    }

    public void setLogInButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("LogIn.css").toExternalForm());



        stage.setScene(scene);
        stage.show();

    }

    public void BackToHomePageFromSignUpPage(javafx.event.ActionEvent actionEvent) throws IOException {

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
