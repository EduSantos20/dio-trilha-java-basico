package Praticando.ExercicioSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
  private Set<Convidado> convidadoSet;

  public ConjuntoConvidado(){
    this.convidadoSet = new HashSet<>();
  }
  
  public void adicionarConvidado(String nome, int codigoConvite){
    Convidado convidado = new Convidado(nome, codigoConvite);
    convidadoSet.add(convidado);
  }

  public void remverConvidadoPorCodigoConvite(int codigoConvite){
    Convidado convidadoParaRemover = null;
    for(Convidado c : convidadoSet){
      if(c.getCodigoConvite() == codigoConvite){
        convidadoParaRemover = c;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidado(){
    return convidadoSet.size();
  }

  public void exibirConvidado(){
    System.out.println(convidadoSet);
  }
}
