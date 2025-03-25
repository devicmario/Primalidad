package com.devic.test;

import java.util.Scanner;

        /**
        * Aplicación para verificar si un número es primo.
        * Un número primo es aquel que solo es divisible por 1 y por sí mismo.
         * Devic
         * v1.0.01
         * 25/03/2025
        */

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        PrimalidadEnNumeros primo = new PrimalidadEnNumeros();
        System.out.println("Por favor, introduzca el numero para verificar si es primo: ");
        int num = inp.nextInt();

        if (primo.isPrimo(num)){
            mostrarResultado(num,true);
        } else {
            mostrarResultado(num,false);
        }
        inp.close();
    }
    public static void mostrarResultado(int num, boolean esPrimo) {

        if(esPrimo) {
        System.out.println("*********************************");
        System.out.println("¡Correcto! El numero " + num + " es primo");
            System.out.println("*********************************");
    } else {
            System.out.println("*********************************");
            System.out.println("El numero " + num + " no es primo");
            System.out.println("*********************************");
        }
    }
}