/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        String nombre;
        int calificacion;

        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre =entrada.nextLine();
        System.out.println("Ingrese la calificación :");
        calificacion= entrada.nextInt();
        
        if (calificacion >= 90) {
            System.out.printf("ESTUDIANTE: %s\n\tAprobado (excelente)\nCon calificación \n\t%d\n",nombre.toUpperCase(),calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("ESTUDIANTE:%s\n\tAprobado (muy buena)\nCon calificación \n\t%d\n",nombre.toUpperCase(),calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("ESTUDIANTE: %s\n\tAprobado (regular)\nCon calificación \n\t%d\n",nombre.toUpperCase(),calificacion);

                } else {
                    System.out.printf("ESTUDIANTE: %s\n\tReprobado\nCon calificación \n\t%d\n",nombre.toUpperCase(), calificacion);
                }
            }
        }
        
    }
}
