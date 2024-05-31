package com.usta;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class IngresarController {

@FXML
private TextField usuarioField;
@FXML
private TextField passField;

    @FXML
    private void switchToMenu() throws IOException {

        if (usuarioField.getText().equals("Pepito") && passField.getText().equals("admin123")) {
        App.setRoot("menuCRUD");
            
        }else{
            System.out.println("Credenciales incorrectas");
        }
    }
    
}
