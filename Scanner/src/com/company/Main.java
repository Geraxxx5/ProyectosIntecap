package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Crear nuestro objeto
        Scanner sc = new Scanner(System.in);

        //int anio;
        //int meses;
        String nombre;
        int edad;

        //System.out.println("Contador de meses que tienen cierta cantidad de años");
        //System.out.println("Usted tendra que ingresar la cantidad de años para saber cuantos meses lo conforman");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Usted se llama: "+nombre+" tiene "+edad+" años y nacio en "+(2022-(edad+1)));
        //System.out.println("El programa solicito el numero de años y lo multiplico por 12");
        //System.out.println("Debido a que un año son 12 meses, lo unico que se hace es multiplicar la cantodad de años por 12");
        //System.out.println("Ingrese otro numero");
        //n2 = sc.nextInt();
        //suma = n1+n2;
        //resta = n1-n2;
        //System.out.println("La suma es: "+suma);
        //System.out.println("La resta es: "+resta);


    }
}
