package edu.rico.funciones.Ejercicio3;

public class GestorDeEntradas {

    private static final double PRECIO_BASE = 10.0;

    public static double getPrecioBase(){
        return PRECIO_BASE;
    }

    public static double calcularPrecioFinal(int edad, boolean esDiaEspectador){
        double precioFinal = 0.0;
        if(edad >= 65){
            precioFinal = PRECIO_BASE * 0.5;
        }else if(esDiaEspectador){
                precioFinal = PRECIO_BASE * 0.8;
        }else {
            precioFinal = PRECIO_BASE;
        }
        return precioFinal;
    }

    public static void imprimirTicket(String pelicula, int butaca, double precio){
        System.out.println("*********************************");
        System.out.println("**  " + pelicula + " **");
        System.out.println("** " + " sitio: " + butaca + " - " + precio +" euros" + " **");
        System.out.println("*********************************");
    }







}
