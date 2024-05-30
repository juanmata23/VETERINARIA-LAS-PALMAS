package com.usta;

import java.io.IOException;
import javafx.fxml.FXML;


public class MenuCRUDcontroller {


    @FXML
    private void switchToAgregar() throws IOException {
        App.setRoot("AgregarMascota");
    }
    
    
    @FXML
    private void switchToVer() throws IOException {
        App.setRoot("VerMascota");
    }
    
    
     @FXML
     private void switchToActualizar() throws IOException {
         App.setRoot("ActualizarMascota");
     }
    
    
     @FXML
     private void switchToEliminar() throws IOException {
         App.setRoot("EliminarMascota");
     }
    
    
}
