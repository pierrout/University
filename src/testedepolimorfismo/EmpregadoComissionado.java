/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedepolimorfismo;

public class EmpregadoComissionado {
   private String primeiroNome;
   private String sobreNome;
   private String cod_cpf;
   private double vendasBrutas; 
   private double taxa_de_comissao; 

   public EmpregadoComissionado( String primeiro, String ultimo, String cpf,
      double vendas, double taxa )
   {
     
      primeiroNome = primeiro;
      sobreNome = ultimo;
      cod_cpf = cpf;
      setVendasBrutas( vendas ); 
      setTaxaDeComissao( taxa ); 
   } 

   public void setPrimeiroNome( String primeiro )
   {
      primeiroNome = primeiro; 
   } 

   public String getPrimeiroNome()
   {
      return primeiroNome;
   } 

   public void setSobrenome( String ultimo )
   {
      sobreNome = ultimo; 
   } 

   public String getSobrenome()
   {
      return sobreNome;
   } 

   public void setCPF( String cpf )
   {
      cod_cpf = cpf; //deve-se validar!
   } 

   public String getCPF()
   {
      return cod_cpf;
   } 

   public void setVendasBrutas( double vendas )
   {
      vendasBrutas = ( vendas < 0.0 ) ? 0.0 : vendas;// entender melhor essa linha
   } 

   public double getVendasBrutas()
   {
      return vendasBrutas;
   } 

   public void setTaxaDeComissao( double taxa )
   {
      taxa_de_comissao = ( taxa > 0.0 && taxa < 1.0 ) ? taxa : 0.0;
   } 

   public double getTaxaDeComissao()
   {
      return taxa_de_comissao;
   } 

   public double ganhos()
   {
      return getTaxaDeComissao() * getVendasBrutas();
   } 

   @Override 
   public String toString()
   {
      return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
         "empregado comissionado", getPrimeiroNome(), getSobrenome(),
         "Número do CPF", getCPF(),
         "Vendas brutas", getVendasBrutas(),
         "Taxa de Comissão", getTaxaDeComissao() );
   } 
}
