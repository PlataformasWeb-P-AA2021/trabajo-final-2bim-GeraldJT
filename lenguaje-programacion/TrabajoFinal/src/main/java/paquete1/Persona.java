/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.io.Serializable;

/**
 *
 * @author macbookair
 */
public class Persona implements Serializable{

    private String nombres;
    private String apellidos;
    private String identificacion;
    private String ciudad;

    public Persona(String n, String a, String i, String c) {
        nombres = n;
        apellidos = a;
        identificacion = i;
        ciudad = c;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

   
}
