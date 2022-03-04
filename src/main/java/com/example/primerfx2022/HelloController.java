package com.example.primerfx2022;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML public TextField usuario;
    @FXML public TextField password;

    @FXML
    protected void onHelloButtonClick() {
    }

    @FXML public void saludo(){
        String pass=password.getText();
        System.out.println("tu password es: "+pass);
    }
}