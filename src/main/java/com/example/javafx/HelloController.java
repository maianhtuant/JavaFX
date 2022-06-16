package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private HelloApplication app1;

    @FXML
    protected void onHelloButtonClick() {
        try{
            app1.stop();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}