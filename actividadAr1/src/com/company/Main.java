package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileWriter fw;
        PrintWriter pw;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nom = sc.next();
        System.out.println("Ingrese su apellido:");
        String ape = sc.next();
        System.out.println("Ingrese su ciudad:");
        String ciudad = sc.next();
        Double[] arr1 = new Double[5];
        String[][] ma1 = new String[6][6];
        int i,j;
        System.out.println("Ingrese distancias en metros");
        for (i = 0;i<(arr1.length);i++){
            System.out.println("Su distancia No"+(i+1)+":");
            arr1[i] = sc.nextDouble();
        }
        System.out.println("Llene la tabla 6x6 de animales");
        for(i=0;i<6;i++){
            for(j = 0;j<6;j++){
                System.out.println("Ingrese un animal para la posicion "+i+","+j+":");
                ma1[i][j] = sc.next();
            }
        }
        try{
            fw = new FileWriter("C:\\Users\\USUARIO\\Desktop\\Intecap\\archivosEjem\\Actiejemplo.txt");
            pw = new PrintWriter(fw);

            pw.println("Nombre: "+nom+", Apellido: "+ape+", Ciudad: "+ciudad);
            pw.println("Numeros: ");
            for(i = 0; i<=100;i++){
                pw.println(i);
            }
            pw.println("Arreglo: ");
            for(Double  a: arr1){
                pw.print(a+", ");
            }
            pw.println();
            pw.println("Matriz: ");
            for(i=0;i<6;i++){
                for(j = 0;j<6;j++){
                    pw.print(ma1[i][j]+" ");
                }
                pw.println();
            }
            fw.close();

        }catch (Exception e){
            System.err.println("Mensaje: "+e.getMessage());
        }


        File f;
        FileReader fr;
        BufferedReader br;
        try{
            f = new File("C:\\Users\\USUARIO\\Desktop\\Intecap\\archivosEjem\\Actiejemplo.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String lineas;
            while((lineas = br.readLine()) != null){
                System.out.println(lineas);
            }

        }catch (Exception e){
            System.err.println("Mensaje: "+e.getMessage());
        }
    }
}
