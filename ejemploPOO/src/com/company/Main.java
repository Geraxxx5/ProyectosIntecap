package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehiculo sedan = new Vehiculo();
        sedan.marca = "Mazda";
        sedan.modelo = "3";
        sedan.anio = 2010;
        sedan.color = "Rojo";
        System.out.println(sedan.marca+" "+ sedan.color+" "+sedan.anio+" "+ sedan.modelo);

        sedan.arrancar();

        Vehiculo suv = new Vehiculo();
        suv.marca = "Ford";
        suv.modelo = "Explore";
        suv.color = "Gris";
        suv.anio = 2008;

        System.out.println(suv.marca+" "+ suv.color+" "+suv.anio+" "+ suv.modelo);

        suv.arrancar();

    }
}
