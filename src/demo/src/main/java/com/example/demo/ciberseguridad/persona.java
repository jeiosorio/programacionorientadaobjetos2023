package com.example.demo.ciberseguridad;

import com.example.demo.HelloController;

public class persona extends HelloController {

    private String cedula;
    private String correoElectronico;
    private String nombre;
    private String area;

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public persona(String cedula, String correoElectronico, String nombre, String area) {
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.area = area;
    }
}
