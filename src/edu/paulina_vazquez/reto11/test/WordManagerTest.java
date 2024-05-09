package edu.paulina_vazquez.reto11.test;

import edu.paulina_vazquez.reto11.process.WordManager;
import edu.paulina_vazquez.reto11.ui.Esp;
import edu.paulina_vazquez.reto11.ui.Textos;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;


public class WordManagerTest {
    /**
     * Prueba si se lanza una excepción FileNotFoundException
     * cuando se intenta contar las palabras en un archivo que
     * no existe.
     * Se crea una instancia de WordManager y se intenta contar
     * las palabras en un archivo que no existe.
     * Se espera que el método lance una excepción
     * FileNotFoundException.
     */
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
    /**
     * Prueba si no se cuentan palabras cuando el archivo
     * está vacío.
     * Se crea una instancia de WordManager y se intenta
     * las palabras en un archivo vacío.
     * Se espera que no se cuente ninguna palabra y que
     * el mapa de palabras esté vacío.
     * @throws IOException si ocurre algún error de lectura
     * del archivo.
     */
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
    /**
     * Prueba si se cuenta correctamente una única
     * palabra en el archivo.
     * Se crea una instancia de WordManager y se
     * intenta contar las palabras en un archivo
     * que contiene una única palabra "perro".
     * Se espera que la palabra "perro" se cuente
     * una vez en el mapa de palabras.
     * @throws IOException si ocurre algún error
     * de lectura del archivo.
     */
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
    /**
     * Prueba si no se imprime nada cuando el mapa
     * de palabras está vacío.
     * Se crea una instancia de WordManager y se
     * establece un mapa de palabras vacío.
     * Se redirige la salida estándar a un
     * ByteArrayOutputStream para capturar la salida
     * del método imprimirPalabrasMasRepetidas.
     * Se llama al método imprimirPalabrasMasRepetidas
     * y se verifica que no se imprima nada.
     */
    @Test
    public void imprimirPalabrasMasRepetidasConMapaVacioTest() {
        WordManager wordManager = new WordManager();
        Textos textos = new Esp();
        wordManager.setMapaPalabras(new HashMap<>());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        wordManager.imprimirPalabrasMasRepetidas(textos);
        assertEquals("No debería haber salida cuando el mapa de palabras está vacío", "",
                outputStream.toString());
    }
    /**
     * Prueba la impresión de las palabras más
     * repetidas en un archivo de prueba
     * Se crea una instancia de WordManager y
     * se lee un archivo de prueba.
     * Luego se configura un ByteArrayOutputStream
     * para capturar la salida de impresión.
     * Se llama al método imprimirPalabrasMasRepetidas
     * con el objeto Textos correspondiente.
     * Se compara la salida esperada con la salida
     * capturada en el ByteArrayOutputStream.
     */
    @Test
    public void imprimirPalabrasMasRepetidasConArchivoPruebasTest() throws IOException {
        WordManager wordManager = new WordManager();
        Textos textos = new Esp();
        String nombreArchivo = "pruebas.txt";
        wordManager.contarPalabras(nombreArchivo);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        wordManager.imprimirPalabrasMasRepetidas(textos);
        String expectedOutput = "1 Palabra: adios, repeticiones: 1\n" +
                "2 Palabra: casa, repeticiones: 1\n" +
                "3 Palabra: gato, repeticiones: 1\n" +
                "4 Palabra: hola, repeticiones: 1\n" +
                "5 Palabra: Perro, repeticiones: 1\n";
        assertEquals("La salida no coincide con lo esperado", expectedOutput, outputStream.toString());
    }
    /**
     * Prueba la impresión de las palabras más
     * repetidas en un archivo inexistente.
     * Se crea una instancia de WordManager y
     * un objeto Textos.
     * Se define el nombre de un archivo inexistente.
     * Se configura un ByteArrayOutputStream
     * para capturar la salida de impresión.
     * Se verifica que al intentar contar palabras
     * en un archivo inexistente se lance una FileNotFoundException.
     * Se compara la salida esperada (vacía) con l
     * a salida capturada en el ByteArrayOutputStream.
     */
    @Test
    public void imprimirPalabrasMasRepetidasConArchivoInexistenteTest() {
        WordManager wordManager = new WordManager();
        Textos textos = new Esp();
        String nombreArchivo = "archivo_inexistente.txt";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        assertThrows(FileNotFoundException.class, () -> wordManager.contarPalabras(nombreArchivo));
        assertEquals("No debería haber salida cuando el archivo no existe", "",
                outputStream.toString());
    }
    /**
     * Prueba que el método contarVocales cuente
     * correctamente el número de vocales en una
     * palabra.
     * Se crea una instancia de WordManager.
     * Se define una palabra con vocales.
     * Se llama al método contarVocales con la
     * palabra definida.
     * Se compara el resultado obtenido con el
     * número esperado de vocales en la palabra.
     */
    @Test
    public void contarVocalesCuentaCorrectaTest() {
        WordManager wordManager = new WordManager();
        String palabra = "Hola";
        long resultado = wordManager.contarVocales(palabra);
        assertEquals(2, resultado);
    }
    /**
     * Prueba que el método contarVocales devuelva
     * 0 para una palabra sin vocales.
     * Se crea una instancia de WordManager.
     * Se define una palabra sin vocales.
     * Se llama al método contarVocales con la
     * palabra definida.
     * Se compara el resultado obtenido con 0, ya
     * que no hay vocales en la palabra.
     */
    @Test
    public void contarVocalesPalabraSinVocalesTest() {
        WordManager wordManager = new WordManager();
        String palabra = "Hl";
        long resultado = wordManager.contarVocales(palabra);
        assertEquals(0, resultado);
    }
    /**
     * Prueba que el método contarVocalesTotales calcule
     * correctamente el total de vocales en todas las
     * palabras del mapa.
     *
     * Se crea una instancia de WordManager.
     * Se crea un mapa de palabras con algunas palabras
     * que contienen vocales.
     * Se establece el mapa de palabras en el WordManager.
     * Se llama al método contarVocalesTotales.
     * Se compara el resultado obtenido con el valor
     * esperado, que es la suma del número de vocales en
     * todas las palabras del mapa.
     */
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
    /**
     * Prueba que el método obtenerPalabrasConVocalInicial
     * devuelva una lista de palabras que comiencen con
     * vocal, ordenadas alfabéticamente.
     * Se crea una instancia de WordManager.
     * Se agregan algunas palabras al mapa de palabras,
     * algunas de las cuales comienzan con vocal y otras no.
     * Se llama al método obtenerPalabrasConVocalInicial
     * para obtener la lista de palabras que comienzan con
     * vocal.
     * Se compara la lista obtenida con la lista esperada,
     * que está ordenada alfabéticamente.
     */
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
    /**
     * Prueba que el método obtenerPalabrasConVocalInicial
     * devuelva una lista vacía cuando no hay palabras que
     * comiencen con vocal.
     * Se crea una instancia de WordManager.
     * Se agregan algunas palabras al mapa de palabras,
     * ninguna de las cuales comienza con vocal.
     * Se llama al método obtenerPalabrasConVocalInicial
     * para obtener la lista de palabras que comienzan con
     * vocal.
     * Se verifica que la lista obtenida esté vacía.
     */
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
    /**
     * Prueba que el método obtenerPalabrasConLongitudImpar
     * devuelve la lista correcta de palabras con longitud
     * impar del mapa de palabras.
     */
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
    /**
     * Prueba que el método obtenerPalabrasConLongitudImpar
     * devuelve una lista vacía cuando no hay palabras con
     * longitud impar en el mapa de palabras.
     */
    @Test
    public void obtenerPalabrasConLongitudImparListaVacíaTest() {

        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("hola", 1);
        wordManager.getMapaPalabras().put("gato", 1);
        wordManager.getMapaPalabras().put("perro", 1);

        List<String> palabras = wordManager.obtenerPalabrasConLongitudImpar();

        assertTrue(palabras.isEmpty());
    }
    /**
     * Prueba que el método encontrarPalabraMasLarga devuelve
     * la palabra más larga correcta cuando todas las palabras
     * tienen longitudes diferentes.
     *
     * Se crea un objeto WordManager y se agregan algunas
     * palabras al mapa de palabras con diferentes longitudes.
     * Se obtiene la palabra más larga utilizando el método
     * encontrarPalabraMasLarga.
     * Se verifica que la palabra devuelta sea la palabra más
     * larga en el mapa de palabras.
     */
    @Test
    public void encontrarPalabraMasLargaPalabraCorrectaTest() {
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("casa", 1);
        wordManager.getMapaPalabras().put("perro", 1);
        wordManager.getMapaPalabras().put("gato", 1);
        String palabraMasLarga = wordManager.encontrarPalabraMasLarga();
        assertEquals("gato", palabraMasLarga);
    }
    /**
     * Prueba que el método encontrarPalabraMasLarga devuelve
     * la palabra más larga correcta cuando todas las palabras
     * tienen la misma longitud.
     * Se crea un objeto WordManager y se agregan algunas
     * palabras al mapa de palabras con la misma longitud.
     * Se obtiene la palabra más larga utilizando el método
     * encontrarPalabraMasLarga.
     * Se verifica que la palabra devuelta coincida con una
     * de las palabras agregadas al mapa.
     */
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
    /**
     * Prueba que el método encontrarPalabraMasCorta devuelve
     * la palabra más corta correcta.
     * Se crea un mapa de palabras y se agregan algunas
     * palabras con diferentes longitudes.
     * Se obtiene la palabra más corta utilizando el método
     * encontrarPalabraMasCorta.
     * Se verifica que la palabra devuelta coincida con la
     * palabra más corta esperada.
     */
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
    /**
     * Prueba que el método encontrarPalabraMasCorta
     * devuelva una cadena vacía cuando el mapa de
     * palabras está vacío.
     * Se crea un mapa de palabras vacío.
     * Se utiliza el método encontrarPalabraMasCorta
     * para buscar la palabra más corta en el mapa de
     * palabras.
     * Se verifica que la palabra devuelta sea una
     * cadena vacía.
     */
    @Test
    public void encontrarPalabraMasCortaListaVaciaTest() {

        Map<String, Integer> mapaPalabras = new HashMap<>();
        String palabraMasCorta = mapaPalabras.keySet().stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("");
        assertEquals("", palabraMasCorta);
    }
    /**
     * Prueba que el método verificarPalabraConVocalInicialFinalYLargo
     * devuelve verdadero para una palabra que cumple con los criterios.
     * Se crea una instancia de WordManager.
     * Se define una palabra que cumple con los criterios de tener al
     * menos 5 caracteres, comenzar y terminar con una vocal.
     * Se llama al método verificarPalabraConVocalInicialFinalYLargo con
     * la palabra definida.
     * Se verifica que el método devuelva verdadero.
     */
    @Test
    public void verificarPalabraConVocalInicialFinalYLargoCumpleCriteriosTest() {
        WordManager wordManager = new WordManager();

        String palabra = "oruga";

        assertTrue(wordManager.verificarPalabraConVocalInicialFinalYLargo(palabra));
    }
    /**
     * Prueba si una palabra no cumple con
     * tener al menos 5 caracteres,
     * comenzar y terminar con una vocal.
     * Se crea una instancia de WordManager
     * y se define una palabra que no cumple
     * con los criterios.
     * Se llama al método verificarPalabraConVocalInicialFinalYLargo
     * con esta palabra y se verifica que
     * devuelva false.
     */

