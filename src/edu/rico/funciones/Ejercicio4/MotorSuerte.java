package edu.rico.funciones.Ejercicio4;

import java.security.SecureRandom;

public class MotorSuerte {

    public static int tirarDado(){
        return (int) (Math.random() * 6) + 1;
    }

    public static String generarAparicion(){
        int numeroAleatorio = calcularDeCeroACien();
        if(numeroAleatorio <= 10){
            return "Pikachu";
        } else if (numeroAleatorio <= 50) {
            return "Pidgey";
        } else {
            return "Rattata";
        }
    }

    public static int calculoCaptura (String tipoBall){
        if(tipoBall.equalsIgnoreCase("Pokeball")){
            return 30;
        } else if (tipoBall.equalsIgnoreCase("SuperBall")) {
            return 50;
        }else{
            System.out.println("Tipo de ball incorrecto");
            return 0;
        }
    }

    public static boolean capturaPokemon(int indiceCaptura){
        return  calcularDeCeroACien() <= indiceCaptura;
    }

    private static int calcularDeCeroACien(){
        return (int) (Math.random() * 100) + 1;
    }
}
