package Ejercicios25al44;

import java.util.Scanner;

public class Ej43 {

    public static void main(String[] args) {

        var s = new Scanner(System.in);
        int n, digitos = 0;

        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        n = Math.abs(Integer.parseInt(s.nextLine()));

        if ( n < 10 ) {
            digitos = 1;
        }

        if (( n >= 10 ) && ( n < 100 )) {
            digitos = 2;
        }

        if (( n >= 100 ) && ( n < 1000 )) {
            digitos = 3;
        }

        if (( n >= 1000 ) && ( n < 10000 )) {
            digitos = 4;
        }

        if ( n >= 10000 ) {
            digitos = 5;
        }

        System.out.println("El número introducido tiene " + digitos + " dígitos.");
    }
}
