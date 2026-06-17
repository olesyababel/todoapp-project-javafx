package com.example.todoappjavafx;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Stage stage = new Stage();

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);
        vBox.getChildren().add(new Label("New window"));
        Scene scene = new Scene(vBox, 300,300);
        stage.setScene(scene);

        stage.show();
    }

    @FXML
    public void onByeButtonClick(){

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.setTitle("Question");

        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.setHeaderText("A new software update is ready.");
        dialogPane.setContentText("Would you like to install it and restart now?");
        dialogPane.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);

        dialog.showAndWait();
    }
}
