package edu.paulina_vazquez.reto11.test;

import edu.paulina_vazquez.reto11.process.WordManager;
import edu.paulina_vazquez.reto11.ui.Esp;
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
    public void imprimirPalabrasMasRepetidasConMapaVacio() {
        WordManager wordManager = new WordManager();
        Textos textos = new Esp();
        String output = wordManager.imprimirPalabrasMasRepetidas(textos);
        assertEquals("No debería haber salida cuando el mapa de palabras está vacío", "", output);
    }

    @Test
    public void imprimirPalabrasMasRepetidasConPalabrasEnElMapa() {
        WordManager wordManager = new WordManager();
        Textos textos = new Esp();
        Map<String, Integer> mapaPalabras = new HashMap<>();
        mapaPalabras.put("word1", 10);
        mapaPalabras.put("word2", 20);
        mapaPalabras.put("word3", 30);
        wordManager.setMapaPalabras(mapaPalabras);
        String expectedOutput = "1 Palabra: word3, repeticiones: 30\n" +
                "2 Palabra: word2, repeticiones: 20\n" +
                "3 Palabra: word1, repeticiones: 10\n";
        String output = wordManager.imprimirPalabrasMasRepetidas(textos);
        assertEquals("La salida no coincide con lo esperado", expectedOutput, output);
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

        List<String> palabras = wordManager.obtenerPalabrasConLongitudImpar();

        assertEquals(2, palabras.size());
        assertTrue(palabras.contains("casa"));
        assertTrue(palabras.contains("gato"));
    }

    @Test
    public void obtenerPalabrasConLongitudImparListaVacíaTest() {

        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("hola", 1);
        wordManager.getMapaPalabras().put("gato", 1);
        wordManager.getMapaPalabras().put("perro", 1);

        List<String> palabras = wordManager.obtenerPalabrasConLongitudImpar();

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
    @Test
    public void encontrarPalabraMasCortaPalabraMasCortaCorrecta() {
        Map<String, Integer> mapaPalabras = new HashMap<>();
        mapaPalabras.put("casa", 1);
        mapaPalabras.put("perro", 2);
        mapaPalabras.put("adios", 3);


        String palabraMasCorta = mapaPalabras.keySet().stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("");
        assertEquals("casa", palabraMasCorta);
    }
    @Test
    public void encontrarPalabraMasCortaListaVaciaTest() {

        Map<String, Integer> mapaPalabras = new HashMap<>();
        String palabraMasCorta = mapaPalabras.keySet().stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("");
        assertEquals("", palabraMasCorta);
    }
    @Test
    public void verificarPalabraConVocalInicialFinalYLargoCumpleCriteriosTest() {
        WordManager wordManager = new WordManager();

        String palabra = "oruga";

        assertTrue(wordManager.verificarPalabraConVocalInicialFinalYLargo(palabra));
    }

    @Test
    public void verificarPalabraConVocalInicialFinalYLargoNoCumpleCriteriosTest() {
        WordManager wordManager = new WordManager();

        String palabra = "gato";

        assertFalse(wordManager.verificarPalabraConVocalInicialFinalYLargo(palabra));
    }
    @Test
    public void verificarExistenciaPalabraConVocalInicialFinalYLargoExisteTest() {
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("banana", 1);
        wordManager.getMapaPalabras().put("perro", 1);

        assertTrue(wordManager.verificarExistenciaPalabraConVocalInicialFinalYLargo());
    }

    @Test
    public void verificarExistenciaPalabraConVocalInicialFinalYLargoNoExisteTest() {
        WordManager wordManager = new WordManager();

        wordManager.getMapaPalabras().put("gato", 1);
        wordManager.getMapaPalabras().put("casa", 1);

        assertFalse(wordManager.verificarExistenciaPalabraConVocalInicialFinalYLargo());
    }
}

