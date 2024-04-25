package edu.paulina_vazquez.reto11.process;

import edu.paulina_vazquez.reto11.ui.Textos;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Esta clase es la encargada de procesar todas las
 * operaciones relacionadas con las palabras dentro
 * del archivo selecciobado.
 */

public class WordManager {
    private Map<String, Integer> mapaPalabras;
    /**
     * Constructor para inicializar el mapa de palabras.
     */
    public WordManager() {
        mapaPalabras = new HashMap<>();
    }
    /**
     * Lee un archivo de texto y cuenta la cantidad de veces que aparece cada palabra.
     *
     * @param archivo Nombre del archivo de texto.
     * @throws IOException Si ocurre un error de lectura del archivo.
     */
    public void contarPalabras(String archivo) throws IOException {
        String rutaArchivo = "/edu/paulina_vazquez/reto11/resources/" + archivo;
        System.out.println("Ruta del archivo: " + rutaArchivo); // Agregar esta línea para depuración
        try (InputStream inputStream = getClass().getResourceAsStream(rutaArchivo)) {
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                reader.lines()
                        .filter(linea -> !linea.trim().isEmpty()) // Ignorar líneas vacías
                        .flatMap(Pattern.compile("\\s+")::splitAsStream)
                        .map(LineCleaner::limpiarLinea)
                        .forEach(palabra -> mapaPalabras.put(palabra, mapaPalabras.getOrDefault
                                (palabra, 0) + 1));
            } else {
                throw new FileNotFoundException("Archivo no encontrado: " + rutaArchivo);
            }
        }
    }
    /**
     * Imprime las 10 palabras más repetidas junto el
     * número de veces de su repetición.
     */
    public void imprimirPalabrasMasRepetidas(Textos textos) {
        PriorityQueue<Map.Entry<String, Integer>> heap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
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
    /**
     * Cuenta la cantidad total de vocales en una palabra.
     *
     * @param palabra Palabra para contar las vocales.
     * @return La cantidad total de vocales en la palabra.
     */
    public long contarVocales(String palabra) {
        return palabra.chars()
                .mapToObj(ch -> (char) ch)
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
    }
    /**
     * Cuenta la cantidad total de vocales en todas las palabras.
     *
     * @return La cantidad total de vocales en todas las palabras.
     */
    public long contarVocalesTotales() {
        return mapaPalabras.keySet().stream()
                .mapToLong(this::contarVocales)
                .sum();
    }
    /**
     * Obtiene una lista de palabras que comienzan con vocal.
     *
     * @return Lista de palabras que comienzan con vocal,
     * ordenadas alfabéticamente.
     */
    public List<String> obtenerPalabrasConVocalInicial() {
        return mapaPalabras.keySet().stream()
                .filter(palabra -> "aeiouAEIOU".indexOf(palabra.charAt(0)) != -1)
                .sorted()
                .toList();
    }
    /**
     * Obtiene una lista de palabras con longitud impar.
     *
     * @return Lista de palabras con longitud impar.
     */
    public List<String> obtenerPalabrasConLongitudImpar() {
        return mapaPalabras.keySet().stream()
                .filter(palabra -> palabra.length() % 2 != 0)
                .toList();
    }
    /**
     * Encuentra la palabra más larga en el archivo.
     *
     * @return Palabra más larga.
     */
    public String encontrarPalabraMasLarga() {
        return mapaPalabras.keySet().stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
    /**
     * Encuentra la palabra más corta en el archivo.
     *
     * @return Palabra más corta.
     */
    public String encontrarPalabraMasCorta() {
        return mapaPalabras.keySet().stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");
    }
    /**
     * Verifica si una palabra cumple con tener al menos 5 caracteres,
     * comenzar y terminar con una vocal.
     *
     * @param palabra Palabra a verificar.
     * @return true si la palabra cumple con los criterios, false de lo contrario.
     */
    public boolean verificarPalabraConVocalInicialFinalYLargo(String palabra) {
        return palabra.length() >= 5 && "aeiouAEIOU".indexOf(palabra.charAt(0))
                != -1 && "aeiouAEIOU".indexOf(palabra.charAt(palabra.length() - 1)) != -1;
    }
    /**
     * Verifica si existe alguna palabra que cumpla con tener al menos 5 caracteres,
     * comenzar y terminar con una vocal.
     */
    public boolean verificarExistenciaPalabraConVocalInicialFinalYLargo() {
        return mapaPalabras.keySet().stream()
                .anyMatch(this::verificarPalabraConVocalInicialFinalYLargo);
    }
}