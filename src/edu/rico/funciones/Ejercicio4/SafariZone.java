package edu.rico.funciones.Ejercicio4;

import java.util.Scanner;

public class SafariZone {
    public static void main(String[] args) {

        System.out.println("ESTAS CAMINANDO POR LA HIERBA");
        String nombrePokemon = MotorSuerte.generarAparicion();
        System.out.println("Ha aparecido un pokemon: " + nombrePokemon);
        System.out.println("¿Qué ball quieres usar para atraparlo? (Pokeball/Superball)");
        String tipoBall = leerStringEntrada();
        int indiceCaptura = MotorSuerte.calculoCaptura(tipoBall);
        if(MotorSuerte.capturaPokemon(indiceCaptura)){
            System.out.println("Has capturado el pokemon " + nombrePokemon + "!!!!");
        }else{
            System.out.println("Has perdido");
        }
    }


    private static String leerStringEntrada(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
