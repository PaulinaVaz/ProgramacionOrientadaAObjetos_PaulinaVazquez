package edu.paulina_vazquez.reto11.test;

import edu.paulina_vazquez.reto11.process.WordManager;
import edu.paulina_vazquez.reto11.ui.Textos;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class WordManagerTest {
    @Test
    public void contarPalabrasArchivoNoEncontradoTest() {
        WordManager wordManager = new WordManager();
        try {
            wordManager.contarPalabras("nonexistent.txt");
            assert false : "Expected FileNotFoundException was not thrown";
        } catch (Exception e) {
            assert e instanceof java.io.FileNotFoundException : "Expected FileNotFoundException";
        }
    }

    @Test
    public void contarPalabrasSinContarTest() {

        WordManager wordManager = new WordManager();
        try {
            wordManager.contarPalabras("pruebas.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue("Expected no words counted", wordManager.getMapaPalabras().isEmpty());
    }

    @Test
    public void contarPalabrasUnicaTest() {

        WordManager wordManager = new WordManager();
        try {
            wordManager.contarPalabras("pruebas.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> mapaPalabras = wordManager.getMapaPalabras();
        assertEquals("Expected one word counted", 1, mapaPalabras.get("perro").intValue());
    }

    @Test
    public void imprimirPalabrasMasRepetidasOrdenCorrectoTest() {
        WordManager wordManager = new WordManager();
        Map<String, Integer> mapaPalabras = wordManager.getMapaPalabras();
        mapaPalabras.put("word1", 10);
        mapaPalabras.put("word2", 20);
        mapaPalabras.put("word3", 30);
        Textos textos = new Textos("Español");
        String printedOutput = imprimirPalabrasMasRepetidas(wordManager, textos);
        assertEquals("Incorrect output",
                "1Palabra: word330\n2Palabra: word220\n3Palabra: word110", printedOutput);
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

        for (int i = 0; i < top10.size(); i++) {
            Map.Entry<String, Integer> entry = top10.get(i);
            output.append((i + 1)).append(textos.palabra()).append(entry.getKey()).append(textos.repeticiones())
                    .append(entry.getValue()).append("\n");
        }
        return output.toString();
    }

    @Test
    public void contarVocalesCuentaCorrectaTest() {
        WordManager wordManager = new WordManager();
        String palabra = "Hola";
        long resultado = wordManager.contarVocales(palabra);
        assertEquals(2, resultado);
    }

    @Test
    public void contarVocalesPalabraSinVocalesTest() {
        WordManager wordManager = new WordManager();
        String palabra = "Hl";
        long resultado = wordManager.contarVocales(palabra);
        assertEquals(0, resultado);
    }

    @Test
    public void contarVocalesTotalesCuentaCorrectaTest() {
        WordManager wordManager = new WordManager();
        Map<String, Integer> mapaPalabras = new HashMap<>();
        mapaPalabras.put("Hola", 1);
        mapaPalabras.put("Adiós", 1);
        mapaPalabras.put("Perro", 1);
        mapaPalabras.put("Gato", 1);
        wordManager.setMapaPalabras(mapaPalabras);
        long resultado = wordManager.contarVocalesTotales();
        assertEquals(10, resultado);
    }


    @Test
    public void obtenerPalabrasConVocalInicialOrdenCorrectoTest() {
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("Gato", 1);
        wordManager.getMapaPalabras().put("Perro", 1);
        wordManager.getMapaPalabras().put("Casa", 1);
        wordManager.getMapaPalabras().put("Hola", 1);
        List<String> resultado = wordManager.obtenerPalabrasConVocalInicial();
        List<String> esperado = Arrays.asList("Gato", "Perro", "Casa", "Hola");
        assertEquals(esperado, resultado);
    }

    @Test
    public void obtenerPalabrasConVocalInicialListaVaciaTest() {
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("Banana", 1);
        wordManager.getMapaPalabras().put("Manzana", 1);
        wordManager.getMapaPalabras().put("Perro", 1);
        wordManager.getMapaPalabras().put("Gato", 1);
        List<String> resultado = wordManager.obtenerPalabrasConVocalInicial();
        assertEquals(0, resultado.size());
    }
    @Test
    public void obtenerPalabrasConLongitudImparListaCorrectaTest() {
        // Arrange
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("casa", 1);
        wordManager.getMapaPalabras().put("perro", 1);
        wordManager.getMapaPalabras().put("gato", 1);
        wordManager.getMapaPalabras().put("libro", 1);

        // Act
        List<String> palabras = wordManager.obtenerPalabrasConLongitudImpar();

        // Assert
        assertEquals(2, palabras.size());
        assertTrue(palabras.contains("casa"));
        assertTrue(palabras.contains("gato"));
    }

    @Test
    public void obtenerPalabrasConLongitudImparListaVacíaTest() {
        // Arrange
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("hola", 1);
        wordManager.getMapaPalabras().put("gato", 1);
        wordManager.getMapaPalabras().put("perro", 1);

        // Act
        List<String> palabras = wordManager.obtenerPalabrasConLongitudImpar();

        // Assert
        assertTrue(palabras.isEmpty());
    }
    @Test
    public void encontrarPalabraMasLargaPalabraCorrectaTest() {
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("casa", 1);
        wordManager.getMapaPalabras().put("perro", 1);
        wordManager.getMapaPalabras().put("gato", 1);
        String palabraMasLarga = wordManager.encontrarPalabraMasLarga();
        assertEquals("gato", palabraMasLarga);
    }

    @Test
    public void encontrarPalabraMasLargaPalabrasIgualesTest() {
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("manzana", 1);
        wordManager.getMapaPalabras().put("naranja", 1);
        wordManager.getMapaPalabras().put("platano", 1);
        wordManager.getMapaPalabras().put("pera", 1);
        String palabraMasLarga = wordManager.encontrarPalabraMasLarga();
        assertEquals("naranja", palabraMasLarga);
    }
}

