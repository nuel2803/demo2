package Ejercicios25al44;

import java.util.Scanner;

public class Ej28 {

    public static void main(String[] args) {
        int sueldoSemanal;
        var s = new Scanner(System.in);

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = Integer.parseInt(s.nextLine());

        if (horasTrabajadas < 40) {
            sueldoSemanal = 12 * horasTrabajadas;
        } else {
            sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
        }
        System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
    }
}
