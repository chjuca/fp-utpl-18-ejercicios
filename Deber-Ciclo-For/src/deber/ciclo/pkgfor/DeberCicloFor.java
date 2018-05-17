/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber.ciclo.pkgfor;

import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class DeberCicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String est;
        int sumaE=0;
        double edadT=0;
        int edad;
        int asig;
        String mat;
        int bim1;
        int bim2;
        double suma;
        double pro = 0;
        double prom = 0;
        double sumprom=0;
        double promest=0;
        int lim;
        String cadena = String.format("%s\n", "REPORTE DE CALIFICACIONES DE ESTUDIANTES");
        System.out.println("Ingrese el Numero de Estudiantes que va a Ingresar: ");
        lim = entrada.nextInt();
        for (int i = 1; i <= lim; i++) {
            pro = 0;
            suma=0;
            System.out.printf("~~~\tINGRESO DE DATOS ESTUDIANTE #%d\t~~~\n", i);
            entrada.nextLine();
            System.out.printf("Ingrese el Nombre del Estudiante %d: ", i);
            est = entrada.nextLine();
            System.out.printf("Ingrese la Edad del Estudiante %d: ", i);
            edad = entrada.nextInt();
            System.out.printf("Ingrese el Numero de Asignaturas %d: ", i);
            asig = entrada.nextInt();
            System.out.println("\n-----------------------------------------------------\n");
            cadena = String.format("%sNombre del Estudiante: %s\nEdad: %d\nNumero de Asignaturas: %d\n\n%s\n%s\t\t%s\t\t%s\t\t%s\n", cadena, est, edad, asig, "REPORTE DE NOTAS", "Materia", "Bim-1", "Bim-2", "Promedio");
            for (int j = 1; j <= asig; j++) {
                System.out.printf("***\tREGISTRO DE MATERIAS DEL ESTUDIANTE #%d\t***\n", i);
                entrada.nextLine();
                System.out.printf("Ingrese el Nombre de la Asignatura: ", j);
                mat = entrada.nextLine();
                System.out.printf("Ingrese la Nota del 1° Bimestre: ", j);
                bim1 = entrada.nextInt();
                System.out.printf("Ingrese la Nota del 2° Bimestre: ", j);
                bim2 = entrada.nextInt();
                System.out.println("\n-----------------------------------------------------\n");
                pro = (bim1 + bim2) / 2;
                cadena = String.format("%s%6.6s.\t\t%d\t\t%d\t\t%.2f\n", cadena, mat, bim1, bim2, pro);
                suma = suma + pro;
            }
            prom = suma / asig;
            cadena = String.format("%s\t\t\t\t%s\t%.2f\n", cadena, "Promedio:", prom);
            if (prom >= 19) {
                cadena = String.format("%s%s%s", cadena, est, " Tiene un promedio de SOBRESALIENTE\n\n");
            } else {
                if (prom >= 16 && prom < 19) {
                    cadena = String.format("%s%s%s", cadena, est, " Tiene un promedio de MUY BUENO\n\n");
                } else {
                    if (prom >= 13 && prom < 16) {
                        cadena = String.format("%s%s%s", cadena, est, " Tiene un promedio de BUENO\n\n");
                    } else {
                        cadena = String.format("%s%s%s", cadena, est, " Tiene un promedio de REGULAR\n\n");
                    }
                }
            }
            sumprom=sumprom+prom;
            sumaE=sumaE+edad;
            edadT=sumaE/lim;
        }
        promest=sumprom/lim;
        System.out.printf("%s", cadena);
        System.out.println("\n\nINFORMACION GLOBAL DE LOS ESTUDIANTES: ");
        System.out.printf("Promedio de Edad es: %.2f \n",edadT);
        System.out.printf("Promedio de Notas de los Estudiante: %.2f\n", promest);
        
    }

}
