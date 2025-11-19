package edu.rico.funciones.notasClase;


import edu.rico.funciones.utilidades.Utilidades;

public class Principal {

    public static void main(String[] args) {

        int[] arrNotas = new int[Utilidades.elegirTamanhoArray()];
        Utilidades.imprimirCabecera();
        int opcion;
        do{
            Utilidades.imprimirMenu();
            opcion = Utilidades.leerOpcion();
            switch(opcion){
                case 1:
                    //TODO: arreglad código para hacer lo máximo posible dentro de la función calificarAlumno()
                    int pos;
                    do{
                        System.out.println("Elige en qué posición vas a evaluar.");
                        pos = Utilidades.elegirPosicion(arrNotas);
                    }while(pos == -2);
                    System.out.println("Elige cómo calificar con notas de 0 a 10");
                    int nota = Utilidades.elegirNota();
                    if(Utilidades.calificarAlumno(arrNotas, pos, nota)){
                        System.out.println("ALUMNO EVALUADO con la nota: " + nota + " en la posicion " + pos);
                    }
                    break;
                case 2:
                    System.out.println("La media de la clase es: " + Utilidades.calcularLaMedia(arrNotas));
                    break;
                case 3:
                    System.out.println("La nota mayor de la clase es: " + Utilidades.calcularLaMayorNota(arrNotas));
                    break;
                case 4:
                    System.out.println("La nota menor de la clase es: " + Utilidades.calcularLaMenorNota(arrNotas));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }while(opcion != 5);
    }
}
