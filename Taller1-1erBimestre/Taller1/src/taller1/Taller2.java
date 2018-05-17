/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class Taller2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String per;
        String r;
        int padre;
        String nom;
        double sueldo;
        double Spas;
        double Sbar;
        double Ssal;
        double pas;
        double bar;
        double sal;
        double total;
        int lim;
        String cadena = String.format("%s\n", "REPORTE DE GASTOS DE PADRES DE FAMILIA");
        System.out.println("Ingrese el numero de padres que desea ingresar: ");
        padre = entrada.nextInt();
        for (int j = 1; j <= padre; j++) {
            Spas=0;
            Sbar=0;
            Ssal=0;
            System.out.printf("~~~\tINGRESO DE DATOS PADRE #%d\t~~~\n", j);
            entrada.nextLine();
            System.out.printf("Ingrese el Nombre del Padre de Familia %d: ", j);
            nom = entrada.nextLine();
            System.out.printf("Ingrese Sueldo Semanal del Padre %d: ", j);
            sueldo = entrada.nextDouble();
            System.out.printf("Ingrese el Numero de Hijos %d: ", j);
            lim = entrada.nextInt();
            System.out.println("\n-------------------------------------\n");
            cadena = String.format("%sNombre del Padre de Familia: %s\nSueldo Semanal $%.2f\nNumero de Hijos: %d\n\n%s\n%s\t%s\t%s\t%s\n", cadena, nom, sueldo, lim, "REPORTE DE GASTOS", "Persona", "Pasaje", "Bar", "Salidas");
            for (int i = 1; i <= lim; i++) {
                per = "Hijo " + i;
                System.out.printf("***\tREGISTRO DE DATOS HIJO #%d\t***\n", i);
                System.out.printf("Ingrese Pasajes de Hijo %d: ", i);
                pas = entrada.nextDouble();
                System.out.printf("Ingrese Bar de Hijo %d: ", i);
                bar = entrada.nextDouble();
                System.out.printf("Ingrese Salida de Hijo %d: ", i);
                sal = entrada.nextDouble();
                System.out.println("\n-------------------------------------\n");
                cadena = String.format("%s%s\t\t%.2f\t\t%.2f\t\t%.2f\n", cadena, per, pas, bar, sal);
                Spas = Spas + pas;
                Sbar = Sbar + bar;
                Ssal = Ssal+ sal;
            }
            cadena = String.format("%s%s\t\t%.2f\t\t%.2f\t\t%.2f\n", cadena, "Total:", Spas, Sbar, Ssal);
            total = Spas + Sbar + Ssal;
            if (total == 50) {
                cadena = String.format("%s%s%s%s", cadena, "El padre de Familia: ", nom, " le alcanza el dinero\n\n");
            } else {
                if (total < 50) {
                    cadena = String.format("%s%s%s%s", cadena, "El padre de Familia: ", nom, " le sobra el dinero\n\n");
                } else {
                    cadena = String.format("%s%s%s%s", cadena, "El padre de Familia: ", nom, " le falta el dinero\n\n");
                }
            }
        }
        System.out.printf("%s", cadena);
    }
}
