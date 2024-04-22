package edu.paulina_vazquez.reto11.process;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class LineCleaner {
    /**
     * Esta clase se encarga de limpar las cadenas mediante
     * la eliminación de los caracteres especificados en las
     * indicaciones.
     */
    public static String limpiarLinea(String linea) {
        /**
         * Convierte la línea a minúsculas y elimina caracteres no alfabéticos y acentos,
         * y elimina los caracteres especiales y acentos que no son ASCII.
         */
        linea = linea.toLowerCase().replaceAll("[^\\p{IsAlphabetic}\\s]", "");
        linea = Normalizer.normalize(linea, Normalizer.Form.NFD);
        return linea.replaceAll("[^\\p{ASCII}]", "");
    }

    public static List<String> limpiarLineas(List<String> lineas) {
        /**
         * Limpia una lista de líneas de texto eliminando caracteres
         * no alfabéticos y convirtiendo el texto a minúsculas.
         */
        List<String> lineasLimpias = new ArrayList<>();
        for (String linea : lineas) {
            lineasLimpias.add(limpiarLinea(linea));
        }
        return lineasLimpias;
    }
}
