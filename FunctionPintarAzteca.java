package org.example;

import java.util.Scanner;

public class FunctionPintarAzteca {
    public static void PintarAzteca(){
        Scanner escaner=new Scanner(System.in);

        System.out.println("Escribe la longitud (debe de ser un número mayor o igual a 4): ");
        int longitud= escaner.nextInt();

        while (longitud<3){
            System.out.println("Error, escribe un caracter válido");
            longitud= escaner.nextInt();
        }

        int ancho=0;
        if (longitud==3){
            ancho=10;
        }
        else{
            ancho=(longitud-3)*2+10;
        }

        String[][] matriz=new String[longitud][ancho];
        int contador=longitud-2;
        int contadorFila=0;
        for (int fila=0;fila<matriz.length;fila++){

            for (int columna=0;columna<matriz[fila].length;columna++){

                if ((columna>contador)&&(fila % 2 == 0 || columna < longitud||columna >ancho-longitud-1)){
                    System.out.print("*");


                }
                else{
                    System.out.print("-");
                }

            }

            contador--;
            System.out.println();
        }
    }
}
