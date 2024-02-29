import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JOptionPane.showMessageDialog(null,"Pa la casita","Eventos",JOptionPane.WARNING_MESSAGE);
        byte age = 127;
        System.out.println(age);
        // float = 2**32, doble = 2**64
        float altura = 1.75f;
        boolean casita = true;
        char inicial = 'J';
        String nombre = "Tatiana"; 
        //OPERADORES LÓGICOS: || = or, && = and, ! = not, == = equal, != = not equal
        if (casita == true){
            System.out.println("Vamos a la casita");
        } else {
            System.out.println("No vamos a la casita");
        }
    }
}
       
    


 