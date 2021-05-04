
package funcionario;

import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Gerente eg = new Gerente ();
        Vendedor ven = new Vendedor ();
        
       eg.setSalarioBase(200);
       System.out.println("salario gerente  "+eg.getSalarioBase());
       
       eg.setSalarioBase(400);
       System.out.println("salario vendedor "+eg.getSalarioBase());
    }
    
}
