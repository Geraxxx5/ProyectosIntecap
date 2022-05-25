package com.company;

import java.util.*;

public class Aritmetica {

    public Float n1,n2;
    Scanner sc = new Scanner(System.in);

    public Float suma(){
        return n1+n2;
    }

    public void resta(){
        try{
            System.out.println("Ingrese su primer numero");
            n1 = Float.parseFloat( sc.next());
            System.out.println("Ingrese su segundo numero");
            n2 = Float.parseFloat( sc.next() );
            System.out.println("El resultado de la resta es: "+(n1-n2));
        }catch (NumberFormatException c){
            System.err.println("Error "+c);
        }
    }

    public void multi(){
        System.out.println("La multiplicacion es: "+(n1*n2));
    }

    public void divi(){
        try{
            System.out.println("Ingrese su primer numero");
            n1 = Float.parseFloat( sc.next());
            System.out.println("Ingrese su segundo numero");
            n2 = Float.parseFloat( sc.next() );
            if(n2 != 0){
                System.out.println("El resultado de la division es: "+(n1/n2));
            }else {
                System.out.println("No se puede dividir entre 0");
            }
        }catch (NumberFormatException c){
            System.err.println("Error "+c);
        }
    }
}
