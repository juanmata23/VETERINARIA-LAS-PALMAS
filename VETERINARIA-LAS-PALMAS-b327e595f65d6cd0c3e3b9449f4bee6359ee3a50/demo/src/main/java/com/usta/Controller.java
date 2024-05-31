package com.usta;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;

public class Controller {
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
    @FXML
    private Button bitChangeTab;
    @FXML
    private TabPane tabPane ;
    @FXML
    private void initialize () {
        bitChangeTab.setOnAction(event -> {
    tabPane.getSelectionModel().select (1);

    });
  }
}
}
