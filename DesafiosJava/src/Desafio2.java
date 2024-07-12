import java.util.Scanner;
/*
 * Descrição
Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.

Entrada
O programa solicitará ao usuário que digite o número da conta bancária.
Saída
O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) e informará que o número da conta é inválido.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
01020304	Numero de conta valido.
1234568	Erro: Numero de conta invalido. Digite exatamente 8 digitos.
3231	Erro: Numero de conta invalido. Digite exatamente 8 digitos.
 */

public class Desafio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Inicialize um bloco try-catch para capturar exceções:
    try {
      // Leia a entrada do usuário como uma string representando o número da conta:
      String numeroConta = scanner.nextLine();
      // Chamar o método que veritica se o número da conta é valido
      verificarNumeroConta(numeroConta);
      // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
      System.out.println("Numero é conta valido.");
    } catch (IllegalArgumentException e) {
      // Informar que o número de conta é inválido e exibir a mensagem de erro
      System.out.println("Erro: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }

  // Declaração do método verificarNumeroConta, que verifica se o número de conta
  // tem exatamente 8 dígitos:
  @SuppressWarnings("unused")
  private static void verificarNumeroConta(String numeroConta) {
    if (numeroConta.length() != 8) {
      throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    }
  }
}
