package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        /*int i;
        String dato;
        ArrayList<String> arraylist1 = new ArrayList<String>();
        ArrayList<String> arraylist2 = new ArrayList<String>();
        System.out.println("Ingrese 10 datos para el primer arreglo");
        for(i = 0;i<10;i++){
            System.out.println("Dato No. "+(i+1));
            dato = sc.next();
            arraylist1.add(dato);
        }
        System.out.println("Ingrese 10 datos para el segundo arreglo");
        for(i = 0;i<10;i++){
            System.out.println("Dato No. "+(i+1));
            dato = sc.next();
            arraylist2.add(dato);
        }
        System.out.println("El tamaño del primer arreglo es: "+arraylist1.size());
        System.out.println("El tamaño del segundo arreglo es: "+arraylist2.size());
        System.out.println("Datos en la posicion: 3. "+arraylist1.get(3)+", 5. "+arraylist1.get(5)+", 7. "+arraylist1.get(7));
        System.out.println("Datos en la posicion: 3. "+arraylist2.get(3)+", 5. "+arraylist2.get(5)+", 7. "+arraylist2.get(7));
        System.out.println("Datos en la ultima posicion: "+arraylist1.get((arraylist1.size())-1));
        System.out.println("Datos en la ultima posicion: "+arraylist2.get(arraylist1.size()-1));
        arraylist1.remove(5);
        arraylist2.remove(8);
        arraylist1.add(5,"1");
        arraylist2.add(8,"1");
        System.out.println("Arreglo 1");
        for(String e : arraylist1){
            System.out.print(e+", ");
        }
        System.out.println("");
        System.out.println("Arreglo 2");
        for(String e : arraylist2){
            System.out.print(e+", ");
        }
        */
        boolean bandera = true, bandera2 = true;
        int menu, pos, num;
        ArrayList<Integer> array = new ArrayList<Integer>();
        //array.add(0,60);
        //for(int i : array){
        //    System.out.print(i+", ");
        //}
        while(bandera){
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
            switch (menu){
                case 0:
                    bandera = false;
                    System.out.println("Se termino el programa");
                    break;
                case 1:
                    bandera2 = true;
                    while(bandera2){
                        System.out.println("Escriba el numero que desea agregar");
                        num = sc.nextInt();
                        array.add(num);
                        System.out.println("Si desea agregar otro elemento ingrese el numero 1.\n" +
                                "Si desea salir ponga cualquier numero");
                        num = sc.nextInt();
                        if (num == 1){
                            continue;
                        }else{
                            bandera2 = false;
                        }
                    }
                    System.out.println("Arreglo actual: ");
                    for(int i: array){
                        System.out.print(i+", ");
                    }
                    System.out.println("");
                    break;
                case 2:
                    if(array.isEmpty()){
                        System.out.println("El Al esta vacio");
                    }else {
                        System.out.println("Ingrese el numero que desea buscar: ");
                        num = sc.nextInt();
                        if(array.contains(num)){
                            System.out.println("El elemento se encuentra, en la posicion: "+array.indexOf(num));
                        }else{
                            System.out.println("El elemento no se encuentra");
                        }
                    }
                    break;
                case 3:
                    if(array.isEmpty()) {
                        System.out.println("El Al esta vacio");
                    }else{
                        System.out.println("Que elemeto desea modificar: ");
                        pos = sc.nextInt();
                        if(pos> (array.size()-1)){
                            System.out.println("Elemento fuera de rango");
                        }else{
                            System.out.println("Por que numero lo desea modificar? ");
                            num = sc.nextInt();
                            array.set(pos,num);
                        }
                        System.out.println("Arreglo actual: ");
                        for(int i: array){
                            System.out.print(i+", ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    if(array.isEmpty()){
                        System.out.println("El Al esta vacio");
                    }else{
                        System.out.println("Que elemeto desea eliminar ");
                        pos = sc.nextInt();
                        if(pos> (array.size()-1)){
                            System.out.println("Elemento fuera de rango");
                        }else{
                            array.remove(pos);
                        }
                        System.out.println("Arreglo actual: ");
                        for(int i: array){
                            System.out.print(i+", ");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    if(array.isEmpty()){
                        System.out.println("El Al esta vacio");
                    }else{
                        System.out.println("En que posicion desea insertar un elemento");
                        pos = sc.nextInt();
                        if(pos> (array.size()-1)){
                            System.out.println("Elemento fuera de rango");
                        }else{
                            System.out.println("Que elemento desea agregar");
                            num = sc.nextInt();
                            array.add(pos,num);
                        }
                        System.out.println("Arreglo actual: ");
                        for(int i: array){
                            System.out.print(i+", ");
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                    if(array.isEmpty()){
                        System.out.println("El Al esta vacio");
                    }else{
                        for(int i: array){
                            System.out.print(i+", ");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }
}
