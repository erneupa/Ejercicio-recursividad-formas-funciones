package org.example;

import java.util.Scanner;

public class FunctionPintarArbol {
    public static void PintarArbol(){
        Scanner escaner=new Scanner(System.in);

        System.out.println("Escribe la longitud (debe de ser un número mayor o igual a 4): ");
        int longitud= escaner.nextInt();

        while (longitud<4){
            System.out.println("Error, escribe un caracter válido");
            longitud= escaner.nextInt();
        }

        int ancho=1;
        for (int i=1;i<longitud-2;i++){
            ancho=ancho+2;
        }

        String[][] matriz=new String[longitud][ancho];

        for (int fila=0; fila< matriz.length;fila++){
            for (int columna=0; columna<matriz[fila].length;columna++){
                if (fila==0&&columna==ancho/2){
                    System.out.print("* ");
                } else if (fila==longitud-1&&columna==ancho/2) {
                    System.out.print("Y ");

                } else if ((fila>0&&fila<longitud-1)&&(columna==((ancho-1)/2)+fila-1|| fila+columna-1+(ancho/2)==ancho-1|| fila==longitud-2)) {
                    System.out.print("^");

                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
