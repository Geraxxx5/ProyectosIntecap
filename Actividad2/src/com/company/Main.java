package com.company;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int filas, colum, i, j, sumaFil = 0, sumaCol = 0, colum1, filas1, menu;
        int[][] m1;
        JOptionPane.showMessageDialog(null, "Bienvenido al programa");
        boolean bandera = true;
        while(bandera){
            System.out.println("Bienvenido al programa");
            System.out.println("Para ingresar a algun programa escoja una opcion");
            System.out.println("1. Suma de las filas y columnas de una matriz ingresada por el usuario");
            System.out.println("2. Ingresar la dimensional de dos matrices junto con sus datos y se sumara");
            System.out.println("0. salir");
            System.out.println("Que opcion desea: ");
            menu = sc.nextInt();
            switch (menu){
                case 1:

                    System.out.println("Ingrese el tamaño de las filas y columnas de la matriz");
                    System.out.println("Ingrese el tamaño de las filas");
                    filas = sc.nextInt();
                    System.out.println("Ingrese el tamaño de las columnas");
                    colum = sc.nextInt();
                    m1 = new int[filas][colum];
                    for(i = 0;i<filas;i++){
                        for(j=0;j<colum;j++){
                            System.out.println("Ingrese un valor en la posicion: "+i+", "+j);
                            m1[i][j] = sc.nextInt();
                        }
                    }
                    sumaFil = 0;
                    for(i = 0;i<filas;i++){
                        for(j=0;j<colum;j++){
                            System.out.print((m1[i][j])+" ");
                            sumaFil+= m1[i][j];
                        }
                        System.out.println("");
                    }
                    sumaCol = 0;
                    for(i = 0;i<colum;i++){
                        for(j=0;j<filas;j++){
                            sumaCol+= m1[j][i];
                        }
                    }
                    JOptionPane.showMessageDialog(null,"La suma de valores de las filas es de: "+sumaFil+
                            "\nLa suma de valores de las columnas es de: "+sumaCol);
                    System.out.println("suma Columna: "+ sumaCol);
                    System.out.println("suma Fila: "+ sumaFil);
                    break;
                case 2:
                    System.out.println("Suma de matrices");
                    System.out.println("Ingrese el tamaño de las filas y columnas de las dos matrices");
                    System.out.println("Ingrese el tamaño de las filas");
                    filas = sc.nextInt();
                    System.out.println("Ingrese el tamaño de las columnas");
                    colum = sc.nextInt();
                    if(filas == colum){
                        m1 = new int[filas][colum];
                        for(i = 0;i<filas;i++) {
                            for (j = 0; j < colum; j++) {
                                System.out.println("Ingrese un valor de la matriz 1 en la posicion: " + i + ", " + j);
                                m1[i][j] = sc.nextInt();
                            }
                        }
                        int[][] m2 = new int[filas][colum];
                        for(i = 0;i<filas;i++) {
                            for (j = 0; j < colum; j++) {
                                System.out.println("Ingrese un valor de la matriz 2 en la posicion: " + i + ", " + j);
                                m2[i][j] = sc.nextInt();
                            }
                        }
                        int[][] m3 = new int[filas][colum];
                        for(i = 0;i<filas;i++) {
                            for (j = 0; j < colum; j++) {
                                m3[i][j] = m1[i][j]+m2[i][j];
                            }
                        }
                        //Mostrar resultados
                        System.out.println("matriz 1: ");
                        for(i = 0;i<filas;i++) {
                            for (j = 0; j < colum; j++) {
                                System.out.print((m1[i][j])+" ");
                            }
                            System.out.println("");
                        }
                        System.out.println("Matriz 2: ");
                        for(i = 0;i<filas;i++) {
                            for (j = 0; j < colum; j++) {
                                System.out.print((m2[i][j])+" ");
                            }
                            System.out.println("");
                        }
                        System.out.println("Matriz resultante: ");
                        for(i = 0;i<filas;i++) {
                            for (j = 0; j < colum; j++) {
                                System.out.print((m3[i][j])+" ");
                            }
                            System.out.println("");
                        }
                    }else{
                        System.out.println("Error ingrese las matrices solo pueden ser cuadradas");
                    }
                    break;
                case 0:
                    bandera = false;
                    System.out.println("Finalizo el programa");
                    break;
                default:
                    System.out.println("Ingrese un opcion correcta");
            }
        }
    }
}
