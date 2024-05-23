package com.usta;

import java.io.IOException;
import javafx.fxml.FXML;


public class PrimaryController {


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToMascota() throws IOException {
        App.setRoot("mascota");
    }
    @FXML
    private void switchToIngresar() throws IOException {
        App.setRoot("ingresar");
    }

}
