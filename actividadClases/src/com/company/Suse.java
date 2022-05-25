package com.company;

public class Suse {

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // p1+p2
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
