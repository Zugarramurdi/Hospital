
import java.util.Scanner;

public class Proyecto1 {
    //Declaramos constantes
    private static final int MIN_NUSS = 100000, MAX_NUSS = 999999, MIN_PRIORIDAD = 0, MAX_PRIORIDAD = 5, MIN_TEMP = 27, MAX_TEMP = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos variables
        int nuss = 0;
        byte sintoma = -1, exploracion = -1, nivelPrioridad = -1, temperatura = -1;

        //Pedimos NUSS al paciente, el bucle hace que no se cierre el programa si pone un numero incorrecto, con verificacion de minimo y maximo
        while (nuss < MIN_NUSS || nuss > MAX_NUSS) {

            System.out.println("Introduce NUSS (6 digitos)");
            nuss = sc.nextInt();
            if (nuss < MIN_NUSS || nuss > MAX_NUSS) {
                System.out.println("ERROR: El valor tiene que ser entre "+ MIN_NUSS+" y "+MAX_NUSS);
            }

        }
        //Solicitamos sintomas, tambien con bucle para evitar que el programa cierre en caso de error del paciente, usando como condicion "cicloSintoma" para no usar break, con verificacion de minimo y maximo
        while (sintoma < 0 || sintoma > 3) {
            System.out.println("¿Sintoma?: ");
            System.out.println("Dolor (0)");
            System.out.println("Lesion Traumatica (1)");
            System.out.println("Fiebre Alta (2)");
            System.out.println("Confusion o desoriencion (3)");
            System.out.print("Sintoma: ");
            sintoma = sc.nextByte();
            if (sintoma < 0 || sintoma > 3) {
                System.out.println("ERROR: El valor tiene que ser entre 0 y 3");
            }
        }
        //Con switch desplegamos otro menú para segun que sintoma haya tenido el paciente le saldran diferentes opciones de exploracion
        switch (sintoma) {
            case 0://Dolor
                while(exploracion < 0 || exploracion > 3) {
                    System.out.println("¿Exploracion?");
                    System.out.println("Dolor toracico (0)");
                    System.out.println("Dolor abdominal (1)");
                    System.out.println("Dolor de cabeza (2)");
                    System.out.println("Migraña (3)");
                    exploracion = sc.nextByte();
                    if (exploracion < 0 || exploracion > 3){
                    System.out.println("ERROR: Introduce el valor valido del 0 al 3");
                    }
                }
                break;

            case 1: //Lesion Traumatica
                while(exploracion < 0 || exploracion > 3) {
                    System.out.println("Fractura osea (0)");
                    System.out.println("Herida de bala (1)");
                    System.out.println("Quemadura (2)");
                    System.out.println("Lesion cerebral traumatica (3)");
                    exploracion = sc.nextByte();
                    if (exploracion < 0 || exploracion > 3){
                    System.out.println("ERROR: Introduce el valor valido del 0 al 3");
                    }
                }
                break;

            case 2://Fiebre alta
                while(exploracion < 0 || exploracion > 3) {
                    System.out.println("Neumonia (0)");
                    System.out.println("Meningitis (1)");
                    System.out.println("Infeccion viral (2)");
                    System.out.println("Reaccion alergica (3)");
                    exploracion = sc.nextByte();
                    if (exploracion < 0 || exploracion > 3) {
                        System.out.println("ERROR: Introduce el valor valido del 0 al 3");
                    }
                }
                break;

            case 3://Confusion o desorientacion
                while(exploracion < 0 || exploracion > 3) {
                    System.out.println("Intoxicacion por drogas o alcohol (0)");
                    System.out.println("Deshidratacion severa (1)");
                    System.out.println("Accidente cerebrovascular (2)");
                    System.out.println("Hipoglucemia severa (3)");
                    exploracion = sc.nextByte();
                    if (exploracion < 0 || exploracion > 3) {
                        System.out.println("ERROR: Introduce el valor valido del 0 al 3");
                    }
                }
                break;
        }

        //Validacion de prioridad
        while (nivelPrioridad < 0 || nivelPrioridad > 5) {
            System.out.print("Nivel de prioridad? (0-5): ");
            nivelPrioridad = sc.nextByte();
            if (nivelPrioridad < 0 || nivelPrioridad > 5){
                System.out.println("ERROR: El valor tiene que ser entre "+ MIN_PRIORIDAD+" y "+MAX_PRIORIDAD);
            }
        }

        //Validacion de temperatura
        while (temperatura < 27 || temperatura > 45){
            System.out.print("Temperatura actual? (27-45): ");
            temperatura = sc.nextByte();
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
