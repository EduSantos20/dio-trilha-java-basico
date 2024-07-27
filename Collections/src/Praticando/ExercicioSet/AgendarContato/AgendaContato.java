package Praticando.ExercicioSet.AgendarContato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
  //atribute 
  private Set<Contato> contatoSet;

  public AgendaContato(){
    this.contatoSet = new HashSet<>();
  }

  //adicionando contato
  public void adicionarContato(String nome, int numero){
    Contato contato = new Contato(nome, numero);
    contatoSet.add(contato);
  }

  //exibindo contado
  public void exibirContato(){
    System.out.println(contatoSet);
  }

  //pesquisando por nome
  public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatoPorNome = new HashSet<>();
    for(Contato contato : contatoSet){
      if(contato.getNome().startsWith(nome)){
        contatoPorNome.add(contato);
      }
    }
    return contatoPorNome;
  }

  //atualizando contato
  public Contato atualizarNumeroContato(String nome, int novoNumero){
    Contato contatoAtualizado = null;

    for(Contato c : contatoSet){
      if(c.getNome().equalsIgnoreCase(nome)){
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }
}
