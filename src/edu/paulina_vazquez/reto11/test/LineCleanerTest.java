package edu.paulina_vazquez.reto11.test;

import edu.paulina_vazquez.reto11.process.LineCleaner;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LineCleanerTest {
    @Test
    public void limpiarLineaSinCaracteresEspecialesTest() {
        String linea = "Esto es una prueba sin caracteres especiales";
        String cleanedLine = LineCleaner.limpiarLinea(linea);
        assertEquals("La línea limpia debería ser igual a la línea original", linea, cleanedLine);
    }

    @Test
    public void limpiarLineaConCaracteresEspecialesTest() {
        String linea = "¡Hola, cómo estás? Espero que bien.";
        String expectedCleanedLine = "hola como estas espero que bien";
        String cleanedLine = LineCleaner.limpiarLinea(linea);
        assertEquals("La línea limpia no coincide con la línea esperada", expectedCleanedLine, cleanedLine);
    }
    @Test
    public void limpiarLineasConLineasVacias() {
        List<String> lineas = new ArrayList<>();
        lineas.add("");
        lineas.add(" ");
        lineas.add("  ");
        List<String> lineasLimpias = LineCleaner.limpiarLineas(lineas);
        assertEquals("Debería devolver una lista vacía", 0, lineasLimpias.size());
    }

    @Test
    public void limpiarLineasConLineasNormales() {
        List<String> lineas = new ArrayList<>();
        lineas.add("Esto es una línea normal.");
        lineas.add("Otra línea normal!");
        List<String> lineasLimpias = LineCleaner.limpiarLineas(lineas);
        assertEquals("Debería devolver la misma cantidad de líneas", lineas.size(), lineasLimpias.size());
        for (int i = 0; i < lineas.size(); i++) {
            assertEquals("Las líneas deberían ser iguales después de limpiar", lineas.get(i).toLowerCase(),
                    lineasLimpias.get(i));
        }
    }

    @Test
    public void limpiarLineasConLineasConCaracteresNoAlfabeticos() {
        List<String> lineas = new ArrayList<>();
        lineas.add("Esta línea tiene caracteres especiales: @#&!");
        lineas.add("Otra línea con números: 12345");
        List<String> lineasLimpias = LineCleaner.limpiarLineas(lineas);
        assertEquals("Debería devolver la misma cantidad de líneas", lineas.size(), lineasLimpias.size());
        for (int i = 0; i < lineas.size(); i++) {
            assertEquals("Las líneas deberían ser iguales después de limpiar", "esta línea tiene " +
                    "caracteres especiales", lineasLimpias.get(i));
        }
    }
}
