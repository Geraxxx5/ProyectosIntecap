package com.company;

import java.util.*;

public class Ciclos {

    private int n1,n2,r;
    Scanner sc = new Scanner(System.in);

    public void imprimirN(){
        System.out.println("Ingrese un numero, para imprimir del 0 al numero");
        try {
            n1 = Integer.parseInt(sc.next());
            for(int i = 0;i<=n1;i++){
                System.out.println(i);
            }
        }catch (NumberFormatException c){
            System.err.println("Error "+c);
        }
    }

    public void dosNumeros(){
        r = 0;
        while(r != 500) {
            System.out.println("Escribir 2 numeros y si la suma es 500 termina.");
            try{
                System.out.println("Ingrese su primer numero");
                n1 = Integer.parseInt(sc.next());
                System.out.println("Ingrese su segundo numero");
                n2 = Integer.parseInt(sc.next());
                r = n1+n2;
            }catch (NumberFormatException c){
                System.err.println("Error "+c);
            }
        }
    }

    public void cicloDo(){
        System.out.println("Ingrese un numero y de 0 a 10, si es diferente se sale del ciclo");
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
    }

}

