package Praticando.ExercicioList.CarrinhoCompras;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> itemCarrinho;

  // criando um array vazio para receber meus item no carrinho
  public CarrinhoDeCompras() {
    this.itemCarrinho = new ArrayList<>();
  }

  // adicionado item no carrinho
  public void adicionarItem(String nome, double preco, int quantidade) {
    Item item = new Item(nome, preco, quantidade);
    this.itemCarrinho.add(item);
  }

  // removendo item do carrinho
  public void removeItemCarrinho(String nome) {
    List<Item> removendoItemCarrinho = new ArrayList<>();
    if (!itemCarrinho.isEmpty()) {
      for (Item item : itemCarrinho) {
        if (item.getNome().equalsIgnoreCase(nome)) {
          removendoItemCarrinho.add(item);
        }
      }
      itemCarrinho.removeAll(removendoItemCarrinho);
    } else {
      System.out.println("Não há itens no carrinho");
    }
  }

  // total que está no carrinho
  public int numeroTotalItemCarrinho() {
    return itemCarrinho.size();
  }

  // exibindo o item do carrinho
  public void exibirItem() {
    if(!itemCarrinho.isEmpty()){
      System.out.println(this.itemCarrinho);
    }else{
      System.out.println("Não há itens no carrinho");
    }
  }

  // calculando o item do carrinho
  public double calcularTotalCarrinho() {
    double total = 0d;
    if (!itemCarrinho.isEmpty()) {
      for (Item item : itemCarrinho) {
        double valorItem = item.getPreco() * item.getQuantidade();
        total += valorItem;
      }
      return total;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

}
