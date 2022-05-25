package com.company;

public class Sony extends Trabajador{
    @Override
    public String comision() {
        double sal = sueldo*12;
        String respuesta = "No se le aplico ninguna comision";
        if(sal > 100000){
            sal = sal+ ((sal*10)/100);
            respuesta = "Se le agrego una comision del 10%: "+sal;
        }
        return respuesta;
    }

    @Override
    public void mostrar() {
        System.out.println("Trabajador");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Sueldo por año: "+sueldoTotal);
        System.out.println(comision());
    }
}
