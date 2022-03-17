package Ejercicios25al44;

import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {

        var s = new Scanner(System.in);
        double media;

        System.out.println("Este programa calcula la media de tres notas.");

        System.out.print("Por favor, introduzca la primera nota: ");
        Double nota1 = Double.parseDouble(s.nextLine());

        System.out.print("Ahora introduzca la segunda nota: ");
        Double nota2 = Double.parseDouble(s.nextLine());

        System.out.print("Por último introduzca la tercera nota: ");
        Double nota3 = Double.parseDouble(s.nextLine());

        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10))
            System.out.println("Has " +
                    "introducido mal las notas");

        else {
            media = (nota1 + nota2 + nota3) / 3;
            System.out.printf("La media es %.2f\n", media);
            if (media < 5) {
                System.out.print("Insuficiente");
            }

            if ((media >= 5) && (media < 6)) {
                System.out.print("Suficiente");
            }

            if ((media >= 6) && (media < 7)) {
                System.out.print("Bien");
            }

            if ((media >= 7) && (media < 9)) {
                System.out.print("Notable");
            }

            if (media >= 9) {
                System.out.print("Sobresaliente");
            }

        }


    }
}
