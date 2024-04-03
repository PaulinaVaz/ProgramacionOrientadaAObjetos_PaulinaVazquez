package edu.paulina_vazquez.evidencia2.data;

import edu.paulina_vazquez.evidencia2.process.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeneradorArticulos {
    public static final Random random = new Random();
    public static final Scanner scanner = new Scanner(System.in);

    public static final List<String> peliculas = new ArrayList<>();
    public static final List<String> canciones = new ArrayList<>();
    public static final List<String> generos = new ArrayList<>();

    static {
        peliculas.add("Harry Potter");
        peliculas.add("Star Wars");
        peliculas.add("Terminator");
        peliculas.add("Back to the future");
        peliculas.add("Barbie");

        canciones.add("Believer");
        canciones.add("I want it that way");
        canciones.add("I wanna be your slave");
        canciones.add("New rules");
        canciones.add("Bad romance");

        generos.add("novela");
        generos.add("tecnologia");
    }
    private static List<Articulos> generateRandomConsumption() {
        List<Articulos> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // Assuming 10 random consumptions
            int choice = random.nextInt(4); // Randomly choose a product type
            boolean isNewRelease = random.nextBoolean(); // Randomly decide if it's a new release
            switch (choice) {
                case 0:
                    products.add(new Cancion(isNewRelease));
                    break;
                case 1:
                    products.add(new Videojuego());
                    break;
                case 2:
                    // Randomly select a movie and genre
                    products.add(new Pelicula(isNewRelease));
                    break;
                case 3:
                    // Randomly select a book and genre
                    products.add(new Libro(genres.get(random.nextInt(genres.size())), isNewRelease));
                    break;
            }
        }
        return articulos;
    }
}
