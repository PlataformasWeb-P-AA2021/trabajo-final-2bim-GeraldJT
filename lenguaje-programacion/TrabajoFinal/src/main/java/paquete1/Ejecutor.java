/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.EscrituraArchivoSecuencial;
import paquete2.LecturaArchivoSecuencial;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<PlanCelular> plan = new ArrayList<>();
        String n = "planes.data";
        String nombre = "";
        String apellidos = "";
        String identificacion = "";
        String ciudad = "";
        String marcaCelular = "";
        String modeloCelular = "";
        int numeroCelular = 0;
        int bandera = 0;
        while (bandera != 5) {
            System.out.println("Ingrese el plan que desea:\n"
                    + "1. Plan postPago minutos\n"
                    + "2. Plan postPago megas\n"
                    + "3. Plan postPago minutos megas\n"
                    + "4. Plan postPago minutos megas economico\n"
                    + "5. Salir");
            bandera = entrada.nextInt();
            if (bandera >= 1 && bandera <= 4) {
                entrada.nextLine();
                System.out.println("Ingrese los nombres del cliente: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese los apellidos del cliente: ");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese su identificación: ");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese la ciudad en la que reside: ");
                ciudad = entrada.nextLine();
                System.out.println("Ingrese la marca del celular: ");
                marcaCelular = entrada.nextLine();
                System.out.println("Ingrese el modelo del celular: ");
                modeloCelular = entrada.nextLine();
                System.out.println("Ingrese el número del celular: ");
                numeroCelular = entrada.nextInt();
            }
            Persona p = new Persona(nombre, apellidos, identificacion, ciudad);
            switch (bandera) {
                case 1:
                   System.out.println("Ingrese los minutos nacionales");
                   double minutosNacionales = entrada.nextDouble();
                   System.out.println("Ingrese el costo por minuto nacional");
                   double costoMinutosNacionales = entrada.nextDouble();
                   System.out.println("Ingrese los minutos internacionales");
                   double minutosInternacionales = entrada.nextDouble();
                   System.out.println("Ingrese el costo por minuto internacional");
                   double costoMinutosInternacionales = entrada.nextDouble();

                   PlanPPMinutos planpagoMinutos = new PlanPPMinutos(p,
                   marcaCelular, modeloCelular, numeroCelular, minutosNacionales,
                   costoMinutosNacionales, minutosInternacionales,
                   costoMinutosInternacionales);
                   plan.add(planpagoMinutos);

                    break;

                case 2:
                    System.out.println("Ingrese las megas expresado en gigas");
                    double gigas = entrada.nextDouble();
                    System.out.println("Ingrese el costo por cada gigas");
                    double costoGigas = entrada.nextDouble();
                    System.out.println("Ingrese la tarifa base");
                    double tarifaBase = entrada.nextDouble();

                    PlanPPMegas planpagomegas = new PlanPPMegas(p, marcaCelular,
                    modeloCelular, numeroCelular, gigas, costoGigas, tarifaBase);

                    plan.add(planpagomegas);
                    break;

                case 3:
                     System.out.println("Ingrese los minutos ");
                    double minutos = entrada.nextDouble();
                    System.out.println("Ingrese el costo por minutos");
                    double costoMinutos = entrada.nextDouble();
                    System.out.println("Ingrese las megas expresado en gigas");
                    double gigas1 = entrada.nextDouble();
                    System.out.println("Ingrese el costo por cada gigas");
                    double costoGigas1 = entrada.nextDouble();

                    PlanPPMinutosMe planminutosmegas = new PlanPPMinutosMe(p,
                    marcaCelular, modeloCelular, numeroCelular, minutos, costoMinutos,
                    gigas1, costoGigas1);

                    plan.add(planminutosmegas);
                    break;

                case 4:
                    
                    System.out.println("Ingrese los minutos: ");
                    double minutos1 = entrada.nextDouble();
                    System.out.println("Ingrese el costo por minutos: ");
                    double costoMinutos1 = entrada.nextDouble();
                    System.out.println("Ingrese las megas expresado en gigas: ");
                    double gigas2 = entrada.nextDouble();
                    System.out.println("Ingrese el costo por cada gigas: ");
                    double costoGigas2 = entrada.nextDouble();
                    System.out.println("Ingrese el porcentaje de descuento: ");
                    double porcentajeDescuento = entrada.nextDouble();

                    PlanPPMinutosMeEcono planmegaseconomico = 
                    new PlanPPMinutosMeEcono(p, marcaCelular, modeloCelular,
                    numeroCelular, minutos1, costoMinutos1, gigas2, costoGigas2,
                    porcentajeDescuento);

                    plan.add(planmegaseconomico);
                    break;

                case 5:
                    bandera = 5;
                    break;
            }
        }

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(n);

        for (int i = 0; i < plan.size(); i++) {
            plan.get(i).calcularPagoMensual(); 
            archivo.establecerRegistro(plan.get(i));
            archivo.establecerSalida();

        }
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(n);
        lectura.establecerPlanCelular();

        System.out.println(lectura);
        lectura.cerrarArchivo();

    }
}
