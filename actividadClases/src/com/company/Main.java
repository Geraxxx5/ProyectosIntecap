package com.company;

import javafx.scene.chart.NumberAxis;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Aritmetica opera = new Aritmetica();
        Condiciones condi = new Condiciones();
        Ciclos ci = new Ciclos();
        Arreglos arreglos = new Arreglos();
        Matrices matrices = new Matrices();
        Suse fibo = new Suse();
        int menu,menu2,n1,n2;
        boolean bandera = true, bandera2;
        while(bandera){
            System.out.println("Bienvendio porfavor ingrese un numero acorde a lo que quiere");
            System.out.println("Menu: ");
            System.out.println(("1. Operaciones Aritmeticas"));
            System.out.println("2. Condiciones (if, else, else if , switch");
            System.out.println("3. Ciclos");
            System.out.println("4. Arreglos");
            System.out.println("5. Matrices");
            System.out.println("6. Fibonacci");
            System.out.println("0. Salir");
            try{
                System.out.println("Seleccione una opcion: ");
                menu = Integer.parseInt( sc.next() );
                switch(menu){
                    case 0:
                        System.out.println("Se termino el programa");
                        bandera = false;
                        break;
                    case 6:
                        System.out.println("Ingrese un numero de limite para la serie fibonacci");
                        try {
                            n1 = Integer.parseInt(sc.next());
                            System.out.println("El resultado es: "+fibo.fibonacci(n1));
                        }catch (NumberFormatException c){
                            System.err.println("Error "+c);
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("Ingrese el numero de filas de la matriz ");
                            n1 = Integer.parseInt( sc.next() );
                            System.out.println("Ingrese el numero de columnas de la matriz");
                            n2 = Integer.parseInt( sc.next() );
                            matrices.ejercicio(n1,n2);
                        }catch (NumberFormatException c){
                            System.err.println("Error: "+c);
                        }
                        break;
                    case 4:
                        System.out.println("Arraylist");
                        arreglos.arr();
                        break;
                    case 3:
                        bandera2 = true;
                        while(bandera2){
                            System.out.println("Selccione que desea: ");
                            System.out.println("1. For");
                            System.out.println("2. While");
                            System.out.println("3. Do while");
                            System.out.println("0. Salir");
                            try{
                                System.out.println("Seleccione una opcion:");
                                menu2 = Integer.parseInt(sc.next());
                                switch (menu2){
                                    case 0:
                                        bandera2 = false;
                                        break;
                                    case 1:
                                        ci.imprimirN();
                                        break;
                                    case 2:
                                        ci.dosNumeros();
                                        break;
                                    case 3:
                                        ci.cicloDo();
                                        break;
                                }
                            }catch (NumberFormatException c){
                                System.err.println("Error: "+c);
                            }
                        }
                        break;
                    case 2:
                        bandera2 = true;
                        while(bandera2) {
                            System.out.println("Selccione que desea: ");
                            System.out.println("1. if");
                            System.out.println("2. else if");
                            System.out.println("3. switch");
                            System.out.println("0. Salir");
                            try {
                                System.out.println("Seleccione una opcion:");
                                menu2 = Integer.parseInt(sc.next());
                                switch (menu2){
                                    case 0:
                                        bandera2 = false;
                                        break;
                                    case 1:
                                        condi.mayorque();
                                        break;
                                    case 2:
                                        condi.orNum();
                                        break;
                                    case 3:
                                        condi.mes();
                                        break;
                                }
                            }
                            catch (NumberFormatException c){
                                System.err.println("Ingrese numeros unicamente "+c);
                            }
                        }
                        break;
                    case 1 :
                        bandera2 = true;
                        while(bandera2){
                            System.out.println("Selccione que desea: ");
                            System.out.println("1. Suma");
                            System.out.println("2. Resta");
                            System.out.println("3. Multiplicacion");
                            System.out.println("4. Division");
                            System.out.println("0. Salir");
                            try{
                                System.out.println("Seleccione una opcion:");
                                menu2 = Integer.parseInt( sc.next() );
                                switch (menu2){
                                    case 0:
                                        bandera2 = false;
                                        break;
                                    case 1:
                                        try {
                                            System.out.println("Ingrese su primer numero");
                                            opera.n1 = Float.parseFloat(sc.next());
                                            System.out.println("Ingrese su segundo numero");
                                            opera.n2 = Float.parseFloat(sc.next());
                                            System.out.println("La suma es: "+opera.suma());
                                        }catch (NumberFormatException c){
                                            System.err.println("Error "+c);
                                        }
                                        break;
                                    case 2:
                                        opera.resta();
                                        break;
                                    case 3:
                                        try {
                                            System.out.println("Ingrese su primer numero");
                                            opera.n1 = Float.parseFloat(sc.next());
                                            System.out.println("Ingrese su segundo numero");
                                            opera.n2 = Float.parseFloat(sc.next());
                                            opera.multi();
                                        }catch (NumberFormatException c){
                                            System.err.println("Error "+c);
                                        }
                                        break;
                                    case 4:
                                        opera.divi();
                                        break;
                                }
                            }catch (NumberFormatException c){
                                System.err.println("Unicamente numeros: "+c);
                            }

                        }
                }
            }catch(NumberFormatException c){
                System.err.println("Error "+c);
            }
        }

    }
}
