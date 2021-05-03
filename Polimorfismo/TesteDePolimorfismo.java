``` package testedepolimorfismo;

public class TesteDePolimorfismo {

    public static void main(String[] args) {
       EmpregadoComissionado empregado = new EmpregadoComissionado(
         "Sueli", "Silva", "222.222.222-22", 10000, 0.06 );

      EmpregadoComissionadoComBase base =
         new EmpregadoComissionadoComBase(
         "Marcio", "Melo", "333.333.333-33", 5000, 0.04, 300 );

      System.out.printf( "%s %s:\n\n%s\n\n",
         "Chamando toString em EmpregadoComissionado com referência ao",
         "objeto da superclasse", empregado.toString() );

      System.out.printf( "%s %s:\n\n%s\n\n",
         "Chamando toString em EmpregadoComissionadoComBase com referência ao",
         "objeto da subclasse",
         base.toString() );

      EmpregadoComissionado empregado2 = base;
      System.out.printf( "%s %s:\n\n%s\n",
         "Chamando toString em EmpregadoComissionadoComBase com referência",
         "na superclasse a objeto da subclasse", empregado2.toString() );
    }
    
}
 ``` 
