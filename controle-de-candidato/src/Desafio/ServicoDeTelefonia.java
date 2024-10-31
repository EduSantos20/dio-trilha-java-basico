package Desafio;

import java.util.Scanner;
import java.util.Arrays;
public class ServicoDeTelefonia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada do serviço a ser verificado
    String servico = scanner.nextLine().trim();

    // Entrada do nome do cliente e os serviços contratados
    String entradaCliente = scanner.nextLine().trim();

    // Separando o nome do cliente e os serviços contratados
    String[] partes = entradaCliente.split(",");
    String nomeCliente = partes[0];
    boolean contratado = false;

    //Verifique se o serviço está na lista de serviços contratados
    contratado = Arrays.stream(partes).anyMatch(servico::equals);
    System.out.println(nomeCliente);
    System.out.println(contratado ? "Sim" : "Nao");


    scanner.close();
  }
}