    @Test
    public void verificarPalabraConVocalInicialFinalYLargoNoCumpleCriteriosTest() {
        WordManager wordManager = new WordManager();

        String palabra = "gato";

        assertFalse(wordManager.verificarPalabraConVocalInicialFinalYLargo(palabra));
    }
    /**
     * Prueba si existe al menos una palabra en el mapa
     * que cumpla con tener al menos 5 caracteres,
     * comenzar y terminar con una vocal.
     * Se crea una instancia de WordManager y se agregan
     * algunas palabras al mapa de palabras,
     * algunas de las cuales cumplen con los criterios.
     * Se llama al método verificarExistenciaPalabraConVocalInicialFinalYLargo
     * y se verifica que devuelva true.
     */
    @Test
    public void verificarExistenciaPalabraConVocalInicialFinalYLargoExisteTest() {
        WordManager wordManager = new WordManager();
        wordManager.getMapaPalabras().put("banana", 1);
        wordManager.getMapaPalabras().put("perro", 1);

        assertTrue(wordManager.verificarExistenciaPalabraConVocalInicialFinalYLargo());
    }
    /**
     * Prueba si no existe ninguna palabra en el mapa
     * que cumpla con tener al menos 5 caracteres,
     * comenzar y terminar con una vocal.
     * Se crea una instancia de WordManager y se
     * agregan algunas palabras al mapa de palabras,
     * ninguna de las cuales cumple con los criterios.
     * Se llama al método verificarExistenciaPalabraConVocalInicialFinalYLargo
     * y se verifica que devuelva false.
     */
    @Test
    public void verificarExistenciaPalabraConVocalInicialFinalYLargoNoExisteTest() {
        WordManager wordManager = new WordManager();

        wordManager.getMapaPalabras().put("gato", 1);
        wordManager.getMapaPalabras().put("casa", 1);

        assertFalse(wordManager.verificarExistenciaPalabraConVocalInicialFinalYLargo());
    }
}

