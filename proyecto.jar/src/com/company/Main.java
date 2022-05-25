package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("Fecha actual: "+c1.getTime().toString());
        c1.set(2000,Calendar.AUGUST,31);
        System.out.println("Fecha 31/7/20: "+c1.getTime().toString());
        c1.set(Calendar.MONTH,2);
        System.out.println("Fecha mas 2 meses mas "+c1.getTime().toString());
    }
}
