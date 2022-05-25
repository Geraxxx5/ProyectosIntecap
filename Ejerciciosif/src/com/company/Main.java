package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        String num;
        while (true) {
            System.out.println("Ingrese un numero de 0 a 9999");
            n1 = sc.nextInt();
            //num = n1+"";
            //num.length();
            if (n1 < 10) {
                System.out.println("1");
            } else if (n1 >= 10 && n1 < 100) {
                System.out.println("2");
            } else if (n1 >= 100 && n1 < 1000) {
                System.out.println("3");
            } else if (n1 >= 1000 && n1 < 10000) {
                System.out.println("4");
            }esle{

            }
            System.out.println("Ingrese un numero de 0 a 10");
            n1 = sc.nextInt();
            if (n1 >= 0 && n1 <= 4) {
                System.out.println("bajo");
            } else if (n1 > 4 && n1 < 9) {
                System.out.println("medio");
            } else if (n1 > 8 && n1 < 11) {
                System.out.println("Alto");
            }else{
                System.out.println("Alto");
            }

            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();
            if ((n1 % 2) == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }

            System.out.println("Ingrese 3 numeros");
            System.out.println("n1");
            n1 = sc.nextInt();
            System.out.println("n2");
            n2 = sc.nextInt();
            System.out.println("n3");
            n3 = sc.nextInt();
            if (n1 > n2 && n1 > n3) {
                if (n2 > n3) {
                    System.out.println("Ordenados: " + n1 + ", " + n2 + ", " + n3);
                } else {
                    System.out.println("Ordenados: " + n1 + ", " + n3 + ", " + n2);
                }
            } else if (n2 > n1 && n2 > n3) {
                if (n1 > n3) {
                    System.out.println("Ordenados: " + n2 + ", " + n1 + ", " + n3);
                } else {
                    System.out.println("Ordenados: " + n2 + ", " + n3 + ", " + n1);
                }
            } else if (n3 > n1 && n3 > n2) {
                if (n1 > n3) {
                    System.out.println("Ordenados: " + n2 + ", " + n1 + ", " + n3);
                } else {
                    System.out.println("Ordenados: " + n2 + ", " + n3 + ", " + n1);
                }
            } else {
                System.out.println("Son iguales");
            }
        }
    }
}
