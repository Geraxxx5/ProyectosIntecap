package com.company;

public class Sexto implements Grados{
    @Override
    public void tablas(int a, int b) {
        System.out.println("Bienvendio las tablas de multiplicar del grado son: ");
        System.out.println("Tabla del: "+a);
        for(int i = 0;i<=10;i++){
            System.out.println(a+" x "+i+" = "+a*i);
        }
        System.out.println("Tabla del: "+b);
        for(int i = 0;i<=10;i++){
            System.out.println(b+" x "+i+" = "+b*i);
        }
    }

    @Override
    public void alumnos(int cant) {
        System.out.println("El numero de alumnos es de: "+cant);
    }
}
