package Praticando.ExercicioList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  //atriputo
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa tarefa : tarefaList){
      if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
        tarefasParaRemover.add(tarefa);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int numeroTotalTarefas(){
    return tarefaList.size();
  }

  public void obterDescricoesTarefas(){
    System.out.println(tarefaList);
  }
}