
public class App{

    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo");
        
        App ejemplo = new App();
        int resultado1 = ejemplo.Suma(5,10);
        int resultado2 = ejemplo.Resta(6,5);
        int resultado3 = ejemplo.Multiplicacion(7,5);
        int resultado4 = ejemplo.Division(8,8);
        System.out.println(resultado1+" "+resultado2+" "+resultado3+" "+resultado4);
        // System.out.println(resultado2);
        // System.out.println(resultado3);
        // System.out.println(resultado4);

    }
    public int Suma(int a, int b) {
        int suma;
        suma = a+b;
        return suma;
    }
    public int Resta(int a, int b) {
        int resta;
        resta = a-b;
        return resta;
    }
     public int Multiplicacion(int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }
     public int Division(int a, int b) {
        int division;
        division = a / b;
        return division;
    }


}
