import java.math.BigInteger;

public class RepresentarNumero {
    public void principal() {
        BigInteger base = new BigInteger("2");
        int exponente = 1000000;

        BigInteger resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado = resultado.multiply(base);
        }
        
        System.out.println("Número" + resultado);
    }
}
