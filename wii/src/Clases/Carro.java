package Clases;
public class Carro {
    private String marca;
    private int velocidadMax;
    private String color;
    private int ruedas;
    public Carro(){
        
    }
    public Carro (String marca, int velocidadMax, String color, int ruedas) {
    this.marca = marca;
    this.velocidadMax = velocidadMax;
    this.color = color;
    this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public void MostarDatos(){
        System.out.println("El color es: " + this.getColor());
        System.out.println("La marca es: " + this.getMarca());
        System.out.println("La velocidad es: " + this.getVelocidadMax());
        System.out.println("Las ruedas son: " + this.getRuedas());
    }
    
}


