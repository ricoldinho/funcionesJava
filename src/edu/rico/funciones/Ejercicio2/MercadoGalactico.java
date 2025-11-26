package edu.rico.funciones.Ejercicio2;

import java.util.Scanner;

public class MercadoGalactico {
    public static void main(String[] args) {
        ConversorEspacial.mostrarTasasDeCambio();
        Scanner teclado  = new Scanner(System.in);
        System.out.println("¿Cuántos euros tienes?: ");
        double euros = teclado.nextDouble();
        double creditos = ConversorEspacial.eurosACreditos(euros);
        double precioNave = 500;
        if(ConversorEspacial.validarCompra(precioNave, creditos)){
            System.out.println("Eres dueño de una nave interestelar!!");
        }else{
            System.out.println("Sigue ahorrando para poder comprarla otro dia.");
        }


    }
}
