package com.usta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class NubeController {

    public ObservableList<mascota> mascotaOL = FXCollections.observableArrayList();
    public List<mascota> mascotaList= new ArrayList<>();

    @FXML
    private TableView<mascota> mascotaTable;
    @FXML
    private TableColumn<mascota, String> nombreCol;
    @FXML
    private TableColumn<mascota, String> dueñoCol;
    @FXML
    private TableColumn<mascota, String> claseCol;
    @FXML
    private TableColumn<mascota, String> isbnCol;

    public void initialize(){
        nombreCol.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        dueñoCol.setCellValueFactory(new PropertyValueFactory<>("dueño"));
        claseCol.setCellValueFactory(new PropertyValueFactory<>("clase"));
        isbnCol.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        cargarMascota();

        mascotaOL.setAll(mascotaList);
        mascotaTable.setItems(mascotaOL);
         

    }
     private void cargarMascota() {
        String directoryPath = "src\\main\\resources\\com\\usta\\data";
        String filePath = directoryPath+ File.separator + "mascota.txt";
        File file = new File(filePath);

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    if (parts.length == 4) {
                        mascota = new mascota(parts[0], parts[1], parts[2], parts[3]);
                        mascotaList.add(mascota);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se ha encontrado ese registro " + filePath);
        }
    }

    @FXML
    private void switchToAgregar() throws IOException {
        App.setRoot("agregar");
    }
    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("menu");
    }
    @FXML
    private void switchToEditar() throws IOException {
        App.setRoot("editar");
    }
    @FXML
    private void switchToEliminar() throws IOException {
        App.setRoot("eliminar");
    }
}