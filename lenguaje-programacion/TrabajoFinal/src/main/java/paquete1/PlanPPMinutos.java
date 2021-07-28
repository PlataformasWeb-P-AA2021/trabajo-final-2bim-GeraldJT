/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.io.Serializable;
import paquete1.Persona;
import paquete1.PlanCelular;

/**
 *
 * @author macbookair
 */
public class PlanPPMinutos extends PlanCelular implements Serializable {

    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPPMinutos(Persona c, String mC, String moC, int nC,
            double mN, double cN, double mI, double cI) {
        super(c, mC, moC, nC);
        minutosNacionales = mN;
        costoMinutoNacional = cN;
        minutosInternacionales = mI;
        costoMinutoInternacional = cI;
    }

    public double getMinutosNacionales() {
        return minutosNacionales;
    }

    public void setMinutosNacionales(double minutosNacionales) {
        this.minutosNacionales = minutosNacionales;
    }

    public double getCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void setCostoMinutoNacional(double costoMinutoNacional) {
        this.costoMinutoNacional = costoMinutoNacional;
    }

    public double getMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void setMinutosInternacionales(double minutosInternacionales) {
        this.minutosInternacionales = minutosInternacionales;
    }

    public double getCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    public void setCostoMinutoInternacional(double costoMinutoInternacional) {
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

   @Override
    public void calcularPagoMensual() {
        pagoMensual = ((minutosNacionales * costoMinutoNacional)
                + (minutosInternacionales * costoMinutoInternacional));
    }


    @Override
    public String toString() {
        String cadena = String.format("%s\nMinutos nacionales: %.2f\n"
                + "Costo por minutos nacionales: %.2f\n"
                + "Minutos internacionales: %.2f\n"
                + "Costo por minutos internacionales: %.2f\n"
                + "Pago Mensual: %.2f\n", super.toString(),
                minutosNacionales,
                costoMinutoNacional,
                minutosInternacionales,
                costoMinutoInternacional,
                pagoMensual);
        return cadena;
    }
}
