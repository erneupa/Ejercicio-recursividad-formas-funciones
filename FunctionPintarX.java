package org.example;

import java.util.Scanner;

public class FunctionPintarX {
    public static void PintarX(){
        Scanner escaner=new Scanner(System.in);

        System.out.println("Escribe la longitud que quieres que tenga la 'X': ");
        int longitud= escaner.nextInt();
        String[][] matriz=new String[longitud][longitud];
        for (int fila=0;fila<matriz.length;fila++){
            for (int columna=0;columna<matriz[fila].length;columna++){
                if (fila==columna||fila+columna==longitud-1){
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
