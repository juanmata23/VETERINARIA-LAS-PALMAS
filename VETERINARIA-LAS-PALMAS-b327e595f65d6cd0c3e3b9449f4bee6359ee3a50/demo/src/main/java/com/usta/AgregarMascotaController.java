package com.usta;

import java.io.IOException;
import javafx.fxml.FXML;



public class AgregarMascotaController {


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
}
