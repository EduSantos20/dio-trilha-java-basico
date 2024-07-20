package Praticando.ExercicioList.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> livroList;

  public CatalogoLivros (){
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int ano){
    livroList.add(new Livro(titulo, autor, ano));
  }

  public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!livroList.isEmpty()){
      for(Livro livro : livroList){
        if(livro.getAutor().equalsIgnoreCase(autor)){
          livrosPorAutor.add(livro);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervalosAnos(int anaInicial, int anoFinal){
    List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
    if (!livrosPorIntervalosAnos.isEmpty()) {
      for (Livro livro : livroList) {
       if (livro.getAno() >= anaInicial && livro.getAno() <= anoFinal){
        livrosPorIntervalosAnos.add(livro);
       }
      }
    } 
    return livrosPorIntervalosAnos;
  }

  public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if(!livroList.isEmpty()){
      for(Livro l: livroList){
        if(l.getTitulo().equalsIgnoreCase(titulo)){
          livroPorTitulo = l;
          break;
        }
      }
    }
    return livroPorTitulo;
  }
}
