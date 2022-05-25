package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Clases
        Scanner sc = new Scanner(System.in);
        Nintendo nin = new Nintendo();
        Sony son = new Sony();
        Microsofr micro = new Microsofr();
        //Variables
        int menu, menu2;
        boolean bandera = true, bandera2 = true;
        //Codigo
        while(bandera) {
            System.out.println("Ingrese que empresa desea visualizar \n(1) Nintendo\n(2) Sony\n(3) Microsoft\n(0) Salir");
            try {
                menu = Integer.parseInt(sc.next());
                switch (menu) {
                    case 1:
                        bandera2 = true;
                        while (bandera2) {
                            System.out.println("¿Que desea hacer?");
                            System.out.println("(1) Agregar persona \n(2) Visualizar trabajador \n(0) Salir");
                            try {
                                menu2 = Integer.parseInt(sc.next());
                                switch (menu2) {
                                    case 1:
                                        nin.agregarPersona();
                                        nin.calSalario();
                                        break;
                                    case 2:
                                        nin.mostrar();
                                        break;
                                    case 0:
                                        bandera2 = false;
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Error: " + e);
                            }
                        }
                        break;
                    case 2:
                        bandera2 = true;
                        while (bandera2) {
                            System.out.println("¿Que desea hacer?");
                            System.out.println("(1) Agregar persona \n(2) Visualizar trabajador \n(0) Salir");
                            try {
                                menu2 = Integer.parseInt(sc.next());
                                switch (menu2) {
                                    case 1:
                                        son.agregarPersona();
                                        son.calSalario();
                                        break;
                                    case 2:
                                        son.mostrar();
                                        break;
                                    case 0:
                                        bandera2 = false;
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Error: " + e);
                            }
                        }
                        break;
                    case 3:
                        bandera2 = true;
                        while (bandera2) {
                            System.out.println("¿Que desea hacer?");
                            System.out.println("(1) Agregar persona \n(2) Visualizar trabajador \n(0) Salir");
                            try {
                                menu2 = Integer.parseInt(sc.next());
                                switch (menu2) {
                                    case 1:
                                        micro.agregarPersona();
                                        micro.calSalario();
                                        break;
                                    case 2:
                                        micro.mostrar();
                                        break;
                                    case 0:
                                        bandera2 = false;
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Error: " + e);
                            }
                        }
                        break;
                    case 0:
                        bandera = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error: " + e);
            }
        }
    }
}
