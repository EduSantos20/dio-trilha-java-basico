package Praticando.ExercicioList.Ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa{
  private List<Pessoa> pessoaList;
  
  public OrdenacaoPessoa(){
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura){
    Pessoa pessoa = new Pessoa(nome, idade, altura);
    pessoaList.add(pessoa);
  }

  public List<Pessoa> ordenadoPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

    return pessoasPorAltura;
  }
}