package com.example.todoappjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    //hello again
    // second commit

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onByeButtonClick(){
        welcomeText.setText("Bye Bye!");
    }
}
