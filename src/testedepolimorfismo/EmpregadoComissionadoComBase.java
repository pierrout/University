/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedepolimorfismo;

public class EmpregadoComissionadoComBase extends EmpregadoComissionado {
    private double salarioBase; 

   public EmpregadoComissionadoComBase( String primeiro, String ultimo,
      String cpf, double vendas, double taxa, double salario )
   {
      super( primeiro, ultimo, cpf, vendas, taxa );
      setSalarioBase( salario ); // entender melhor essa linha
   } 

   public void setSalarioBase( double salario )
   {
      salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
   } 

   public double getSalarioBase()
   {
      return salarioBase;
   } 

   @Override 
   public double ganhos()
   {
      return getSalarioBase() + super.ganhos();
   } 

   @Override 
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "salário-base",
         super.toString(), "salário base", getSalarioBase() );
   } 
}
