package org.example;

import java.util.Scanner;

public class FunctionPintarTriangulo {
    public static void PintarTriangulo(){
        Scanner escaner=new Scanner(System.in);

        System.out.println("Escribe la longitud del triángulo: ");
        int longitud= escaner.nextInt();

        String[][] matriz=new String[longitud][longitud];

        for (int fila=0;fila<matriz.length;fila++){
            for (int columna=0;columna<matriz[fila].length;columna++){
                if (fila==0||columna==0||columna==longitud-1-fila){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println("  ");

        for (int fila=0;fila<matriz.length;fila++){
            for (int columna=0;columna<matriz[fila].length;columna++){
                if (fila<=longitud-1&&columna<=longitud-1-fila){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
