package com.company;

import java.util.*;

public abstract class Trabajador {
    public Trabajador(){

    }
    Scanner sc = new Scanner(System.in);
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public double sueldo;
    public double sueldoTotal;

    public void agregarPersona(){
        String[] preguntas = {"Nombre","Apellido","edad","Zona de Direccion","Sueldo"};
        for(int i = 0;i<5;i++) {
            switch(i){
                case 0:
                    System.out.println("Ingrese el siguiente dato del trabajador: " + preguntas[i]);
                    nombre = sc.next();
                    break;
                case 1:
                    System.out.println("Ingrese el siguiente dato del trabajador: " + preguntas[i]);
                    apellido = sc.next();
                    break;
                case 2:
                    System.out.println("Ingrese el siguiente dato del trabajador: " + preguntas[i]);
                    edad = Integer.parseInt(sc.next());
                    break;
                case 3:
                    System.out.println("Ingrese el siguiente dato del trabajador: " + preguntas[i]);
                    direccion = sc.next();
                    break;
                case 4:
                    System.out.println("Ingrese el siguiente dato del trabajador: " + preguntas[i]);
                    sueldo = Double.parseDouble(sc.next());
                    break;
            }
        }
    }

    public void calSalario(){
        sueldoTotal = sueldo*12;
    }

    public abstract String comision();

    public abstract void mostrar();
}
