package edu.paulina_vazquez.reto8.ui;

import edu.paulina_vazquez.reto8.process.*;

import java.util.Scanner;

public class CLI {

    /**
     * En esta clase se muestran las opciones de idioma y dependiendo de la que
     * el usuario elija se mostraran los textos en el lenguaje que corresponda,
     * ademas se captura la operacion que se desea realizar y se direcciona el
     * proceso.
     */

    public static void showMenu(){

        /**
         * El usuario escoge el idioma en que esta la computadora y se le muestra
         * el menú de opciones.
         */

        System.out.println("Elija el idioma");
        System.out.println("Choose the language");
        System.out.println("1. Español");
        System.out.println("2. English");

        Scanner scanner = new Scanner(System.in);
        int opcionDeIdioma = scanner.nextInt();

        switch (opcionDeIdioma) {
            case 1:
                Textos.setEspañol();
                break;
            case 2:
                Textos.setEnglish();
                break;
            default:
                System.out.println("Opcion no valida, por favor intentelo de nuevo.");
                System.out.println("Invalid option, please try again.");
                return;
        }

        System.out.println(Textos.BIENVENIDA);
        System.out.println(Textos.MENU);

        /**
         * Dependiendo de la opcion seleccionada por el usuario se escoge la clase que
         * llevara acabo el proceso hasta mostrar el resultado.
         */

        scanner = new Scanner(System.in);
        int opcionDeOperacion = scanner.nextInt();
        int resultado;

        OperacionAritmetica operacion = null;

        /**
         * Se redirecciona el proceso a la clase corresppondiente.
         */

        switch (opcionDeOperacion) {
            case 1:
                operacion = new Suma();
                break;
            case 2:
                operacion = new Resta();
                break;
            case 3:
                operacion = new Division();
                break;
            case 4:
                operacion = new Multiplicacion();
                break;
            case 5:
                operacion = new Modulo();
                break;
            case 6:
                operacion = new Potencia();
                break;
            case 7:
                operacion = new Raiz();
                break;
            case 8:
                operacion = new Logaritmo();
                break;
            default:
                System.out.println(Textos.OPCION_INVALIDA);
        }

        /**
         * Se capturan los datos del usuario para realizar las operaciones.
         */

        System.out.print(Textos.INGRESO_PRIMER_NUMERO);
        int x = scanner.nextInt();
        System.out.print(Textos.INGRESO_SEGUNDO_NUMERO);
        int y = scanner.nextInt();

        /**
         * Se imprime en pantalla el resultado de la operacion realizada.
         */

        resultado = operacion.calcular(x, y);
        System.out.println(Textos.RESULTADO + resultado);

        scanner.close();
    }
}

