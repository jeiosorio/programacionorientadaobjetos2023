package com.example.demo.ciberseguridad;

import javafx.scene.layout.Pane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class mysqlconnection {

    private ConexionBD conexionBD;

    public void perosonaDAO(ConexionBD conexionBD){
        this.conexionBD = conexionBD;
    }
    public void guardar(persona p) throws SQLException{

        String sql = null;
        if (!p.getCedula().equals("")){
            sql = "INSERT INTO public persona\n" +" cedula, nombre, area, correo)\n"
                    +"VALUES ('"+p.getCedula()+"' , '"+p.getNombre()+"' , '"+p.getArea()+"', '"+p.getCorreoElectronico();
        }
        PreparedStatement pst;
    }

    private class ConexionBD {
    }
}
