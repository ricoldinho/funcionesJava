package edu.rico.funciones.Ejercicio2;

public class ConversorEspacial {
    private static final double CAMBIO_DOLAR = 1.6;
    private static final double CAMBIO_EURO = 0.9;

    public static void mostrarTasasDeCambio(){
        System.out.println("1 Crédito => " + CAMBIO_DOLAR +" Dolares | 1 Crédito => " + CAMBIO_EURO + " Euros");
    }

    public static double dolaresACreditos(double dolares){
        return dolares / CAMBIO_DOLAR;
    }

    public static double eurosACreditos(double euros){
        return euros / CAMBIO_EURO;
    }

    public static boolean validarCompra(double precio, double saldo){
        return precio >= saldo;
    }


}
