package edu.paulina_vazquez.reto9.process;

import edu.paulina_vazquez.reto9.ui.Textos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordManager {

    private Map<String, Integer> mapaPalabras;

    public WordManager() {
        mapaPalabras = new HashMap<>();
    }

    public void contarPalabras(String archivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = reader.readLine()) != null) {
            linea = LineCleaner.limpiarLinea(linea);
            String[] palabras = linea.split("\\s+");
            for (String palabra : palabras) {
                mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra, 0) + 1);
            }
        }
        reader.close();
    }

    public void imprimirPalabrasMasRepetidas(Textos textos) {
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::
                getValue));
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