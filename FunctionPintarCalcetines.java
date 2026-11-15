package org.example;

import java.util.Scanner;

public class FunctionPintarCalcetines {
    public static void PintarCalcetines(){
        Scanner escaner=new Scanner(System.in);

        System.out.println("Escribe la longitud (debe de ser un número mayor o igual a 4): ");
        int longitud= escaner.nextInt();

        while (longitud<4){
            System.out.println("Error, escribe un caracter válido");
            longitud= escaner.nextInt();
        }

        String[][] matriz=new String[longitud][14];

        for (int fila=0;fila< matriz.length;fila++){
            for (int columna=0;columna<matriz[fila].length;columna++){
                if (fila>longitud-3&&(columna<6||columna>7)||columna<3||columna>7&&columna<11) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }



            }
            System.out.println();
        }
    }
}
