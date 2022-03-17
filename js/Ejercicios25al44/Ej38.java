package Ejercicios25al44;

import java.util.Scanner;

public class Ej38 {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero: ");
        int n = Integer.parseInt(s.nextLine());

        if ((n % 2) == 0) {
            System.out.print("El número introducido es par");
        } else {
            System.out.print("El número introducido es impar");
        }

        if ((n % 5) == 0) {
            System.out.println(" y divisible entre 5.");
        } else {
            System.out.println(" y no es divisible entre 5.");
        }
    }
}
