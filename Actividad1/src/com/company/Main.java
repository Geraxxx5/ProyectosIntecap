package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        boolean bandera = true,
                bandera2 = true;
        int menu, n1,n2,n3,anio, i, suma , multi, resta, cont;
        String num, nom;


        while(bandera){
            System.out.println("Bienvenido a estrucuras de control");
            System.out.println("En este programa se repasaran las estructuras de control vistas en clase");
            System.out.println("Estas son las opciones: ");
            System.out.println("1. Estrctura if");
            System.out.println("2. Estrcutura else if");
            System.out.println("3. Switch Case");
            System.out.println("4. Ciclo for");
            System.out.println("5. Ciclo while");
            System.out.println("6. Ciclo do while");
            System.out.println("0. Salir del programa");
            System.out.println("Elija una opcion");
            int eleccion = sc.nextInt();
            switch (eleccion){
                case 1:
                    bandera2 = true;
                    while(bandera2) {
                        System.out.println("Menu de programas de la estrctura if");
                        System.out.println("1. Determinar si un año es bisiesto. \n2. Ingresar dos numeros y determinar cual es menor." +
                                "\n0. Salir del menu.\n Elija una opcion");
                        menu = sc.nextInt();
                        switch (menu) {
                            case 1:
                                System.out.println("Ingrese un año ára determinar si es bisiesto");
                                anio = sc.nextInt();
                                if (anio % 4 == 0) {
                                    System.out.println("Es un año bisiesto");
                                } else {
                                    System.out.println("No es un año bisiesto");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese dos numero");
                                System.out.println("n1: ");
                                n1 = sc.nextInt();
                                System.out.println("n2: ");
                                n2 = sc.nextInt();
                                if(n1<n2){
                                    System.out.println("n1 es menor que el otro numero");
                                }else{
                                    System.out.println("n2 es menor que el otro numero");
                                }
                                break;
                            case 0:
                                bandera2 = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    bandera2 = true;
                    while(bandera2){
                        System.out.println("Menu de programas de la estrctura else if");
                        System.out.println("1. Ingresar dos numeros y ordenarlos de menor a mayor. \n2. Ingresar un numero y decir si es 1< o 10< o 100< o 1000<" +
                                "\n0. Salir del menu.\n Elija una opcion");
                        menu = sc.nextInt();
                        switch (menu){
                            case 1:
                                System.out.println("Ingrese el primero numero, n1:");
                                n1 = sc.nextInt();
                                System.out.println("Ingrese su segundo numero, n2:");
                                n2 = sc.nextInt();
                                System.out.println("Ingrese su tercer numero, n3: ");
                                n3 = sc.nextInt();
                                if(n1<n2 && n1<n3){
                                    if(n2<n3){
                                        System.out.println("Los numeros ordenados de menor a mayor son: "+n1+", "+n2+
                                                ", "+n3);
                                    }else{
                                        System.out.println("Los numeros ordenados de menor a mayor son: "+n1+", "+n3+
                                                ", "+n2);
                                    }
                                }else if(n2<n1 && n2<n3){
                                    if(n1<n3){
                                        System.out.println("Los numeros ordenados de menor a mayor son: "+n2+", "+n1+
                                                ", "+n3);
                                    }else{
                                        System.out.println("Los numeros ordenados de menor a mayor son: "+n2+", "+n3+
                                                ", "+n1);
                                    }
                                }else if(n3<n1 && n3<n2){
                                    if(n1<n2){
                                        System.out.println("Los numeros ordenados de menor a mayor son: "+n3+", "+n1+
                                                ", "+n2);
                                    }else{
                                        System.out.println("Los numeros ordenados de menor a mayor son: "+n3+", "+n2+
                                                ", "+n1);
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese un numero");
                                n1 = sc.nextInt();
                                if(n1<10){
                                    System.out.println("El numero es menor a 10");
                                }else if(n1<100){
                                    System.out.println("El numero es menor a 100");
                                }else if(n1<1000){
                                    System.out.println("El numero es menor a 1000");
                                }else if(n1<10000){
                                    System.out.println("El numero es menor a 10000");
                                }
                                break;
                            case 0:
                                bandera2 = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    bandera2 = true;
                    while(bandera2){
                        System.out.println("Menu de programas de la estrctura Switch");
                        System.out.println("1. Ingresar un numero y saldra el dia al que corresponda el numero." +
                                " \n2. Escribir un numero del 1 al 10 en letras y saldra el numero" +
                                "\n0. Salir del menu.\n Elija una opcion");
                        menu = sc.nextInt();
                        switch (menu){
                            case 1:
                                System.out.println("Ingrese un numero del 1 a 10");
                                n1 = sc.nextInt();
                                switch (n1){
                                    case 1:
                                        System.out.println("Lunes");
                                        break;
                                    case 2:
                                        System.out.println("Martes");
                                        break;
                                    case 3:
                                        System.out.println("Miercoles");
                                        break;
                                    case 4:
                                        System.out.println("Jueves");
                                        break;
                                    case 5:
                                        System.out.println("Viernes");
                                        break;
                                    case 6:
                                        System.out.println("Sabado");
                                        break;
                                    case 7:
                                        System.out.println("Domingo");
                                        break;
                                    default:
                                        System.out.println("Numero fuera de rango");
                                }
                                break;
                            case 2:
                                System.out.println("Escribe un numero en letras");
                                num = sc.next();
                                num = num.toLowerCase();
                                switch(num){
                                    case "uno":
                                        System.out.println("1");
                                        break;
                                    case "dos":
                                        System.out.println(2);
                                        break;
                                    case "tres":
                                        System.out.println(3);
                                        break;
                                    case "cuatro":
                                        System.out.println(4);
                                        break;
                                    case "cinco":
                                        System.out.println(5);
                                        break;
                                    case "seis":
                                        System.out.println(6);
                                        break;
                                    case "siete":
                                        System.out.println(7);
                                        break;
                                    case "ocho":
                                        System.out.println(8);
                                        break;
                                    case "nueve":
                                        System.out.println(9);
                                        break;
                                    case "diez":
                                        System.out.println(10);
                                        break;
                                    default:
                                        System.out.println("Ingrese un numero corecto");
                                        break;
                                }
                                break;
                            case 0:
                                bandera2 = false;
                                break;
                        }
                    }
                    break;
                case 4:
                    bandera2 = true;
                    while(bandera2) {
                        System.out.println("Menu de programas de la estrctura For");
                        System.out.println("1. Escribir 4 numeros y mostrar la suma, resta y multiplicacion de ellos." +
                                " \n2. Tabla de multiplicacion del numero ingresado" +
                                "\n0. Salir del menu.\n Elija una opcion");
                        menu = sc.nextInt();
                        switch (menu){
                            case 1:
                                suma = 0;
                                multi = 1;
                                resta = 0;
                                for(i=0;i<4;i++){
                                    System.out.println("Ingrese un numero entero");
                                    n1 = sc.nextInt();
                                    suma+=n1;
                                    multi*=n1;
                                    resta-=n1;
                                }
                                System.out.println("La suma de los numeros es: "+suma+
                                        "\nLa resta de los numeros es: "+resta+
                                        "\nLa multiplicacion de los numeros es: "+multi);
                                break;
                            case 2:
                                System.out.println("Ingrese un numero para la tabla de multiplicacion");
                                n1 = sc.nextInt();
                                for(i=0;i<=10;i++){
                                    System.out.println(n1+" x "+i+" = "+(n1*i));
                                }
                                break;
                            case 0:
                                bandera2 = false;
                                break;
                        }
                    }
                    break;
                case 5:
                    bandera2 = true;
                    while(bandera2){
                        System.out.println("Menu de programas de la estrctura While");
                        System.out.println("1. Escribir 2 numeros y si la suma es 500 termina." +
                                " \n2. Ingresar un numero y determinar si es par o impar. Se termina al escribir un numero negativo" +
                                "\n0. Salir del menu.\n Elija una opcion");
                        menu = sc.nextInt();
                        switch (menu){
                            case 1:
                                suma = 0;
                                System.out.println("Ingreso");
                                while(suma<500 || suma>500){
                                    System.out.println("Ingresar el primero numero");
                                    n1 = sc.nextInt();
                                    System.out.println("Ingresar el segundo numero");
                                    n2 = sc.nextInt();
                                    suma = n1+n2;
                                    System.out.println("La suma es: "+suma);
                                }
                                break;
                            case 2:
                                n1 = 0;
                                while(n1>=0){
                                    System.out.println("Ingrese un numero");
                                    n1 = sc.nextInt();
                                    if(n1%2 == 0){
                                        System.out.println("El numero es par");
                                    }else{
                                        System.out.println("El numero es impar");
                                    }
                                    if(n1<0){
                                        System.out.println("El numero es negativo");
                                    }
                                }
                                break;
                            case 0:
                                bandera2 = false;
                                break;
                        }
                    }
                    break;
                case 6:
                    bandera2 = true;
                    while(bandera2){
                        System.out.println("Menu de programas de la estrctura Do While");
                        System.out.println("1. Ingresar una cantidad de boletos y asignar un boleto por persona hasta acabar capacidad." +
                                " \n2. Un numero del 0 al 10 y se muestra el cuadrado y multiplicacion por 100" +
                                "\n0. Salir del menu.\n Elija una opcion");
                        menu = sc.nextInt();
                        switch (menu){
                            case 1:
                                System.out.println("Ingrese la cantidad de boletos");
                                n1 = sc.nextInt();
                                cont = 1;
                                do{
                                    System.out.println("Ingrese nombre de la persona");
                                    nom = sc.next();
                                    System.out.println(nom+" con boleto No."+cont);
                                    cont++;
                                }while(cont<=n1);
                                System.out.println("Se agotaron los boletos");
                                break;
                            case 2:
                                System.out.println("Ingrese un numero");
                                n1 = sc.nextInt();
                                do{
                                    if(n1>=0 && n1<=10){
                                        System.out.println("Numero ingresado: " + n1);
                                        System.out.println("Numero al cuadrado: " + (n1*n1));
                                        System.out.println("Multiplicacion * 100: " + (n1 * 100));
                                        System.out.println("Introducir un numero");
                                        n1 = sc.nextInt();
                                    }else{
                                        System.out.println("Numero fuera de rango");

                                    }
                                }while (n1>=0 && n1<=10);
                                break;
                            case 0:
                                bandera2 = false;
                                break;
                        }
                    }
                    break;
                case 0:
                    bandera = false;
                    System.out.println("El programa finalizo");
                    break;
                default:
                    System.out.println("Numero fuera de rango");
                    break;
            }
        }
    }
}
