// Serie Fibonacci 

// public class App {
//     public static void main(String[] args){
//         App app = new App();
//         for (int i = 0; i<10;i++){
//             System.out.println(app.Fibonnaci(i));
//         }
//     }
//     public int Fibonnaci(int numero){
//     if (numero == 0){
//         return 0;
//     }
//     else if (numero == 1){
//         return 1;
//     }
//     else {
//         return Fibonnaci(numero-1)+ Fibonnaci(numero-2);
//     }

//     }
// }


//Número factorial 
// public class App {
//     public static void main(String[] args){
//         App app = new App();
//         // for (int i = 0; i<10;i++){
//         //    
//         // }
//          System.out.println(app.Factorial(5));
//     }
//     public int Factorial(int numero){
//         System.out.println(numero);
//     if (numero == 1){
//         return 1;
//     }
//     else {
//         return Factorial(numero-1)* numero;
//     }

//     }
// }


//Número binario
// public class App {
//     public static void main(String[] args){
//         App app = new App();
//         // for (int i = 0; i<10;i++){
//         //    
//         // }
//          System.out.println(app.Binario(5));
//     }
//     public String Binario(int numero){
//         System.out.println(numero);
//     if (numero == 1){
//         return "1";
//     }
//     else {
//         return Binario(numero / 2) + (numero % 2);
//     }

//     }
// }

// //Recursividad 
// public class App {
//     public static void main(String[] args){
//         App app = new App();
//         // for (int i = 0; i<10;i++){
//         //    
//         // }
//          System.out.println(app.Recursividad(5));
//     } 
//     public int Recursividad(int numero){
//         System.out.println(numero);
//     if (numero == 1){
//         return 1;
//     }
//     else if  (numero % 2 != 0){
//         numero = (numero * 3) + 1;
//         return Recursividad(numero);
//     }
//     else {
//         numero =(numero / 2);
//         return Recursividad(numero);
//     }

//     }
// }


//Recursividad 
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args){
        App app = new App();
        // List<Integer> lista = new ArrayList<>();
        // List<Integer> lista2 = new ArrayList<>(); 

        // for (int i = 0; i<10;i++){
        //    
        // }
        System.out.println(app.SepararLista([1,2,3,4,5,6,7,8,9,10,11,12,13,14],8));
    } 
    public int SepararLista(List<Integer> lista, int numero){
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>(); 
        System.out.println(numero);
    for (int i = 1; i < lista.size(); i++){
        if (lista.get(i) < numero){
            return lista1.add(i);

        }
        else if (lista.get(i) > numero){
            return lista2.add(i);
        }
        
    }

    
}
}