package edu.paulina_vazquez.reto9.process;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class LineCleaner {
    public static String limpiarLinea(String linea) {
        linea = linea.toLowerCase().replaceAll("[^\\p{IsAlphabetic}\\s]", "");
        linea = Normalizer.normalize(linea, Normalizer.Form.NFD);
        return linea.replaceAll("[^\\p{ASCII}]", "");
    }

    public static List<String> limpiarLineas(List<String> lineas) {
        List<String> lineasLimpias = new ArrayList<>();
        for (String linea : lineas) {
            lineasLimpias.add(limpiarLinea(linea));
        }
        return lineasLimpias;
    }
}
