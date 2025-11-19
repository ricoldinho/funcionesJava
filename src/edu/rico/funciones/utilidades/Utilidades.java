package edu.rico.funciones.utilidades;

import java.util.Scanner;

public class Utilidades {

    public static void main(String[] args) {

    }


    public static int leerOpcion(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int elegirTamanhoArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el tamaño del array");
        return sc.nextInt();
    }

    public static int elegirPosicion(int[] arrNotas){
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        if(pos > arrNotas.length || pos < 0){
            System.out.println("POSICIÓN INCORRECTA, INSERTE UNA CORRECTA");
            return -2;
        }
        return pos;
    }

    public static int elegirNota(){
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        if(nota > 10 || nota < 0){
            System.out.println("NOTA INCORRECTA");
        }
        return nota;
    }

    public static void imprimirMenu(){
        System.out.println("-----MENU---ESCOGE UNA OPCION------");
        System.out.println("-----------------------------------");
        System.out.println("1 - PONER NOTA");
        System.out.println("2 - CALCULAR LA MEDIA");
        System.out.println("3 - CALCULAR LA MAYOR NOTA");
        System.out.println("4 - CALCULAR LA MENOR NOTA");
        System.out.println("5 - SALIR");
        System.out.println("-----------------------------------");
    }

    public static void imprimirCabecera(){
        System.out.println("-----------------------------------");
        System.out.println("--- EMPIEZA LA EVALUACIÓN----------");
        System.out.println("-----------------------------------");
    }

    public static int calcularLaMenorNota(int[] arrNotas){
        int menor = 10;
        for(int i = 0 ; i < arrNotas.length; i++ ){
            if(arrNotas[i] < menor){
                menor = arrNotas[i];
            }
        }
        return menor;
    }

    public static int calcularLaMayorNota(int[] arrNotas){
        int mayor = 0;
        for(int i = 0; i < arrNotas.length; i++){
            if(arrNotas[i] > mayor){
                mayor = arrNotas[i];
            }
        }
        return mayor;
    }

    public static double calcularLaMedia(int[] arrNotas){
        int sumaNotas = 0;
        for(int i = 0; i < arrNotas.length; i++){
            sumaNotas += arrNotas[i]; //sumaNotas = sumaNotas + arrNotas[i]
        }
        return (double) sumaNotas / arrNotas.length;
    }

    public static boolean calificarAlumno(int[] arrNotas, int pos, int nota){
        if((nota >= 0 && nota <= 10) && (pos >= 0 && pos < arrNotas.length)){
            arrNotas[pos] = nota;
            return true;
        }else{
            System.out.println("NO SE PUEDE INSERTAR LA NOTA");
            return false;
        }

    }

    public static void pintarContenidoArrayNotas(int[] arrNotas){
        for(int i = 0; i < arrNotas.length; i++){
            System.out.print(arrNotas[i] + " | ");
        }
        System.out.println("\n");
    }
}
