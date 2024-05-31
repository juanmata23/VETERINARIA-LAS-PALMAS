package com.usta;

import java.io.IOException;
import javafx.fxml.FXML;


public class ActualizarMascotaController {


    @FXML
    private void switchToActualizar() throws IOException {
        App.setRoot("ActualizarMascota");
    }
    @FXML
    private void switchToMenuCRUD() throws IOException {
        App.setRoot("MenuCRUD");
    }

   
    
}
