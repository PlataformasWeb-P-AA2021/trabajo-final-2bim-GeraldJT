/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author macbookair
 */
public class PlanPPMinutosMeEcono extends PlanCelular {

    private double minutos;
    private double costoMinutos;
    private double gigas;
    private double costoGigas;
    private double porcentajeDescuento;

    public PlanPPMinutosMeEcono(Persona c, String mC, String moC,
            int nC, double m, double cM, double g, double cG, double pD) {
        super(c, mC, moC, nC);
        minutos = m;
        costoMinutos = cM;
        gigas = g;
        costoGigas = cG;
        porcentajeDescuento = pD;
    }

    public void setMinutos(double n) {
        minutos = n;
    }

    public void setCostoMinutos(double n) {
        costoMinutos = n;
    }

    public void setGigas(double n) {
        gigas = n;
    }

    public void setCostoGigas(double n) {
        costoGigas = n;
    }

    public void setPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    public double getMinutos() {
        return minutos;
    }

    public double getCostoMinutos() {
        return costoMinutos;
    }

    public double getGigas() {
        return gigas;
    }

    public double getCostoGigas() {
        return costoGigas;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = ((minutos * costoMinutos) + (gigas * costoGigas)
                * (porcentajeDescuento / 100));
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("%s\nMinutos: %.2f\n"
                + "Costo por minutos: %.2f\n"
                + "Megas expresado en gigas: %.2f\n"
                + "Costo por cada gigas: %.2f\n"
                + "Porcentaje de descuento: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                minutos,
                costoMinutos,
                gigas,
                costoGigas,
                porcentajeDescuento,
                pagoMensual);
        return cadena;
    }
}
