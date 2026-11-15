package org.example;

import java.util.Scanner;

public class FunctionPintarV {
    public static void PintarV(){
        Scanner escaner=new Scanner(System.in);

        System.out.println("Escribe la longitud (debe de ser un número mayor o igual a 3): ");
        int longitud= escaner.nextInt();

        while (longitud<3){
            System.out.println("Error, escribe un caracter válido");
            longitud= escaner.nextInt();
        }
        int ancho=(3+longitud-1)*2-1;

        String[][] matriz=new String[longitud][ancho];

        for (int fila=0;fila<matriz.length;fila++){
            for (int columna=0;columna<matriz[fila].length;columna++){
                if (fila==columna||fila+1==columna||fila+2==columna||fila+columna==ancho-1||fila+columna==ancho-2||fila+columna==ancho-3){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
