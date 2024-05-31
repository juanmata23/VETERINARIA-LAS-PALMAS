package com.usta;

import java.io.IOException;
import javafx.fxml.FXML;


public class EliminarMascotaController {


    @FXML
    private void switchToEliminar() throws IOException {
        App.setRoot("EliminarMascota");
    }
    @FXML
    private void switchToMenuCRUD() throws IOException {
        App.setRoot("MenuCRUD");
    }
    
}
