package Banco;

import java.util.ArrayList;
import java.util.List;

public class BancoItau {
  private String nome;
  private List<Conta> contas;

  public BancoItau() {
    this.contas = new ArrayList<>();
  }
  
  public List<Conta> getContas() {
    return contas;
  }

  public void setContas(List<Conta> contas) {
    this.contas = contas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
