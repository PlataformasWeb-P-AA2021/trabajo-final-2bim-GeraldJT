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
public class PlanPPMegas extends PlanCelular {
 
    private double gigas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPPMegas(Persona c, String mC, String moC, int nC,
            double g, double cG, double tB) {
        super(c, mC, moC, nC);
        gigas = g;
        costoGigas = cG;
        tarifaBase = tB;
    }

    public double getGigas() {
        return gigas;
    }

    public void setGigas(double gigas) {
        this.gigas = gigas;
    }

    public double getCostoGigas() {
        return costoGigas;
    }

    public void setCostoGigas(double costoGigas) {
        this.costoGigas = costoGigas;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    @Override
    public void calcularPagoMensual() {
        pagoMensual = ((gigas * costoGigas) + tarifaBase);
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nMegas expresado en gigas: %.2f\n"
                + "Costo por cada gigas: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Pago Mensual: %.2f\n", super.toString(),
                gigas,
                costoGigas,
                tarifaBase,
                pagoMensual);
        return cadena;
    }

}