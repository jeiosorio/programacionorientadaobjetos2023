package com.example.demo.ciberseguridad;

import com.example.demo.HelloController;

public class amenaza extends HelloController {


    String idamenza;
    String nombreamenza;
    String descripcionamenaza;
    String numeroAtaque;


    public String getIdamenza() {
        return idamenza;
    }

    public void setIdamenza(String idamenza) {
        this.idamenza = idamenza;
    }

    public String getNombreamenza() {
        return nombreamenza;
    }

    public void setNombreamenza(String nombreamenza) {
        this.nombreamenza = nombreamenza;
    }

    public String getDescripcionamenaza() {
        return descripcionamenaza;
    }

    public void setDescripcionamenaza(String descripcionamenaza) {
        this.descripcionamenaza = descripcionamenaza;
    }

    public String getNumeroAtaque() {
        return numeroAtaque;
    }

    public void setNumeroAtaque(String numeroAtaque) {
        this.numeroAtaque = numeroAtaque;
    }

    public amenaza(String idamenza, String nombreamenza, String descripcionamenaza, String numeroAtaque) {
        this.idamenza = idamenza;
        this.nombreamenza = nombreamenza;
        this.descripcionamenaza = descripcionamenaza;
        this.numeroAtaque = numeroAtaque;
    }
}

