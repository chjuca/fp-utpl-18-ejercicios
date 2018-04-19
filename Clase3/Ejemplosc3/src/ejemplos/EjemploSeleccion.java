/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Crear un programa que permita ingresar una calificacion por teclado
si la calificacion ingresadaes mayor o igual 5 y la calificacion es menor a 10, se debe presentar un mensaje que diga "Usted esta en supletorio"
De lo contrario se presenta un mensaje con el valor de calificacion dividido para dos
 */
package ejemplos;

import java.util.Scanner;

public class EjemploSeleccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese su calificación:");
        calificacion = entrada.nextDouble();

        if (calificacion >= 5 && calificacion < 10) {
            // python se usa "and"
            System.out.printf("Usted esta en supletorio\n");
        } else {
            System.out.printf("%f\n", calificacion / 2);
        }

    }

}
