package edu.rico.funciones.Ejercicio1;

public class CalculadoraFutbol {

    public static int calcularPuntos(int victorias, int empates){
        return victorias * 3 + empates;
    }

    public static boolean esDescenso(int puntosTotales){
        if(puntosTotales < 40){
            return true;
        }else{
            return false;
        }
        //return puntosTotales < 40;
    }

    public static void obtenerMensajeAficion(String nombreEquipo){
        System.out.println("Vamos! " + nombreEquipo + " a ganar!!!");
    }
}
