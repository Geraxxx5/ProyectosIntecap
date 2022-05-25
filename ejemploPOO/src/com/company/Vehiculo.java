package com.company;

public class Vehiculo {
    
       public String color;
       public String marca;
       public String modelo;
       public int anio;


       public void arrancar(){
              System.out.println("Rmmm, Arranque");
              System.out.println(color);
       }

       public Double velocidad(){
              Double velo;
              velo = 200 * 1.6;
              return velo;
       }


    
}
