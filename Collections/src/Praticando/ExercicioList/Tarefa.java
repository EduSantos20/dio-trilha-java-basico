package Praticando.ExercicioList;

public class Tarefa {
  //atributo
  private String descricao;

  //constructor
  public String getDescricao() {
    return descricao;
  }

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "Tarefa: " + descricao + "]";
  }
  
}
