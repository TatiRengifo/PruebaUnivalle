class App{
    public static void main(String[] args) {
        //Algortimos O
        Exponencial p1 = new Exponencial();
        Lineal p2 = new Lineal();
        LogartimicaLineal p3 = new LogartimicaLineal();
        p1.principal();
        p2.principal();
        p3.principal();

        //Algoritmo O(2^1_000_000)
        RepresentarNumero p4 = new RepresentarNumero();
        p4.principal();
    }
}