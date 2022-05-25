package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int suma ,mayores,n;
        suma = 0;
        mayores = 0;
        for(int i = 0; i<=100; i = i+2){
            System.out.println(i+", "+(i+1));
        }

        for(int i = 1; i<=10;i++){
            System.out.println("Ingrese el sueldo No."+i);
            n = sc.nextInt();
            suma+=n;
            if(5000<n){
                mayores++;
            }
        }
        System.out.println("La suma de los sueldos es "+suma);
        System.out.println("Mayores a 5000 hay "+mayores);

        System.out.println("Ingres un numero del 0 al 12");
        n = sc.nextInt();
        if(n>0 && n<=12){
            for(int i = 0; i<=12;i++){
                System.out.println(n+" * "+i+" = "+(n*i));
            }
        }
    }
}
