package com.company;

import java.util.*;

public class Matrices {

    public int i,j,n;
    public int[][] ma;
    Scanner sc = new Scanner(System.in);

    public void ejercicio(int a, int b){
        ma = new int[a][b];
        System.out.println("Ingrese numeros a la matriz");
        for(i = 0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.println("Inrgese un numero en la posicion: "+i+", "+j);
                try {
                    ma[i][j] = Integer.parseInt(sc.next());
                }catch (NumberFormatException c){
                    System.err.println("Error "+c);
                    break;
                }
            }
        }

        System.out.println("La matriz que usted ingreso es: ");
        for(i = 0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.print(ma[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
