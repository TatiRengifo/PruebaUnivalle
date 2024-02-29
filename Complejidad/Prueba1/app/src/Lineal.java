import java.util.Random;;
public class Lineal {
    //Lineal 
    public static void principal() {
        long tiempoInicio = System.nanoTime();
        Random r = new Random();
        int datos[] = new int[100000000];
        for(int i = 0; i < datos.length; i++) {
            datos[i] = r.nextInt(100);
        }

        funcionLineal(datos);

        long tiempoFin = System.nanoTime();
        long tiempoTotal = tiempoFin - tiempoInicio;

        double tiempoEnMilisegundos = (double) tiempoTotal / 1_000_000.0;

        System.out.println("La función lineal tardó " + tiempoEnMilisegundos + " milisegundos en ejecutarse.");

    }

    public static void funcionLineal(int[] datos) {
        // Operación de complejidad lineal
        int suma = 0;
        for (int dato : datos) {
            suma+= dato;
            // Realiza alguna operación con el dato
        }
        System.err.println(suma);
    }
    public static void main(String[] args){
        principal();
    }
}