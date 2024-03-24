package edu.paulina_vazquez.reto8.ui;

public class English extends Textos {

    /**
     * Esta clase es la encargada de almacenar las variables
     * que se usan para mostrar textos al usuario en espanol,
     * hereda de textos.
     */

    static final String BIENVENIDA = "Welcome to the arithmetic calculator.";
    static final String MENU = "Choose the operation you want to do:\n" +
            "1. Addirion\n" +
            "2. Subtraction\n" +
            "3. Division\n" +
            "4. Multiplication\n" +
            "5. Module\n" +
            "6. Potency\n" +
            "7. Root\n" +
            "8. Logarithm";
    static final String OPCION_INVALIDA = "Invalid option, please try again.";
    static final String INGRESO_PRIMER_NUMERO = "Enter the first number: ";
    static final String INGRESO_SEGUNDO_NUMERO = "Enter the second number: ";
    static final String RESULTADO = "The result of the operation is: ";
    static final String ERROR_DIVISION = "Cannot divide by zero.";
    static final String ERROR_MODULO = "The module cannot be zero.";
    static final String ERROR_LOGARITMO = "The logarithm is not defined for numbers not" +
            "positives or bases less than or equal to 1.";

}
