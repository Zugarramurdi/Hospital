/**
 * Proyecto 1
 * Autor: Juanma Segura - DAM
 * Programa que simula un sistema de triaje de emergencias médicas
 * El programa solicita al usuario los siguientes datos:
 * - NUSS (Número Único de Seguro Social)
 * - Síntoma (Dolor, Lesión Traumática, Fiebre Alta, Confusión o Desorientación)
 * - Exploración (Dependiendo del síntoma)
 * - Nivel de Prioridad (0-5)
 * - Temperatura Actual (27-45°C)
 * El programa valida los datos introducidos por el usuario y muestra un resumen de los mismos.
 * El programa utiliza bucles para solicitar los datos y validarlos.
 * El programa utiliza arrays para almacenar los síntomas y exploraciones.
 * El programa utiliza sistema de validación de datos para evitar errores del usuario.
 **/

import java.util.Scanner;

public class Proyecto1 {
    //Declaramos constantes
    private static final int MIN_NUSS = 100000, MAX_NUSS = 999999, MIN_PRIORIDAD = 0, MAX_PRIORIDAD = 5, MIN_TEMP = 27, MAX_TEMP = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos variables
        int nuss = 0;
        byte sintoma = -1, exploracion = -1, nivelPrioridad = -1, temperatura = -1;

        System.out.println("\n\n\t\t*** Bienvenido al sistema de triaje de emergencias *** \n Proporcione los siguientes datos para determinar la prioridad de atención del paciente.");
        //Pedimos NUSS al paciente, el bucle hace que no se cierre el programa si pone un numero incorrecto, con verificacion de minimo y maximo
        while (nuss < MIN_NUSS || nuss > MAX_NUSS) {

            System.out.println("Introduce NUSS (6 digitos)");
            System.out.print("NUSS: ");
            if (sc.hasNextInt()) {  //Validamos que el dato introducido sea un numero
                nuss = sc.nextInt();
            } else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();  //Limpiamos el buffer en linea
            }
            if (nuss < MIN_NUSS || nuss > MAX_NUSS) {
                System.out.println("ERROR: El valor tiene que ser entre " + MIN_NUSS + " y " + MAX_NUSS);
            }

        }
        //Solicitamos sintomas, tambien con bucle para evitar que el programa cierre en caso de error del paciente, usando como condicion "cicloSintoma" para no usar break, con verificacion de minimo y maximo
        while (sintoma < 0 || sintoma > 3) {
            System.out.println("¿Sintoma?: ");
            System.out.println("\tDolor (0)");
            System.out.println("\tLesion Traumatica (1)");
            System.out.println("\tFiebre Alta (2)");
            System.out.println("\tConfusion o desoriencion (3)");
            System.out.print("Sintoma: ");
            if (sc.hasNextByte()) {
                sintoma = sc.nextByte();
            } else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();
            }
            if (sintoma < 0 || sintoma > 3) {
                System.out.println("ERROR: El valor tiene que ser entre 0 y 3");
            }
        }
        //Con switch desplegamos otro menú para segun que sintoma haya tenido el paciente le saldran diferentes opciones de exploracion
        while (exploracion < 0 || exploracion > 3) {
            System.out.println("¿Exploracion?");
        switch (sintoma) {

                case 0://Dolor
                    System.out.println("\tDolor toracico (0)");
                    System.out.println("\tDolor abdominal (1)");
                    System.out.println("\tDolor de cabeza (2)");
                    System.out.println("\tMigraña (3)");
                    System.out.print("Exploracion: ");
                    break;

                case 1: //Lesion Traumatica
                    System.out.println("\tFractura osea (0)");
                    System.out.println("\tHerida de bala (1)");
                    System.out.println("\tQuemadura (2)");
                    System.out.println("\tLesion cerebral traumatica (3)");
                    System.out.print("Exploracion: ");
                    break;

                case 2://Fiebre alta
                    System.out.println("\tNeumonia (0)");
                    System.out.println("\tMeningitis (1)");
                    System.out.println("\tInfeccion viral (2)");
                    System.out.println("\tReaccion alergica (3)");
                    System.out.print("Exploracion: ");
                    break;

                case 3://Confusion o desorientacion
                    System.out.println("\tIntoxicacion por drogas o alcohol (0)");
                    System.out.println("\tDeshidratacion severa (1)");
                    System.out.println("\tAccidente cerebrovascular (2)");
                    System.out.println("\tHipoglucemia severa (3)");
                    System.out.print("Exploracion: ");

            }if (sc.hasNextByte()) {
                exploracion = sc.nextByte();
            } else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();
            }

            if (exploracion < 0 || exploracion > 3) {
                System.out.println("ERROR: Introduce el valor valido del 0 al 3");
            }
        }


        //Validacion de prioridad
        while (nivelPrioridad < 0 || nivelPrioridad > 5) {
            System.out.print("Nivel de prioridad? (0-5): ");
            if(sc.hasNextByte()) {
                nivelPrioridad = sc.nextByte();
            }else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();
            }
            if (nivelPrioridad < 0 || nivelPrioridad > 5){
                System.out.println("ERROR: El valor tiene que ser entre "+ MIN_PRIORIDAD+" y "+MAX_PRIORIDAD);
            }
        }

        //Validacion de temperatura
        while (temperatura < 27 || temperatura > 45){
            System.out.print("Temperatura actual? (27-45): ");
            if (sc.hasNextByte()){
                temperatura = sc.nextByte();
            }else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();
            }
            if (temperatura < 27 || temperatura > 45){
                System.out.println("ERROR: El valor tiene que ser entre "+ MIN_TEMP+" y "+MAX_TEMP);
            }
        }
        // Resumen de los datos, creando dos arrays uno 1D para sintomas y otro 2D para introducir las exploraciones y posterior impresion de resumen de datos introducidos
        String[] sintomas = {"Dolor", "Lesión Traumática", "Fiebre Alta", "Confusión o Desorientación"};
        String[][] exploraciones = {
                {"Dolor torácico", "Dolor abdominal", "Dolor de cabeza", "Migraña"},
                {"Fractura ósea", "Herida de bala", "Quemadura", "Lesión cerebral traumática"},
                {"Neumonía", "Meningitis", "Infección viral", "Reacción alérgica"},
                {"Intoxicación por drogas o alcohol", "Deshidratación severa", "Accidente cerebrovascular", "Hipoglucemia severa"}
        };

        System.out.println("\nResumen de Datos:");
        System.out.println("NUSS: " + nuss);
        System.out.println("Síntoma: " + sintomas[sintoma]);
        System.out.println("Exploración: " + exploraciones[sintoma][exploracion]);
        System.out.println("Nivel de Prioridad: " + nivelPrioridad);
        System.out.println("Temperatura Actual: " + temperatura + "°C");

        sc.close();
    }

}
