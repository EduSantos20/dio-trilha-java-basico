public class Operadores {
  public static void main(String[] args){
    //classe Operadores.java
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);

    //classe Operadores.java
    int numero = 5;
    //Imprimindo o numero negativo
    System.out.println(- numero);
    //incrementando numero em mais 1 numero, imprime 6
    numero ++;
    System.out.println(numero);
    //incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero ++);// ops algo de errado não está certo
    System.out.println(numero);// agora sim, numero virou 7
    //ordem de precedencia conta aqui
    System.out.println(++ numero);
    boolean verdadeiro = false;
    System.out.println("Inverteu " + !verdadeiro);

    // classe Operadores.java
    int a, b;

    a = 5;
    b = 6;

    /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    if(a==b)
      resultado = "verdadeiro";
    else
      resultado = "falso";
    */
    //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    //String resultado = (a==b) ? "verdadeiro" : "false";
    //System.out.println(valor);

    //classe Operadores.java
    int numero1 = 1;
    int numero2 = 2;

    if(numero1 > numero2)
      System.out.print("Numero 1 maior que numero 2");
    if(numero1 < numero2)
      System.out.print("Numero 1 menor que numero 2");
    if(numero1 >= numero2)
      System.out.print("Numero 1 maior ou igual que numero 2");
    if(numero1 <= numero2)
      System.out.print("Numero 1 menor ou igual que numero 2");
    if(numero1 != numero2)
      System.out.print("Numero 1 é diferente de numero 2");

      String nomeUm = "Eduardo";
      String nomeDois = new String("Eduardo");

      System.out.println(nomeUm.equals(nomeDois));

      // Operadores.java
      boolean condicao1=true;

      boolean condicao2=false;

      /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
      expressões. 
      É como se estivesse escrito:
      "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
      */

      if(condicao1 && condicao2)
        System.out.print("Os dois valores precisam ser verdadeiros");;

      //Se condicao1 OU condicao2 for verdadeira, executar código.
      if(condicao1 || condicao2)
        System.out.print("Um dos valores precisa ser verdadeiro");
  }
}
