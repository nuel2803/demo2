package Ejercicios25al44;

import java.util.Scanner;

public class Ej25 {

    public static void main(String[] args) {
        String dia;
        var s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca " +
                "a primera hora ese día, no olvides las tildes: ");
        dia = s.nextLine();
        dia.toLowerCase(); // convierto a minúsculas todas las letras

        switch(dia) {
            case "lunes":
                // continúa debajo
            case "martes":
                // continúa debajo
            case "miércoles":
                System.out.println("Programación");
                break;
            case "jueves":
                System.out.println("Sistemas Informáticos");
                break;
            case "viernes":
                System.out.println("Bases de Datos");
                break;
            case "sábado":
                // continúa debajo
            case "domingo":
                System.out.println("¡Ese día no hay clase!");
                break;
            default:
                System.out.println("El día introducido no es correcto.");
        }
    }
}
