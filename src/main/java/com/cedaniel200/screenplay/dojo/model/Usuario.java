package com.cedaniel200.screenplay.dojo.model;

public class Usuario {

    private final String usuario;
    private final String contraseña;

    public Usuario(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getContraseña() {
        return this.contraseña;
    }
}
