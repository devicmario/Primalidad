package com.devic.test;

//Clase para conocer si un numero es primo
public class PrimalidadEnNumeros {

    public boolean isPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
