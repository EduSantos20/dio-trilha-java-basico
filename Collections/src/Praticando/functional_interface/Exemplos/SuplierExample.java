package Praticando.functional_interface.Exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
/*
 * Representa uma opreação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objtos de um determinado tipo.
 */
public class SuplierExample {
  public static void main(String[] args) {
    // Criando uma lista de supliers
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
    System.out.println(saudacao);

    //Usar o Suplier para obter uma lista com 5 suadações
    List<String>listaSaudaoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!").limit(5).toList();

    //imprimir as saudações geradas
    listaSaudaoes.forEach(System.out::println);
  }
}
