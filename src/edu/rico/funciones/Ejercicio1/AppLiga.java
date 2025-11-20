package edu.rico.funciones.Ejercicio1;

import java.util.Scanner;

public class AppLiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un nombre de equipo: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el número de victorias: ");
        int victorias = sc.nextInt();
        System.out.println("Introduce el número de empates: ");
        int empates = sc.nextInt();

        CalculadoraFutbol.obtenerMensajeAficion(nombre);
        int puntos = CalculadoraFutbol.calcularPuntos(victorias, empates);
        System.out.println("El número de puntos conseguidos es: " + puntos);
        if(CalculadoraFutbol.esDescenso(puntos)){
            System.out.println("El equipo ha descendido");
        }else {
            System.out.println("EL equipo mantiene la categoría");
        }
    }

}
