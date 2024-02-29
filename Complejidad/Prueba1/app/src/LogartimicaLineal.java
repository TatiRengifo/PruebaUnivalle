import java.util.Arrays;

public class LogartimicaLineal {
    // Logaritmica Lineal
    public void principal() {
        long tiempoInicio = System.nanoTime();

        int[] datos = {5, 2, 9, 3, 6, 1, 8, 4, 7,5, 2, 9, 3, 6, 1, 8, 4, 7,5, 2, 9, 3, 6, 1, 8, 4, 7};
        ordenarDatos(datos);

        long tiempoFin = System.nanoTime();
        long tiempoTotal = tiempoFin - tiempoInicio;

        double tiempoEnMilisegundos = (double) tiempoTotal / 1_000_000.0;

        System.out.println("La función con complejidad logarítmica lineal tardó " + tiempoEnMilisegundos + " milisegundos en ejecutarse.");
    }

    public static void ordenarDatos(int[] datos) {
        // Operación de ordenación con complejidad logarítmica lineal
        Arrays.sort(datos); // Utilizando el algoritmo de ordenación rápido (QuickSort)
    }
}
