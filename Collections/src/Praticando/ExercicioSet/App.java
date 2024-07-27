package Praticando.ExercicioSet;

public class App {
  public static void main(String[] args) throws Exception {
    ConjuntoConvidado convidado = new ConjuntoConvidado();

    System.out.println("Existem " + convidado.contarConvidado() + " convite dentro do Set de Convidados: ");

    convidado.adicionarConvidado("Eduardo", 1234);
    convidado.adicionarConvidado("Marcio", 5632);
    convidado.adicionarConvidado("Ricardo", 5632);
    convidado.adicionarConvidado("Rosangela", 3234);
    convidado.adicionarConvidado("Bernardo", 5634);

    System.out.println("--------------------Convidados-------------------------");

    convidado.exibirConvidado();
    System.out.println("Existem " + convidado.contarConvidado() + " convite dentro do Set de Convidados: ");

    System.out.println("-----------------Remove convidados e exibi novamente---------------------------");

    convidado.remverConvidadoPorCodigoConvite(3234);

    convidado.exibirConvidado();
    System.out.println("Existem " + convidado.contarConvidado() + " convite dentro do Set de Convidados: ");
  }
}
