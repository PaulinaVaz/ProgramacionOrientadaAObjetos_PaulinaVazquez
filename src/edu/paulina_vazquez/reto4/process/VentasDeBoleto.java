package edu.paulina_vazquez.reto4.process;

import edu.paulina_vazquez.reto4.data.DatosDeVenta;
import java.util.ArrayList;
import java.util.Scanner;

public class VentasDeBoleto {
    private ArrayList<DatosDeVenta> ventas = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);
    public void venderBoleto() {
        System.out.println("Ingrese el nombre del comprador:");
        String nombreComprador = scanner.nextLine();

        System.out.println("Ingrese la cantidad de boletos:");
        int cantidadBoletos = Integer.parseInt(scanner.nextLine());

        DatosDeVenta venta = new DatosDeVenta();
        venta.listarDatosDeVenta(nombreComprador, cantidadBoletos);

        for (int i = 0; i < cantidadBoletos; i++) {
            System.out.println("Ingrese el nombre del pasajero adicional:");
            String nombrePasajero = scanner.nextLine();
            venta.agregarPasajeroAdicional(nombrePasajero);
        }

        ventas.add(venta);
        System.out.println("Venta realizada con éxito. Importe total: $" + venta.calcularImporte());
    }

    public void mostrarVentas() {
        System.out.println("Listado de ventas:");
        for (DatosDeVenta venta : ventas) {
            System.out.println("Comprador: " + venta.getNombreDelComprador());
            System.out.println("La cantidad de pasajeros es: " + venta.getCantidadDePasajeros());
            System.out.println("Los pasajeros adicionales son: " + venta.getPasajerosAdicionales());
            System.out.println("El importe total: $" + venta.calcularImporte());
        }
    }
}
