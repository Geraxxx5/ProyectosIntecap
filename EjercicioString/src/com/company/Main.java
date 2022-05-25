package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //declaracion de variables
        String nombres = "Gabriel Gerardo";
        String apellidos = "Pineda Riveiro";
        String edad = "18";
        String genero = "Masculino";
        String estudio = "universidad";
        String auto = "ferrari";
        String color = "Morado";
        String comida = "pasta";
        String mensaje;

        //requerido
        mensaje = ("Mi nombre es "+nombres+" "+apellidos+" "+"tengo 18 años, estoy empezando la "
                    +estudio+" me gustan los "+auto+", mi color favorito es el "+color+" y me gusta comer mucho "+comida);
        //mensajes
        System.out.println(mensaje);
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.toLowerCase());
    }
}
