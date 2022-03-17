package Ejercicios25al44;

import java.util.Scanner;

public class Ej41 {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero: ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("La última cifra del número introducido es el " + (n % 10));
    }
}
