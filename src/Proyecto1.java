/**
 * Proyecto 1
 * Autor: Juanma Segura - DAM
 * Programa que simula un sistema de triaje de emergencias médicas
 * El programa solicita al usuario los siguientes datos:
 * - NUSS (Número Único de Seguro Social)
 * - Síntoma (Dolor, Lesión Traumática, Fiebre Alta, Confusión o Desorientación)
 * - Exploración (Dependiendo del síntoma)
 * - Nivel de Prioridad (0-5)
 * - Temperatura Actual (27 - 45 °C)
 * El programa valida los datos introducidos por el usuario y muestra un resumen de los mismos.
 * El programa utiliza bucles para solicitar los datos y validarlos.
 * El programa utiliza arrays para almacenar los síntomas y exploraciones.
 * El programa utiliza sistema de validación de datos para evitar errores del usuario.
 *
 *UPDATE - 24/01/2025 - Programación Orientada a Objetos
 * Se ha añadido la clase Solicitante para solicitar los datos al usuario y validarlos
 * Se ha añadido la clase Paciente para almacenar los datos del paciente y mostrar un resumen de los datos
 * Lo que hace que el main sea más limpio y fácil de leer
 *
 * Se mantienen las constantes en el main péro se han declarado en public para poder ser utilizadas en otras clases
 **/


import java.util.Scanner;

public class Proyecto1 {
    //Declaramos constantes - estas constantes se pueden utilizar en otras clases, ya que son public
    public static final int MIN_NUSS = 100000, MAX_NUSS = 999999, MIN_PRIORIDAD = 0, MAX_PRIORIDAD = 5, MIN_TEMP = 27, MAX_TEMP = 45;

    public static void main(String[] args) {
        //Instanciamos un objeto de la clase Scanner, Paciente y Solicitante
        Scanner sc = new Scanner(System.in);
        Paciente paciente1 = new Paciente();
        Solicitante solicitante = new Solicitante();

        System.out.println("\n\n\t\t*** Bienvenido al sistema de triaje de emergencias *** \n Proporcione los siguientes datos para determinar la prioridad de atención del paciente.");

        /*Solicitamos los datos al usuario y los almacenamos en el objeto paciente1 de la clase Paciente
        mediante los métodos set de la clase Paciente, la clase Solicitante se encarga de solicitar los datos y validarlos*/
        paciente1.setNuss(solicitante.solicitarNuss(sc));
        paciente1.setSintoma(solicitante.solicitarSintoma(sc));
        paciente1.setExploracion(solicitante.solicitarExploracion(sc, paciente1.getSintoma()));
        paciente1.setNivelPrioridad(solicitante.solicitarPrioridad(sc));
        paciente1.setTemperatura(solicitante.solicitarTemperatura(sc));

        /*Mostramos un resumen de los datos introducidos por el usuario mediante el
        metodo mostrarResumen de la clase Paciente*/
        paciente1.mostrarResumen();

        sc.close();
    }

}
