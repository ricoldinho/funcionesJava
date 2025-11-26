package edu.rico.funciones.Ejercicio3;

import java.util.Scanner;

public class Taquilla {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double precio = 0.0;
        System.out.println("Introduzca su edad: ");
        int edad = leerIntEntrada();
        System.out.println("Introduzca que pelicula quiere ver: ");
        String pelicula = leerStringEntrada();
        System.out.println("¿Es dia del espectador?: (true/false) ");
        boolean esDiaEspectador = leerBooleanEntrada();
        precio = GestorDeEntradas.calcularPrecioFinal(edad, esDiaEspectador);
        System.out.println("Introduzca su butaca: ");
        int butaca = teclado.nextInt();
        GestorDeEntradas.imprimirTicket(pelicula, butaca, precio);

    }

    private static int leerIntEntrada(){
        return teclado.nextInt();
    }
    private static String leerStringEntrada(){
        return teclado.next();
    }
    private static boolean leerBooleanEntrada(){
        return teclado.nextBoolean();
    }
}
