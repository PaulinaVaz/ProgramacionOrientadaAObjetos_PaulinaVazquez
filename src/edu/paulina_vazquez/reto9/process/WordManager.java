package edu.paulina_vazquez.reto9.process;

import edu.paulina_vazquez.reto9.ui.Textos;

import java.io.*;
import java.util.*;

public class WordManager {
    /**
     * Esta clase se encarga de separar, contar y obtener las palabras
     * mas repetidos del archivos seleccionado por el ususario.
     */
    private Map<String, Integer> mapaPalabras;

    public WordManager() {
        /**
         * Constructor de la clase WordManager. Inicializa un nuevo mapa de palabras vacío.
         */
        mapaPalabras = new HashMap<>();
    }

    public void contarPalabras(String archivo) throws IOException {
        /**
         * Lee el contenido de un archivo de texto y cuenta la frecuencia de cada palabra.
         * @param archivo Ruta del archivo de texto a analizar.
         * @throws IOException Si ocurre un error al leer el archivo.
         */
        String rutaArchivo = "/edu/paulina_vazquez/reto9/resources/" + archivo;
        System.out.println("Ruta del archivo: " + rutaArchivo); // Agregar esta línea para depuración
        try (InputStream inputStream = getClass().getResourceAsStream(rutaArchivo)) {
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String linea;
                while ((linea = reader.readLine()) != null) {
                    linea = LineCleaner.limpiarLinea(linea);
                    String[] palabras = linea.split("\\s+");
                    for (String palabra : palabras) {
                        mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            } else {
                throw new FileNotFoundException("Archivo no encontrado: " + rutaArchivo);
            }
        }
    }

    public void imprimirPalabrasMasRepetidas(Textos textos) {

        /**
         * Imprime en pantalla las 10 palabras más repetidas junto con su frecuencia.
         * @param textos Objeto que contiene los textos para la impresión en el idioma seleccionado.
         */

        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<String, Integer> entry : mapaPalabras.entrySet()) {
            heap.offer(entry);
            if (heap.size() > 10) {
                heap.poll();
            }
        }

        List<Map.Entry<String, Integer>> top10 = new ArrayList<>();
        while (!heap.isEmpty()) {
            top10.add(heap.poll());
        }

        for (int i = 0; i < top10.size(); i++) {
            Map.Entry<String, Integer> entry = top10.get(i);
            System.out.println((i + 1) + textos.palabra() + entry.getKey() + textos.repeticiones() + entry.getValue());
        }
    }
}