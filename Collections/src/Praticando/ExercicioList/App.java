package Praticando.ExercicioList;

public class App {
  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    System.out.println("O numero total de tarefas é: " + listaTarefa.numeroTotalTarefas());

    listaTarefa.adicionarTarefa("Estudar hoje a tarde1!");
    listaTarefa.adicionarTarefa("Estudar hoje a tarde1!");
    listaTarefa.adicionarTarefa("Estudar hoje a tarde2!");
    listaTarefa.removerTarefa("Estudar hoje a tarde1!");

    System.out.println("O numero total de tarefas é: " + listaTarefa.numeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
  }
}
