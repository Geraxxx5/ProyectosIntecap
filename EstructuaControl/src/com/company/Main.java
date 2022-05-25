package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese su segundo numero");
        n2 = sc.nextInt();
        if (n1>n2){
            System.out.println("El primer numero es mayor");
        }else if(n1 == n2){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("El segundo numero es mayor");
        }


    }
}
