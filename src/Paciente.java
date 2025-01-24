/**
 * Clase Paciente
 *
 * Clase que representa a un paciente en el sistema de triaje.
 *
 * Atributos:
 * - nuss: NUSS del paciente.
 * - sintoma: Síntoma del paciente.
 * - exploracion: Exploración del paciente.
 * - nivelPrioridad: Nivel de prioridad del paciente.
 * - temperatura: Temperatura del paciente.
 *
 * Agregamos los setters y getters para cada atributo
 *
 * Métodos:
 * - mostrarResumen(): Muestra un resumen de los datos del paciente.
 *
 * Autor: Juanma Segura - DAM
 * Fecha: 24/01/2025
 */

public class Paciente {
    Integer nuss;
    Byte sintoma;
    Byte exploracion;
    Byte nivelPrioridad;
    Byte temperatura;

    public Integer getNuss() {
        return nuss;
    }

    public void setNuss(Integer nuss) {
        this.nuss = nuss;
    }

    public Byte getSintoma() {
        return sintoma;
    }

    public void setSintoma(Byte sintoma) {
        this.sintoma = sintoma;
    }

    public Byte getExploracion() {
        return exploracion;
    }

    public void setExploracion(Byte exploracion) {
        this.exploracion = exploracion;
    }

    public Byte getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(Byte nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public Byte getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Byte temperatura) {
        this.temperatura = temperatura;
    }
public void mostrarResumen() {
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
}
}
