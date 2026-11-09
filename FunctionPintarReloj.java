package org.example;

import java.util.Scanner;

public class FunctionPintarReloj {
    public static void PintarReloj(){
        Scanner escaner=new Scanner(System.in);

        System.out.println("Escribe la longitud (debe ser un número inpar mayor o igual a 3): ");
        int longitud= escaner.nextInt();


        while (longitud<3||longitud%2==0){

            System.out.println("Error, escribe un carácter válido");
            longitud= escaner.nextInt();
        }

        String[][] matriz=new String[longitud][longitud];

        for (int fila=0;fila<matriz.length;fila++){
            for (int columna=0;columna<matriz[fila].length;columna++){
                if (fila==0||fila==longitud-1||columna>=fila&&columna<=longitud-1-fila || columna<=fila&&columna>=longitud-1-fila){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
