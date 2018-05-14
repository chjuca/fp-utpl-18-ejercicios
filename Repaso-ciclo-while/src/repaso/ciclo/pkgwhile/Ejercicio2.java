/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.ciclo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String marca;
        String orig;
        double costo;
        int contador = 1;
        int ar = 0;
        int col = 0;
        int ch = 0;
        int otro = 0;
        double imp;
        double impT = 0;
        double precioT = 0;
        double precioV;
        System.out.println("Ingrese el numero de Autos Importados:");
        num = entrada.nextInt();
        String Cadena = String.format("%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");
        while (contador<=num) {
            entrada.nextLine();
            System.out.printf("***\t Vehículo %d \t***\n",contador);
            System.out.println("Ingrese la Marca del Vehículo:");
            marca = entrada.nextLine();
            System.out.println("Ingrese el pais de origen del Vehículo:");
            orig = entrada.nextLine();
            System.out.println("Ingrese el costo del Vehículo");
            costo = entrada.nextDouble();
            System.out.println("--------------------------------");
            if (orig.equals("Argentina")) {
                ar = ar + 1;
                imp = costo * 0.2;
            } else {
                if (orig.equals("Colombia")) {
                    col = col + 1;
                    imp = costo * 0.25;
                } else {
                    if (orig.equals("Chile")) {
                        ch = ch + 1;
                        imp = costo * 0.3;
                    } else {
                        otro = otro + 1;
                        imp = costo * 0.4;
                    }
                }
            }
            precioV = costo + imp;
            impT = impT + imp;
            precioT = precioT + precioV;
            Cadena = String.format("%s%-9s\t\t%-9s\t\t%5.0f\t\t\t%5.0f\t\t\t%5.0f\n", Cadena, marca, orig, costo, imp, precioV);
            contador += 1;
        }
        System.out.println("\tReporte de Autos Importados");
        System.out.printf("%s", Cadena);
        System.out.printf("\nTotal Autos\t%d\tTot.Imp %.2f\tTot.PV %.2f\n", contador-1, impT, precioT);
        System.out.printf("\nArgentina\t%d\n", ar);
        System.out.printf("Chile    \t%d\n", ch);
        System.out.printf("Colombia\t%d\n",col);
        System.out.printf("Resto de paises\t%d\n", otro);
    }
}
