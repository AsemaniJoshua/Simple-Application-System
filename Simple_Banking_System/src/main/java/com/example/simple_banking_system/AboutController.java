package com.example.simple_banking_system;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class AboutController {

    @FXML
    public Label AboutCover;

    @FXML
    public Button Back;

    @FXML
    Stage stage;

    @FXML
    Scene scene;

    @FXML
    Parent root;

    @FXML
    public Label AboutFooter;

    public void BackToHomePage(javafx.event.ActionEvent actionEvent) throws IOException {
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

    public void AboutWords(){
        AboutCover.setText("ABOUT\tUS\n" + "We are a unique Bank that put the needs of our " +
                "customers to be our first priority.\n" +
                "We engage in all activities of a legal Bank. We are accredited by THE BANK OF GHANA " +
                "to work.\n" +
                "Some of our services include:\n" +
                "1. Credit cards.\n" +
                "2. Cheque payments\n" +
                "3. Discounting on bills of exchange.\n" +
                "4. Advancements of loans.\n" +
                "5. Collecting and paying the credit instruments.\n" +
                "6. Funds remittance and many more..................");
    }

    public void AboutFooterWords(){
        AboutFooter.setText(" LET US BE YOUR BANK !!!");
    }
}
