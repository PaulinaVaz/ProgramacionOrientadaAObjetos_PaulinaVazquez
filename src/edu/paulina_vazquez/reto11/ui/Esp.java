package edu.paulina_vazquez.reto11.ui;

public class Esp extends Textos{/**
 * Hereda de Textos y almacena los escritos a mostrar al usuario
 * en español.
 * @return el texto en español segun sea el caso.
 */

@Override
public String bienvenida() {
    return "Bienvenido al contador de palabras.";
}

    @Override
    public String menu() {
        return "Elija el libro deseado: ";
    }

    @Override
    public String opcion_invalida() {
        return "Opcion invalida, por favor intentelo de nuevo.";
    }

    @Override
    public String palabras_repetidas() {
        return "Las 10 palabras más comunes en el libro ";
    }

    @Override
    public String palabra() {
        return ". Palabra: ";
    }

    @Override
    public String repeticiones() {
        return ", repeticiones: ";
    }

    @Override
    public String error_lectura() {
        return "Error al leer el archivo del libro.";
    }
    @Override
    public String total_vocales() {
        return "Total de vocales en el libro: ";
    }

    @Override
    public String palabras_vocales() {
        return "Palabras que empiezan con vocal ordenadas alfabéticamente: ";
    }

    @Override
    public String longitud_impar() {
        return "Palabras con longitud impar: ";
    }

    @Override
    public String palabras_mas_larga() {
        return "Palabra más larga: ";
    }

    @Override
    public String palabras_mas_corta() {
        return "Palabra más corta: ";
    }

    @Override
    public String palabra_caso_especial() {
        return "Existe una palabra con vocal inicial, final y longitud mayor o igual a 5: ";
    }
}


