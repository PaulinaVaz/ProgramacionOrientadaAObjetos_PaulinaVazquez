package edu.paulina_vazquez.reto11.process;

import edu.paulina_vazquez.reto11.ui.Textos;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class WordManager {
    private Map<String, Integer> mapaPalabras;

    public WordManager() {
        mapaPalabras = new HashMap<>();
    }

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
                        .forEach(palabra -> mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra, 0) + 1));
            } else {
                throw new FileNotFoundException("Archivo no encontrado: " + rutaArchivo);
            }
        }
    }

    public void imprimirPalabrasMasRepetidas(Textos textos) {
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

    public long contarVocales(String palabra) {
        return palabra.chars()
                .mapToObj(ch -> (char) ch)
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
    }

    public long contarVocalesTotales() {
        return mapaPalabras.keySet().stream()
                .mapToLong(this::contarVocales)
                .sum();
    }

    public List<String> obtenerPalabrasConVocalInicial() {
        return mapaPalabras.keySet().stream()
                .filter(palabra -> "aeiouAEIOU".indexOf(palabra.charAt(0)) != -1)
                .sorted()
                .toList();
    }

    public List<String> obtenerPalabrasConLongitudImpar() {
        return mapaPalabras.keySet().stream()
                .filter(palabra -> palabra.length() % 2 != 0)
                .toList();
    }

    public String encontrarPalabraMasLarga() {
        return mapaPalabras.keySet().stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public String encontrarPalabraMasCorta() {
        return mapaPalabras.keySet().stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public boolean verificarPalabraConVocalInicialFinalYLargo(String palabra) {
        return palabra.length() >= 5 && "aeiouAEIOU".indexOf(palabra.charAt(0))
                != -1 && "aeiouAEIOU".indexOf(palabra.charAt(palabra.length() - 1)) != -1;
    }

    public boolean verificarExistenciaPalabraConVocalInicialFinalYLargo() {
        return mapaPalabras.keySet().stream()
                .anyMatch(this::verificarPalabraConVocalInicialFinalYLargo);
    }
}