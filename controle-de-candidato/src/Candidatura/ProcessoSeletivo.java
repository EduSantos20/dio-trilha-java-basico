package Candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String[] candidatos = { "FELIPE", "MARCIO", "PAULO", "AUGUSTO", "EDUARDO", "RICARDO", "ROSA" };
    for (String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativaRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if (continuarTentando) {
        tentativaRealizadas++;
      } else {
        System.out.println("Contato realizado com sucesso");
      }
    } while (continuarTentando && tentativaRealizadas < 3);
    if (atendeu) {
      System.out.println("Conseguimos contato com " + candidato + " na " + tentativaRealizadas + " tentativa.");
    } else {
      System.out.println("Não conseguiu contato com " + candidato + " número maximo tentativas " + tentativaRealizadas
          + " realizadas.");
    }
  }

  // método auxiliar
  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "FELIPE", "MARCIO", "PAULO", "AUGUSTO" };
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");
    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato de nª " + (indice + 1) + " é " + candidatos[indice]);
    }

    System.out.println("Forma abreviada de intereção for each");
    for (String candidato : candidatos) {
      System.out.println("O candidato selecionado é " + candidato);
    }
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para condidato com contra proposta");
    } else {
      System.out.println("Aguardando resultado dos demais candidatos");
    }
  }

  static void selecaoCandidatos() {
    System.out.println("Seleção de candidatos");
    String[] candidatos = { "FELIPE", "MARCIO", "PAULO", "AUGUSTO", "EDUARDO", "RICARDO", "ROSA" };
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();
      System.out.println("O candidato " + candidato + " Solicitou esse valor de salario " + salarioPretendido);

      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionada para a vaga");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800.0, 2500.0); // gera um valor aleatório entre 1800.0 e 2500.0
  }
}
