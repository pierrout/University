package numerosmultiplos;

import javax.swing.JOptionPane;

import java.util.Random;

public class NumerosMultiplos {

    public static void main(String[] args) {
        
    Intenger nome = new Intenger();
    Random numAleatorio = new Random();
        
    String number1, number2;
    int numero1, numero2;
    int valor1, valor2;
        

     number1 = JOptionPane.showInputDialog(null, "Por favor, digite o primeiro numero: "); 
     numero1 = Integer.parseInt(number1); 
     
     number2 = JOptionPane.showInputDialog(null, "Por favor, digite o segundo numero: "); 
     numero2 = Integer.parseInt(number2);
    
     
     if (((numero1%numero2)==0) || ((numero2%numero1)==0)) {
         nome.displayMessage1();
     }
     else{
         nome.displayMessage2();
    }
     
    JOptionPane.showMessageDialog(null,"Agora veremos com números aleatórios!"); 
    
    valor1 = numAleatorio.nextInt(100); 
    valor2 = numAleatorio.nextInt(100); 
    
    System.out.printf("valor 1: %d e valor 2: %d", valor1, valor2); 
    
    String mensagem = String.format("valor de 1: %s e valor de 2: %s", valor1,valor2);
    JOptionPane.showMessageDialog(null, mensagem);
    
    if (((valor1%valor2)==0) || ((valor2%valor1)==0)) {
        
          nome.displayMessage1();
     }
     else{
          nome.displayMessage2();
    }
    
       
    }
}
