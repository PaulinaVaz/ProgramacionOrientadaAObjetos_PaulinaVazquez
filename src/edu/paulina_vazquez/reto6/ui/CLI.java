package edu.paulina_vazquez.reto6.ui;

import edu.paulina_vazquez.reto6.data.Categoria;
import edu.paulina_vazquez.reto6.data.Empleado;
import edu.paulina_vazquez.reto6.process.CalculadoraDeNomina;

import java.util.Scanner;

public class CLI {
    /**
     * Esta clase se encarga de capturar los datos de los empleados
     * y mostrar el menu de opciones disponibles por realizar,
     * ademas con estos se realizan las opciones deseadas segun el
     * usuario de recursos humanos elija.
     */
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Generador de nomina");

        System.out.print("Ingrese la cantidad de empleados a capturar: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine();

        CalculadoraDeNomina nomina = new CalculadoraDeNomina();

        /**
         * Se ingresan los datos y se asignan sus clasificaciones correspondientes.
         */

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Captura de datos del empleado " + (i + 1));

            System.out.print("Nombre completo: ");
            String nombre = scanner.nextLine();

            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();

            System.out.print("Horas extras trabajadas: ");
            int horasExtras = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            System.out.print("Fecha de nacimiento: ");
            String fechaNacimiento = scanner.nextLine();

            System.out.println("Elija la categoría asignada:");
            System.out.println("1. Empleado ventas");
            System.out.println("2. Administrador");
            System.out.println("3. Gerente");
            int categoriaSeleccionada = scanner.nextInt();
            scanner.nextLine();

            Categoria categoria;
            switch (categoriaSeleccionada) {
                case 1:
                    categoria = new Categoria("Empleado ventas", "EV", 100.0,
                            50.0);
                    break;
                case 2:
                    categoria = new Categoria("Administrador", "ADM", 180.0,
                            100.0);
                    break;
                case 3:
                    categoria = new Categoria("Gerente", "GER", 250.0,
                            150.0);
                    break;
                default:
                    System.out.println("Opción inválida. Se asignará categoría por defecto.");
                    categoria = new Categoria("Empleado ventas", "EV", 100.0,
                            50.0);
            }

            Empleado empleado = new Empleado(nombre, horasTrabajadas, horasExtras, telefono, fechaNacimiento,
                    categoria);
            nomina.agregarEmpleado(empleado, i);
        }
    /**
     * Se muestra el reporte final de las nominas.
    */
    System.out.println("Reporte de nómina:");
    System.out.println("Nómina de la empresa: $" + nomina.calcularTotalNomina());
    System.out.println("Sueldo normal: $" + nomina.calcularTotalSueldoNormal());
    System.out.println("Horas extras: $" + nomina.calcularTotalPagoHorasExtras());
    System.out.println("Horas laboradas en la empresa: " + nomina.calcularTotalHorasLaboradas());
    System.out.println("Personas que tienen horas extras: " + nomina.contarPersonasConHorasExtras());
    System.out.println("Personas que no tienen horas extras: " + nomina.contarPersonasSinHorasExtras());

    scanner.close();
    }
}

