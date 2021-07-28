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
public abstract class PlanCelular implements Serializable{
    protected Persona cliente;
    protected String marcaCelular;
    protected String modeloCelular;
    protected int numeroCelular;
    protected double pagoMensual;
    
    public PlanCelular(Persona c, String mC, String moC, int nC){
        cliente = c;
        marcaCelular = mC;
        modeloCelular = moC;
        numeroCelular = nC;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public String getMarcaCelular() {
        return marcaCelular;
    }

    public void setMarcaCelular(String marcaCelular) {
        this.marcaCelular = marcaCelular;
    }

    public String getModeloCelular() {
        return modeloCelular;
    }

    public void setModeloCelular(String modeloCelular) {
        this.modeloCelular = modeloCelular;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public abstract void calcularPagoMensual(); 
       
    
   @Override
    public String toString() {
        String cadena = String.format("\nNombres: %s\nApellidos: %s\n"
                + "Identificación: %s\nCiudad: %s\nMarca celular: %s\n"
                + "Modelo del celular: %s\nNúmero del celular: %d", 
                cliente.getNombres(),
                cliente.getApellidos(),
                cliente.getIdentificacion(),
                cliente.getCiudad(),
                getMarcaCelular(),
                getModeloCelular(),
                getNumeroCelular());
        return cadena;
    }
    
}
