package Ejercicios25al44;

import java.util.Scanner;

public class Ej30 {


    public static void main(String[] args) {

        final double G = 9.81;
        var s = new Scanner(System.in);

        System.out.println("Cálculo del tiempo de caída de un objeto.");
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        Double h = Double.parseDouble(s.nextLine());

        double t = Math.sqrt(2*h/G);

        System.out.printf("El objeto tarda %.2f segundos en caer.\n", t);
    }
}
