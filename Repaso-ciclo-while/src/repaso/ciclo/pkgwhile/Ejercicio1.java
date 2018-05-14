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
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nom;
        String NomArt;
        int cant;
        double precioU;
        double precioT;
        double sub=0;
        double total;
        int contador = 1;
        boolean bandera = true;
        String Cadena = String.format("%s\t%s\t%s\t%s\n", "Artículo","Cantidad","Precio Unit","Precio Total");
        System.out.println("Ingrese el nombre del cliente:");
        nom = entrada.nextLine();
        while (bandera) {
            System.out.printf("***\tARTICULO #%d\t***\n", contador);
            System.out.println("---------------------------");
            System.out.printf("Ingrese el nombre del artículo: %d:", contador);
            NomArt = entrada.nextLine();                      
            System.out.printf("Ingrese el cantidad de los artículo: %d:", contador);
            cant = entrada.nextInt();
            System.out.printf("Ingrese el Precio Unitario del artículo: %d:", contador);
            precioU = entrada.nextDouble();
            System.out.println("---------------------------\n");
            System.out.printf("***\tFIN ARTICULO #%d\t***", contador);

            entrada.nextLine();
            System.out.println("\n¿Salir de Ingresar Artículos(S/N):?");
            String opc = entrada.nextLine();
            if (opc.equals("S")) {
                bandera = false;
            }
            precioT=cant*precioU;
            sub=sub+precioT;
            Cadena = String.format("%s%-11s\t%d\t\t%.1f\t\t%.1f\n", Cadena,NomArt,cant,precioU,precioT);
            contador=contador+1;
        }
        double imp=(sub*14)/100;
        total=sub+imp;
        
        System.out.println("\t\tFactura");
        System.out.println("Supermercado Todo a Menor Precio");
        System.out.printf("Nombre del Cliente: %s\n\n",nom);
        System.out.printf("%s",Cadena);
        System.out.printf("\t\t\t\tSubtotal\t%.2f\n",sub);
        System.out.printf("\t\t\t\tIVA 14\t\t%.2f\n",imp);
        System.out.printf("\t\t\t\tTotal\t\t%.2f\n",total);

    }
}
