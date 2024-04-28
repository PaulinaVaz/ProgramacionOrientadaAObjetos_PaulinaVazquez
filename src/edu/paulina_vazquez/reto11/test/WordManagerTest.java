package edu.paulina_vazquez.reto11.test;

import edu.paulina_vazquez.reto11.process.WordManager;
import edu.paulina_vazquez.reto11.ui.Textos;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WordManagerTest {
    @Test
    public void contarPalabras_FileNotFound_ExceptionThrown() {
        WordManager wordManager = new WordManager();
        try {
            wordManager.contarPalabras("nonexistent.txt");
            assert false : "Expected FileNotFoundException was not thrown";
        } catch (Exception e) {
            assert e instanceof java.io.FileNotFoundException : "Expected FileNotFoundException";
        }
    }

    @Test
    public void contarPalabras_EmptyInputStream_NoWordsCounted() {
        WordManager wordManager = new WordManager();
        try {
            InputStream inputStream = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));
            wordManager.contarPalabras(inputStream);
            assert wordManager.getMapaPalabras().isEmpty() : "Expected no words counted";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void contarPalabras_SingleWordInInputStream_WordCountedOnce() {
        WordManager wordManager = new WordManager();
        try {
            InputStream inputStream = new ByteArrayInputStream("caperucita".getBytes(StandardCharsets.UTF_8));
            wordManager.contarPalabras(inputStream);
            Map<String, Integer> mapaPalabras = wordManager.getMapaPalabras();
            assert mapaPalabras.size() == 1 : "Expected one word counted";
            assert mapaPalabras.containsKey("caperucita") : "Expected 'caperucita' counted";
            assert mapaPalabras.get("caperucita") == 1 : "Expected 'caperucita' counted once";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void imprimirPalabrasMasRepetidas_HeapFilled_WordsPrintedInCorrectOrder() {
        WordManager wordManager = new WordManager();
        Map<String, Integer> mapaPalabras = wordManager.getMapaPalabras();
        mapaPalabras.put("word1", 10);
        mapaPalabras.put("word2", 20);
        mapaPalabras.put("word3", 30);
        Textos textos = new Textos("Español");
        String printedOutput = imprimirPalabrasMasRepetidas(wordManager, textos);
        assert printedOutput.equals("1Palabra: word330\n2Palabra: word220\n3Palabra: word110") : "Incorrect output";
    }

    // Método auxiliar para simular la salida impresa en la consola
    private String imprimirPalabrasMasRepetidas(WordManager wordManager, Textos textos) {
        StringBuilder output = new StringBuilder();
        PriorityQueue<Map.Entry<String, Integer>> heap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<String, Integer> entry : wordManager.getMapaPalabras().entrySet()) {
            heap.offer(entry);
            if (heap.size() > 10) {
                heap.poll();
            }
        }

        List<Map.Entry<String, Integer>> top10 = new ArrayList<>();
        while (!heap.isEmpty()) {
            top10.add(heap.poll());
        }

        for (int i = top10.size() - 1; i >= 0; i--) {
            Map.Entry<String, Integer> entry = top10.get(i);
            output.append((i + 1)).append(textos.palabra()).append(entry.getKey()).append(textos.repeticiones())
                    .append(entry.getValue()).append("\n");
        }
        return output.toString();
    }
}
