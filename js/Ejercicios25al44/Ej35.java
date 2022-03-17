package Ejercicios25al44;

import java.util.Scanner;

public class Ej35 {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.print("A continuación deberá introducir una hora del día, ");
        System.out.println("primero introducirá la hora y luego los minutos.");

        System.out.print("hora: ");
        int hora = Integer.parseInt(s.nextLine());

        System.out.print("minuto: ");
        int minuto = Integer.parseInt(s.nextLine());

        int segundosTranscurridos = (hora * 3600) + (minuto * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;

        //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minuto, segundosHastaMedianoche);
    }
}
