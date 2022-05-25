package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileWriter fw;

        PrintWriter pw;
        try {
            fw = new FileWriter("C:\\Users\\USUARIO\\Desktop\\Intecap\\archivosEjem\\Ejemplo.txt");
            pw = new PrintWriter(fw);

            pw.println("Esto es una prueba de escritura");
            for(int i = 0;i<=30;i++){
                pw.println("Linea "+i);
            }
            fw.close();

        }catch (Exception e){
            System.err.println("Error en el archivo: "+e);
        }

        File f;
        FileReader fr;
        BufferedReader br;
        //C:\Users\USUARIO\Desktop\Ejemplo.txt
        try{
            f = new File("C:\\Users\\USUARIO\\Desktop\\Intecap\\archivosEjem\\Ejemplo.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String lineas;
            while((lineas = br.readLine()) != null){
                System.out.println(lineas);
            }


        }catch (Exception e){
            System.err.println("mensaje: "+e.getMessage());
        }
    }
}
