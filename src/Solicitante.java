/**
 * Clase Solicitante
 * Se encarga de recoger los datos del usuario y validarlos
 * Esto era parte del main y se ha trasladado a esta clase para hacer el main más limpio
 *
 * Autor: Juanma Segura - DAM
 * Fecha: 24/01/2025
 */

import java.util.Scanner;

public class Solicitante {

    public static int solicitarNuss(Scanner sc){
        int nuss = 0;
        while(nuss < Proyecto1.MIN_NUSS || nuss > Proyecto1.MAX_NUSS){
            System.out.println("Introduce NUSS (6 digitos)");
            System.out.print("NUSS: ");
            if (sc.hasNextInt()) {  //Validamos que el dato introducido sea un numero
                nuss = sc.nextInt();
                sc.nextLine();
             if (nuss < Proyecto1.MIN_NUSS || nuss > Proyecto1.MAX_NUSS) {
                 System.out.println("ERROR: El valor tiene que ser entre " + Proyecto1.MIN_NUSS + " y " + Proyecto1.MAX_NUSS);
             }
            } else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();  //Limpiamos el buffer en linea
            }

        }
        return nuss;
    }

    public static byte solicitarSintoma(Scanner sc){
        byte sintoma = -1;
        while (sintoma < 0 || sintoma > 3) {
            System.out.println("¿Sintoma?: ");
            System.out.println("\tDolor (0)");
            System.out.println("\tLesion Traumatica (1)");
            System.out.println("\tFiebre Alta (2)");
            System.out.println("\tConfusion o desoriencion (3)");
            System.out.print("Sintoma: ");
            if (sc.hasNextByte()) {
                sintoma = sc.nextByte();
                sc.nextLine();
                if(sintoma < 0 || sintoma > 3){
                    System.out.println("ERROR: El valor tiene que ser entre 0 y 3");
                }
            } else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();

            }

        }
        return sintoma;
    }

    public static byte solicitarExploracion(Scanner sc, byte sintoma){
        byte exploracion = -1;
        String[][] exploraciones = {
            {"Dolor toracico", "Dolor abdominal", "Dolor de cabeza", "Migraña"},
            {"Fractura osea", "Herida de bala", "Quemadura", "Lesion cerebral traumatica"},
            {"Neumonia", "Meningitis", "Infeccion viral", "Reaccion alergica"},
            {"Intoxicación por drogas o alcohol", "Deshidratación severa", "Accidente cerebrovascular", "Hipoglucemia severa"}
        };
        while(exploracion < 0 ||exploracion > 3){
            System.out.println("¿Exploracion?");
           for(int i=0;i<4;i++){
               System.out.println("\t" + exploraciones[sintoma][i] + " (" + i + ")");
           }
            System.out.println("Exploracion: ");
            if (sc.hasNextByte()) {
                exploracion = sc.nextByte();
             if(exploracion<0 || exploracion>3) {
                 System.out.println("ERROR: El valor tiene que ser entre 0 y 3");
             }
            }else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();
            }

        }
        return exploracion;
    }

    public static byte solicitarPrioridad(Scanner sc){
        byte prioridad = -1;
        while(prioridad < Proyecto1.MIN_PRIORIDAD || prioridad > Proyecto1.MAX_PRIORIDAD){
            System.out.println("Nivel de prioridad? (0-5): ");
            if (sc.hasNextByte()){
                prioridad = sc.nextByte();
             if (prioridad < Proyecto1.MIN_PRIORIDAD || prioridad > Proyecto1.MAX_PRIORIDAD) {
                 System.out.println("ERROR: El valor tiene que ser entre " + Proyecto1.MIN_PRIORIDAD + " y " + Proyecto1.MAX_PRIORIDAD);
             }
            }else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();
            }

        }
        return prioridad;
    }

    public static byte solicitarTemperatura(Scanner sc){
        byte temperatura = -1;
        while(temperatura < Proyecto1.MIN_TEMP || temperatura > Proyecto1.MAX_TEMP){
            System.out.println("Introduce la temperatura (30-45): ");
            if (sc.hasNextByte()){
                temperatura = sc.nextByte();
             if (temperatura < Proyecto1.MIN_TEMP || temperatura > Proyecto1.MAX_TEMP) {
                 System.out.println("ERROR: El valor tiene que ser entre " + Proyecto1.MIN_TEMP + " y " + Proyecto1.MAX_TEMP);
             }

            }else {
                System.out.println("ERROR: Introduce un valor numerico");
                sc.nextLine();
            }

        }
        return temperatura;
    }

}
