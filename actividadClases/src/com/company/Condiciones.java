package com.company;

import java.util.*;

public class Condiciones {

    Scanner sc = new Scanner(System.in);
    public int n1,n2,n3;

    public void mayorque(){
        try{
            System.out.println("¿Que numero es mayor?");
            System.out.println("Ingrese su primer numero: ");
            n1 = Integer.parseInt(sc.next());
            System.out.println("Ingrese su segundo numero: ");
            n2 = Integer.parseInt(sc.next());
            if(n1>n2){
                System.out.println("El primer numero es mayor");
            }else{
                System.out.println("El segundo numero es mayor");
            }
        }catch (NumberFormatException c){
            System.err.println("Unicamente numeros c");
        }
    }

    public void orNum(){
        try{
            System.out.println("Ordenar 3 numeros");
            System.out.println("Ingrese su primer numero: ");
            n1 = Integer.parseInt(sc.next());
            System.out.println("Ingrese su segundo numero: ");
            n2 = Integer.parseInt(sc.next());
            System.out.println("Ingrese su tercer numero: ");
            n3 = Integer.parseInt(sc.next());
            if(n1>n2 && n1>n3){
                if (n2>n3){
                    System.out.println("Orden: "+n1+", "+n2+", "+n3);
                }else{
                    System.out.println("Orden: "+n1+", "+n3+", "+n2);
                }
            }else if(n2>n1 && n2>n3){
                if(n1>n3){
                    System.out.println("Orden: "+n2+", "+n1+", "+n3);
                }else{
                    System.out.println("Orden: "+n2+", "+n3+", "+n1);
                }
            }else if(n3>n1 && n3>n2){
                if(n1>n2){
                    System.out.println("Orden: "+n3+", "+n1+", "+n2);
                }else{
                    System.out.println("Orden: "+n3+", "+n2+", "+n1);
                }
            }
        }catch (NumberFormatException c){
            System.err.println("Unicamente numeros c");
        }
    }

    public void mes(){
        System.out.println("Ingrese un numero del 1 al 12 y salda un mes");
        System.out.println("Ingrese un numero: ");
        try{
            n1 = Integer.parseInt( sc.next() );
            if(n1>=1 && n1<=12){
                switch (n1){
                    case 1:
                        System.out.println("Enero");
                        break;
                    case 2:
                        System.out.println("Febrero");
                        break;
                    case 3:
                        System.out.println("Marzo");
                        break;
                    case 4:
                        System.out.println("Abril");
                        break;
                    case 5:
                        System.out.println("Mayo");
                        break;
                    case 6:
                        System.out.println("Junio");
                        break;
                    case 7:
                        System.out.println("Julio");
                        break;
                    case 8:
                        System.out.println("Agosto");
                        break;
                    case 9:
                        System.out.println("Septiembre");
                        break;
                    case 10:
                        System.out.println("Octubre");
                        break;
                    case 11:
                        System.out.println("Noviembre");
                        break;
                    case 12:
                        System.out.println("Diciembre");
                        break;
                }
            }
        }catch (NumberFormatException c){
            System.err.println("Error: "+c);
        }
    }
}
