package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String[][] ma1 = new String[4][4];
        //Fila, columna
        //ma1[0][0] = "Hola";
        String[][] palabras = {{"Hola","Como","Estas","Como"},{"Te", "va", "espero","que"},
                {"muy","bien","y","que"},{"si","no","puede","ser"}};
        System.out.println(palabras[3][3]);
        System.out.println(palabras[1][2]);
        System.out.println(palabras[0][0]);
        char[][] letras = {{'0','1','2','3','4'},{'5','6','7','8','9'},{'n','a','s','i','u'},{'h','j','e','b','c'}};
        System.out.println(letras[3][1]);
        System.out.println(letras[2][1]);
        System.out.println(letras[3][3]);
    }
}
