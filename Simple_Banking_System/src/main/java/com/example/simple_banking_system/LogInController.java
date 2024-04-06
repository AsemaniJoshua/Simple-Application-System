package com.example.simple_banking_system;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;

public class LogInController {

    @FXML
    public javafx.scene.control.Label LogInLabel;

    @FXML
    public javafx.scene.control.TextField Username;

    @FXML
    public javafx.scene.control.PasswordField Password;

    @FXML
    public javafx.scene.control.Button BackToHomePage3;

    @FXML
    public javafx.scene.control.Button LogIn;


     Stage stage;


    Scene scene;


    Parent root;

    String UserUsername;

    String UserPassword;


    public void BacktoHomePage(javafx.event.ActionEvent actionEvent) throws IOException {
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

    public void checkLogin(){
        /*
        if (Username.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(" ERROR ");
            alert.setHeaderText(" Please Fills cannot be left empty !!!");
            LogIn.setVisible(false);
        }

        if (Password.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(" ERROR ");
            alert.setHeaderText(" Please Fills cannot be left empty !!!");
            LogIn.setVisible(false);
        }
        if (!Username.getText().isEmpty() && !Password.getText().isEmpty()){
            LogIn.setVisible(true);
        }
        */

    }


    public void Login(javafx.event.ActionEvent actionEvent) throws IOException {
        /*FXMLLoader loader = new FXMLLoader(getClass().getResource("IndividualPage2.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("IndividualPage.css").toExternalForm());

        UserUsername = Username.getText();
        UserPassword = Password.getText();

        IndividualPageController individualPageController = loader.getController();
        individualPageController.setDisplayUsername(UserUsername);
        individualPageController.Invisibles();
        individualPageController.setFinalBalance();
        stage.setScene(scene);
        stage.show();*/

        if (!Username.getText().isEmpty() && !Password.getText().isEmpty()){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Input.fxml"));
            root = loader.load();
            stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("IndividualPage.css").toExternalForm());


            UserUsername = Username.getText();
            UserPassword = Password.getText();

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
                FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
                root = loader.load();
                stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("LogIn.css").toExternalForm());



                stage.setScene(scene);
                stage.show();
            }
        }




    }

    public void SignUp(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("SignUp.css").toExternalForm());



        stage.setScene(scene);
        stage.show();
    }
}
