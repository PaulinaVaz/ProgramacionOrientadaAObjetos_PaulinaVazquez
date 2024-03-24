package edu.paulina_vazquez.reto8.ui;

public class Español extends Textos {

    /**
     * Esta clase es la encargada de almacenar las variables
     * que se usan para mostrar textos al usuario en espanol,
     * hereda de textos.
     */

    static final String BIENVENIDA = "Bienvenido a la calculadora aritmética.";
    static final String MENU = "Elija la operación que desea realizar:\n" +
            "1. Suma\n" +
            "2. Resta\n" +
            "3. División\n" +
            "4. Multiplicación\n" +
            "5. Módulo\n" +
            "6. Potencia\n" +
            "7. Raíz cuadrada\n" +
            "8. Logaritmo";
    static final String OPCION_INVALIDA = "Opción no válida, por favor inténtelo de nuevo.";
    static final String INGRESO_PRIMER_NUMERO = "Ingrese el primer número: ";
    static final String INGRESO_SEGUNDO_NUMERO = "Ingrese el segundo número: ";
    static final String RESULTADO = "El resultado de la operación es: ";
    static final String ERROR_DIVISION = "No se puede dividir por cero.";
    static final String ERROR_MODULO = "El módulo no puede ser cero.";
    static final String ERROR_LOGARITMO = "El logaritmo no está definido para números no " +
            "positivos ni bases menores o iguales a 1.";
}
