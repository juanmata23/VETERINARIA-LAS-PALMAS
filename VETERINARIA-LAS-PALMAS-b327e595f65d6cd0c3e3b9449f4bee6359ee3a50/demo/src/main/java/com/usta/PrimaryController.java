package com.usta;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToIngresar() throws IOException {
        App.setRoot("ingresar");
    }
}