package com.example.simple_banking_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class IndividualPageController {

    @FXML
    public AnchorPane myAnchorPane;

    @FXML
    public javafx.scene.control.Label display_Username;
    @FXML
    public javafx.scene.control.Label CoverBackground1;
    @FXML
    public javafx.scene.control.Button Deposit1;

    @FXML
    public javafx.scene.control.Button Withdraw1;

    @FXML
    public javafx.scene.control.Button Balance1;

    @FXML
    public javafx.scene.control.Button CardServices1;
    @FXML
    public javafx.scene.control.Button CustomerServices1;

    @FXML
    public javafx.scene.control.Button Issue1;
    @FXML
    public javafx.scene.control.Button LogOut1;
    @FXML
    public javafx.scene.control.TextField DepositCollector;
    @FXML
    public javafx.scene.control.Button DepositAccount;
    @FXML
    public javafx.scene.control.TextField WithdrawalCollector;
    @FXML
    public javafx.scene.control.Button WithdrawFromAccount;
    @FXML
    public javafx.scene.control.Label BalanceDisplay;
    @FXML
    public javafx.scene.control.Label DepositDisplayer;
    @FXML
    public javafx.scene.control.Label WithdrawalDisplayed;

    @FXML
    public javafx.scene.control.Label Footercover;
    public javafx.scene.control.Label Menubar;

    String DepositContainer;
    double DoubleDepositContainer = 0.00;

    String WithdrawalContainer;

    double DoubleWithdrawalContainer;

    double a,b;
    double c = 0.00;

    double getDepValue = 0.00;

    String Username;
    String Password;


    double[] Depo = new double[3];


     Stage stage;
     Scene scene;
     Parent root;


    public void  setDisplayUsername(String Username){

        display_Username.setText(Username);

    }
    public void setLogOut(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Home.css").toExternalForm());
        HelloController helloController = loader.getController();
        helloController.displayBodyOne();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(" LOGOUT");
        alert.setHeaderText(" You are About to logout?.....");
        alert.setContentText(" Do you want to logout");

        if (alert.showAndWait().get() == ButtonType.OK){

            stage.close();

        }
        else{
           root = loader.load();
            stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("IndividualPage.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        }


        stage.setScene(scene);
        stage.show();
    }
    public void toContactUs(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ContactUs.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("ContactUs.css").toExternalForm());


        stage.setScene(scene);
        stage.show();
    }

    public void Invisibles(){

        DepositCollector.setVisible(false);
        DepositAccount.setVisible(false);
        WithdrawalCollector.setVisible(false);
        WithdrawFromAccount.setVisible(false);
        BalanceDisplay.setVisible(false);
        DepositDisplayer.setVisible(false);
        WithdrawalDisplayed.setVisible(false);

    }


    public void EnableDeposit(ActionEvent actionEvent){
        DepositCollector.setVisible(true);
        DepositAccount.setVisible(true);
        DepositDisplayer.setVisible(true);
        BalanceDisplay.setVisible(false);
        WithdrawalCollector.setVisible(false);
        WithdrawFromAccount.setVisible(false);
        WithdrawalDisplayed.setVisible(false);
        WithdrawalDisplayed.setTextFill(Color.BLACK);
        DepositCollector.clear();
    }







    public void setDepositAccount(ActionEvent actionEvent){
        try{

            DepositContainer = DepositCollector.getText();
            DoubleDepositContainer = Double.parseDouble(DepositContainer);
            a = DoubleDepositContainer;

            c = c + a;

            Depo[0]=c;
            BalanceDisplay.setText(" Your Balance is Gh$ " + c );
            BalanceDisplay.setVisible(true);

            DepositCollector.setVisible(false);
            DepositAccount.setVisible(false);
            DepositDisplayer.setVisible(false);
            DepositCollector.clear();

        }
        catch (InputMismatchException e){
            DepositDisplayer.setTextFill(Color.RED);
        }
        catch (Exception e){
            DepositDisplayer.setTextFill(Color.RED);
        }

    }

    public void EnableWithdrawal(ActionEvent actionEvent){

        BalanceDisplay.setVisible(false);
        WithdrawalCollector.setVisible(true);
        WithdrawFromAccount.setVisible(true);
        WithdrawalDisplayed.setVisible(true);
        DepositCollector.setVisible(false);
        DepositAccount.setVisible(false);
        DepositDisplayer.setVisible(false);
        DepositDisplayer.setTextFill(Color.BLACK);
        WithdrawalCollector.clear();
    }


    public void setWithdrawFromAccount(ActionEvent actionEvent){

        try {

            WithdrawalContainer = WithdrawalCollector.getText();
            DoubleWithdrawalContainer = Double.parseDouble(WithdrawalContainer);
            b = DoubleWithdrawalContainer;

            double d = Depo[0];
            c = d - b;
            Depo[1] = c;
            if (Depo[1] < 0){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(" Insufficient Balance");
                alert.setContentText(" The money you are trying to redraw is more than your Balance !!!!!");
                if (alert.showAndWait().get() == ButtonType.OK){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Input.fxml"));
                    root = loader.load();
                    stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    scene.getStylesheets().add(getClass().getResource("IndividualPage.css").toExternalForm());



                    IndividualPageController a = loader.getController();
                    a.setDisplayUsername(display_Username.getText());
                    a.Invisibles();

                    /*a.setFinalBalance();*/

                    stage.setScene(scene);
                    stage.show();
                }
                else {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Input.fxml"));
                    root = loader.load();
                    stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    scene.getStylesheets().add(getClass().getResource("IndividualPage.css").toExternalForm());



                    IndividualPageController a = loader.getController();
                    a.setDisplayUsername(display_Username.getText());
                    a.Invisibles();

                    /*a.setFinalBalance();*/

                    stage.setScene(scene);
                    stage.show();
                }
            }
            else {
                BalanceDisplay.setText(" Your Balance is Gh$ " + Depo[1]);
            }


            BalanceDisplay.setVisible(true);

            WithdrawalCollector.setVisible(false);
            WithdrawFromAccount.setVisible(false);
            WithdrawalDisplayed.setVisible(false);
            WithdrawalCollector.clear();

        }
        catch (InputMismatchException e){
            WithdrawalDisplayed.setTextFill(Color.RED);
        }
        catch (Exception e){
            WithdrawalDisplayed.setTextFill(Color.RED);
        }

    }

    public void setBalance(ActionEvent actionEvent){

        if (DepositAccount.isPressed()) {

            BalanceDisplay.setVisible(true);
            BalanceDisplay.setTextFill(Color.RED);
            WithdrawalCollector.setVisible(false);
            WithdrawFromAccount.setVisible(false);
            WithdrawalDisplayed.setVisible(false);
            DepositCollector.setVisible(false);
            DepositAccount.setVisible(false);
            DepositDisplayer.setVisible(false);
            BalanceDisplay.setText(" Your Balance is Gh$ " + Depo[0]);

        }

        else if (WithdrawFromAccount.isPressed()){

            BalanceDisplay.setVisible(true);
            BalanceDisplay.setTextFill(Color.RED);
            WithdrawalCollector.setVisible(false);
            WithdrawFromAccount.setVisible(false);
            WithdrawalDisplayed.setVisible(false);
            DepositCollector.setVisible(false);
            DepositAccount.setVisible(false);
            DepositDisplayer.setVisible(false);

            BalanceDisplay.setText(" Your Balance is Gh$ " + Depo[1]);
        }
        else{

            BalanceDisplay.setVisible(true);
            BalanceDisplay.setTextFill(Color.RED);
            WithdrawalCollector.setVisible(false);
            WithdrawFromAccount.setVisible(false);
            WithdrawalDisplayed.setVisible(false);
            DepositCollector.setVisible(false);
            DepositAccount.setVisible(false);
            DepositDisplayer.setVisible(false);


            BalanceDisplay.setText(" Your Balance is Gh$ " + Depo[1]);
        }

    }

}
