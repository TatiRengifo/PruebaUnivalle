import java.util.ArrayList;
import java.util.List;

import Clases.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Carro carro1 = new Carro("Kia", 30,"blue",4);
        Carro carro2 = new Carro("Sportage", 40,"green",8);
        Carro carro3 = new Carro("noc", 67,"yellow",7);
        Carro carro4 = new Carro("Sportage", 58,"green",5);
        Carro carro5 = new Carro("Sportage", 67,"green",4);

        List<Carro> miLista = new ArrayList<>();
        miLista.add(carro1);
        miLista.add(carro2);
        miLista.add(carro3);
        miLista.add(carro4);
        miLista.add(carro5);
        for (int i = 0 ; i < miLista.size() ; i++){
            System.out.println();
            miLista.get(i).MostarDatos();
        }
        // System.out.println("La marca es: "+ carro1.getMarca());
        // System.out.println("La velocidad es: "+ carro1.getVelocidadMax());
        // System.out.println("El color  es: "+ carro1.getColor());
        // System.out.println("El número de ruedas es: "+ carro1.getRuedas());

//         if (carro1.getVelocidadMax() >= 35){
//             carro1.MostarDatos();
//         }
//         else{
//             System.out.println("La marca es: "+ carro1.getMarca());
            
//         }
// System.out.println();

//         if (carro2.getVelocidadMax() >= 35){
//             carro2.MostarDatos();
//         }
//         else{
//             System.out.println("La marca es: "+ carro2.getMarca());
//         } 

}
}
