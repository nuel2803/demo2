package Ejercicios25al44;

import java.util.Scanner;

public class Ej37 {

    public static void main(String[] args) {
        int aux;
        var s = new Scanner(System.in);

        System.out.println("Este programa ordena tres números introducidos por teclado.");
        System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        int c = Integer.parseInt(s.nextLine());

        // ordenación de los dos primeros números
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        // ordenación de los dos últimos números
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        // se vuelven a ordenar los dos primeros
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
    }
}
