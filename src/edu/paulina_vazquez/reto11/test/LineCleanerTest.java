package edu.paulina_vazquez.reto11.test;

import edu.paulina_vazquez.reto11.process.LineCleaner;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LineCleanerTest {
    /**
     * Prueba unitaria para verificar si una línea sin
     * caracteres especiales se limpia correctamente.
     * Se proporciona una línea sin caracteres especiales
     * y se espera que el resultado de limpiar la línea
     * sea igual a la línea original.
     */
    @Test
    public void limpiarLineaSinCaracteresEspecialesTest() {
        String linea = "Esto es una prueba sin caracteres especiales";
        String cleanedLine = LineCleaner.limpiarLinea(linea);
        assertEquals("La línea limpia debería ser igual a la línea original", linea, cleanedLine);
    }
    /**
     * Prueba unitaria para verificar si una línea sin
     * caracteres especiales se limpia correctamente.
     * Se proporciona una línea sin caracteres especiales
     * y se espera que el resultado de limpiar la línea
     * sea igual a la línea original.
     * @throws java.lang.Exception si ocurre algún error
     * durante la ejecución de la prueba.
     */
    @Test
    public void limpiarLineaConCaracteresEspecialesTest() {
        String linea = "¡Hola, cómo estás? Espero que bien.";
        String expectedCleanedLine = "hola como estas espero que bien";
        String cleanedLine = LineCleaner.limpiarLinea(linea);
        assertEquals("La línea limpia no coincide con la línea esperada", expectedCleanedLine, cleanedLine);
    }
    /**
     * Prueba si las líneas vacías se limpian correctamente.
     * Se proporciona una lista de líneas que contienen solo
     * espacios en blanco o están vacías.
     * Se espera que el resultado de limpiar estas líneas
     * sea una lista vacía.
     * @throws Exception si ocurre algún error durante la
     * ejecución de la prueba.
     */
    @Test
    public void limpiarLineasConLineasVaciasTest() {
        List<String> lineas = new ArrayList<>();
        lineas.add("");
        lineas.add(" ");
        lineas.add("  ");
        List<String> lineasLimpias = LineCleaner.limpiarLineas(lineas);
        assertEquals("Debería devolver una lista vacía", 0, lineasLimpias.size());
    }
    /**
     * Prueba si las líneas normales se limpian correctamente.
     * Se proporciona una lista de líneas que contienen texto
     * alfanumérico y algunos caracteres especiales.
     * Se espera que el resultado de limpiar estas líneas sea
     * una lista de líneas con texto en minúsculas.
     */
    @Test
    public void limpiarLineasConLineasNormalesTest () {
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
    /**
     * Prueba si las líneas con caracteres no alfabéticos
     * se limpian correctamente.
     * Se proporciona una lista de líneas que contienen
     * caracteres no alfabéticos, como símbolos y números.
     * Se espera que el resultado de limpiar estas líneas
     * sea una lista de líneas con solo texto alfabético
     * en minúsculas.
     */
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
