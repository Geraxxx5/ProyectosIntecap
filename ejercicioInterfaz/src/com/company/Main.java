package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Declaracion de clases a utilizar
        Scanner sc = new Scanner(System.in);
        Primero pri = new Primero();
        Segundo sec = new Segundo();
        Tercero ter = new Tercero();
        Cuarto cuar = new Cuarto();
        Quinto quin = new Quinto();
        Sexto sex = new Sexto();

        //Declaracion de varibales
        int menu, c;
        boolean bandera = true;

        //Bienvenida al usaurio
        while(bandera) {
            System.out.println("¿Bienvenido que de que grado eres?");
            System.out.println("Selecciona una numero para el grado");
            System.out.println("1. Primero");
            System.out.println("2. Segundo");
            System.out.println("3. Tercero");
            System.out.println("4. Cuarto");
            System.out.println("5. Quinto");
            System.out.println("6. Sexto");
            System.out.println("0. Para salir");
            System.out.println("Ingrese el grado");
            try {
                menu = Integer.parseInt(sc.next());
                switch (menu){
                    case 0:
                        bandera = false;
                        break;
                    default:
                        System.out.println("Ingrese un numero dentro del rango");
                        break;
                    case 1:
                        System.out.println("Ingrese el numero de estudiantes del grado");
                        try {
                            c = Integer.parseInt(sc.next());
                            pri.alumnos(c);
                            pri.tablas(1,2);
                        }catch (NumberFormatException ex){
                            System.out.println("Unicamente numeros");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el numero de estudiantes del grado");
                        try {
                            c = Integer.parseInt(sc.next());
                            sec.alumnos(c);
                            sec.tablas(3,4);
                        }catch (NumberFormatException ex){
                            System.out.println("Unicamente numeros");
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el numero de estudiantes del grado");
                        try {
                            c = Integer.parseInt(sc.next());
                            ter.alumnos(c);
                            ter.tablas(5,6);
                        }catch (NumberFormatException ex){
                            System.out.println("Unicamente numeros");
                        }
                        break;
                    case 4:
                        System.out.println("Ingrese el numero de estudiantes del grado");
                        try {
                            c = Integer.parseInt(sc.next());
                            cuar.alumnos(c);
                            cuar.tablas(7,8);
                        }catch (NumberFormatException ex){
                            System.out.println("Unicamente numeros");
                        }
                        break;
                    case 5:
                        System.out.println("Ingrese el numero de estudiantes del grado");
                        try {
                            c = Integer.parseInt(sc.next());
                            quin.alumnos(c);
                            quin.tablas(9,10);
                        }catch (NumberFormatException ex){
                            System.out.println("Unicamente numeros");
                        }
                        break;
                    case 6:
                        System.out.println("Ingrese el numero de estudiantes del grado");
                        try {
                            c = Integer.parseInt(sc.next());
                            sex.alumnos(c);
                            sex.tablas(11,12);
                        }catch (NumberFormatException ex){
                            System.out.println("Unicamente numeros");
                        }
                        break;
                }

            } catch (NumberFormatException ex) {
                System.err.println("Ingresa un numero");
            }
        }




    }
}
