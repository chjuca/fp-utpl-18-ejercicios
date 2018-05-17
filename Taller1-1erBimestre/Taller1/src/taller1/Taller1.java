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
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String per;
        double Spas = 0;
        double Sbar = 0;
        double Ssal = 0;
        double pas;
        double bar;
        double sal;
        double total;
        int lim;
        String cadena = String.format("%s\t\t%s\t\t%s\t\t%s\n", "Persona", "Pasajes", "Bar", "Salidas");
        System.out.println("Ingrese el numero de Hijos que tiene:");
        lim = entrada.nextInt();
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
            Spas = pas + pas;
            Sbar = bar + bar;
            Ssal = sal + sal;
            cadena = String.format("%s%s\t\t%.2f\t\t%.2f\t\t%.2f\n", cadena, per, pas, bar, sal);
        }
        System.out.println("GASTOS FAMILIA\n");
        System.out.printf("%s", cadena);
        System.out.printf("Total:\t\t%.2f\t\t%.2f\t\t%.2f\n", Spas, Sbar, Ssal);
        total = Spas + Sbar + Ssal;
        if (total == 50) {
            System.out.printf("\nLa suma de los gastos es: $%.2f",total);
            System.out.println("\nEl padre de familia termina la semana al limite de dinero");
        } else {
            if (total < 50) {
                System.out.printf("\nLa suma de los gastos es: $%.2f",total);
                System.out.println("\nEl padre de familia le sobra dinero");
            } else {
                System.out.printf("\nLa suma de los gastos es: $%.2f",total);
                System.out.println("\nEl padre de familia le falta dinero");
            }
        }
    }

}
