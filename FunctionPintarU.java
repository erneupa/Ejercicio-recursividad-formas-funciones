package org.example;

import java.util.Scanner;

public class FunctionPintarU {
    public static void PintarU(){
        Scanner escaner=new Scanner(System.in);

        System.out.println("Escribe la longitud de la 'U': ");
        int longitud= escaner.nextInt();

        String[][] matriz= new String[longitud][longitud];
        for (int fila=0;fila<matriz.length;fila++){
            for (int columna=0;columna<matriz[fila].length;columna++){
                if (columna==0&&fila!=longitud-1||columna==longitud-1&&fila!=longitud-1||fila==longitud-1&&columna>0&&columna<longitud-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
