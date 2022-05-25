package com.company;

import java.util.*;

public class Arreglos {

    Scanner sc = new Scanner(System.in);
    boolean bandera = true, bandera2 = true;
    int menu, pos, num;
    ArrayList<Integer> array = new ArrayList<Integer>();

    public void arr() {
        while (bandera) {
            System.out.println("Opciones del menu: ");
            System.out.println("1. Agregar elementos");
            System.out.println("2. Buscar un elemento");
            System.out.println("3. Modificar un elemento");
            System.out.println("4. Eliminar elemento por posicion");
            System.out.println("5. Insertar en una posicion un elemento");
            System.out.println("6. Mostrar todos los elementos del AL");
            System.out.println("0. salir");
            System.out.println("Que opcion desea: ");
            menu = sc.nextInt();
            switch (menu) {
                case 0:
                    bandera = false;
                    break;
                case 1:
                    bandera2 = true;
                    while (bandera2) {
                        System.out.println("Escriba el numero que desea agregar");
                        num = sc.nextInt();
                        array.add(num);
                        System.out.println("Si desea agregar otro elemento ingrese el numero 1.\n" +
                                "Si desea salir ponga cualquier numero");
                        num = sc.nextInt();
                        if (num == 1) {
                            continue;
                        } else {
                            bandera2 = false;
                        }
                    }
                    System.out.println("Arreglo actual: ");
                    for (int i : array) {
                        System.out.print(i + ", ");
                    }
                    System.out.println("");
                    break;
                case 2:
                    if (array.isEmpty()) {
                        System.out.println("El Al esta vacio");
                    } else {
                        System.out.println("Ingrese el numero que desea buscar: ");
                        num = sc.nextInt();
                        if (array.contains(num)) {
                            System.out.println("El elemento se encuentra, en la posicion: " + array.indexOf(num));
                        } else {
                            System.out.println("El elemento no se encuentra");
                        }
                    }
                    break;
                case 3:
                    if (array.isEmpty()) {
                        System.out.println("El Al esta vacio");
                    } else {
                        System.out.println("Que elemeto desea modificar: ");
                        pos = sc.nextInt();
                        if (pos > (array.size() - 1)) {
                            System.out.println("Elemento fuera de rango");
                        } else {
                            System.out.println("Por que numero lo desea modificar? ");
                            num = sc.nextInt();
                            array.set(pos, num);
                        }
                        System.out.println("Arreglo actual: ");
                        for (int i : array) {
                            System.out.print(i + ", ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    if (array.isEmpty()) {
                        System.out.println("El Al esta vacio");
                    } else {
                        System.out.println("Que elemeto desea eliminar ");
                        pos = sc.nextInt();
                        if (pos > (array.size() - 1)) {
                            System.out.println("Elemento fuera de rango");
                        } else {
                            array.remove(pos);
                        }
                        System.out.println("Arreglo actual: ");
                        for (int i : array) {
                            System.out.print(i + ", ");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    if (array.isEmpty()) {
                        System.out.println("El Al esta vacio");
                    } else {
                        System.out.println("En que posicion desea insertar un elemento");
                        pos = sc.nextInt();
                        if (pos > (array.size() - 1)) {
                            System.out.println("Elemento fuera de rango");
                        } else {
                            System.out.println("Que elemento desea agregar");
                            num = sc.nextInt();
                            array.add(pos, num);
                        }
                        System.out.println("Arreglo actual: ");
                        for (int i : array) {
                            System.out.print(i + ", ");
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                    if (array.isEmpty()) {
                        System.out.println("El Al esta vacio");
                    } else {
                        for (int i : array) {
                            System.out.print(i + ", ");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }

}
