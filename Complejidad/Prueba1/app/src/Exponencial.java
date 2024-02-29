public class Exponencial {
    // Exponencial
    public static void principal() {
        long tiempoInicio = System.nanoTime();

        int n = 31; // Tamaño de entrada, ajusta esto según tus necesidades
        int resultado = calcularExponencial(n);
        System.err.println(resultado);

        long tiempoFin = System.nanoTime();
        long tiempoTotal = tiempoFin - tiempoInicio;

        double tiempoEnMilisegundos = (double) tiempoTotal / 1_000_000.0;

        System.out.println("La función con complejidad exponencial tardó " + tiempoEnMilisegundos + " milisegundos en ejecutarse.");
    }

    public static int calcularExponencial(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcularExponencial(n - 1) + calcularExponencial(n - 1);
    }

    public static void main(String[] args) {
        principal();
    }
}
