package Ejercicios25al44;

import java.util.Scanner;

public class Ej29 {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        Double a = Double.parseDouble(s.nextLine());
        System.out.print("Ahora introduzca el valor de b: ");
        Double b = Double.parseDouble(s.nextLine());

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + (-b/a));
        }
    }
}
