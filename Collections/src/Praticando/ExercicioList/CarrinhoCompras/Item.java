package Praticando.ExercicioList.CarrinhoCompras;

public class Item {
  
  
  private String nome;
  private Double preco;
  private int quantidade;

  public Double getPreco() {
    return preco;
  }
  
  public String getNome() {
    return nome;
  }
  
  public int getQuantidade() {
    return quantidade;
  }


  public Item(String nome, Double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "Item [nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + "]";
  }
  
}
