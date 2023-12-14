package com.example.demo;

import com.example.demo.ciberseguridad.amenaza;
import com.example.demo.ciberseguridad.persona;
import com.example.demo.ciberseguridad.usuario;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.*;
public class HelloController implements Initializable {
    @FXML private AnchorPane usuario2;
    @FXML private AnchorPane usuario1;
    @FXML private ImageView flecha;
    @FXML private ComboBox<String> comboboxid;
    @FXML private AnchorPane loginpanel;
    @FXML private TextField userlogin;
    @FXML private PasswordField contralogin;
    @FXML private Button ingresarboton;
    @FXML private TextField icorrecta;
    ObservableList<String> comboIdcontent =
            FXCollections.observableArrayList(
                    "C.C", "C.E", "T.ID"
            );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboboxid.setItems(comboIdcontent);
    }
    public void salirdelprogramaImagenExit(MouseEvent event) {
        Platform.exit();
        System.exit(0);
    }
    public void panel1(ActionEvent event) {
        usuario1.setVisible(true);
        usuario2.setVisible(true);
        flecha.setVisible(true);
        icorrecta.getText();
        panel1false.getText();
    }
    public void Ingresar(ActionEvent event) {
        String usuario = userlogin.getText();
        String contraseña = contralogin.getText();

        if (usuario.equals("jeison") && contraseña.equals("admin123")) {
            usuario1.setVisible(true);
            usuario2.setVisible(true);
            flecha.setVisible(true);
        } else {
            icorrecta.setVisible(true);
        }
    }
    @FXML private AnchorPane panel2;
    @FXML private TextField txtnombre;
    @FXML private TextField txtcedula;
    @FXML private TextField txtarea;
    @FXML private TextField txtcorreo;
    @FXML private Label panel1false;
    @FXML private Button escanear;
    public void escanear(ActionEvent event) {
        String nombre = txtnombre.getText();
        String cedula = txtcedula.getText();
        String area = txtarea.getText();
        String correo = txtcorreo.getText();

        persona usuario = new persona(nombre, cedula, area, correo);

        usuario.setNombre(txtnombre.getText());
        usuario.setCedula(txtcedula.getText());
        usuario.setArea(txtarea.getText());
        usuario.setCorreoElectronico(txtcorreo.getText());

        if (nombre.equals("0") && cedula.equals("0") && area.equals("0") && correo.equals("0")){
            panel2.setVisible(true);
        } else {
            panel1false.setVisible(true);
        }
    }
    @FXML private Button buscar;
    @FXML private Button reportar;
    @FXML private Button consultar;
    @FXML private TextField id;
    @FXML private TextField virus;
    @FXML private TextArea descripcion;
    @FXML private TextField afectados;
    @FXML private ImageView ransower;
    public void buscar(MouseEvent event) {
        String idamenaza = id.getText();
        String nombreamenaza = virus.getText();
        String descripcionamenaza = descripcion.getText();
        String numeroAtaque =(afectados.getText());

        amenaza amenaza = new amenaza(idamenaza, nombreamenaza, descripcionamenaza, numeroAtaque);

        amenaza.setIdamenza(idamenaza);
        amenaza.setIdamenza(nombreamenaza);
        amenaza.setDescripcionamenaza(descripcionamenaza);
        amenaza.setNumeroAtaque(numeroAtaque);

        id.setVisible(true);
        virus.setVisible(true);
        descripcion.setVisible(true);
        afectados.setVisible(true);
        ransower.setVisible(true);
        }
        @FXML private AnchorPane panel3;
        @FXML private Button volver;
        public void reportaramenaza(ActionEvent event){
                panel3.setVisible(true);
        }
        public void volverpanel2(ActionEvent event){
            panel2.setVisible(true);
        }
}












