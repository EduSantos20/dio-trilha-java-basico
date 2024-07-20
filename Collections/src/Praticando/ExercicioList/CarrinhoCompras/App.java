package Praticando.ExercicioList.CarrinhoCompras;

public class App {
  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    //total do carrinho
    System.out.println("Total do carrinho: " + carrinhoDeCompras.numeroTotalItemCarrinho());

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItem();

    // Removendo um item do carrinho
    carrinhoDeCompras.removeItemCarrinho("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItem();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularTotalCarrinho());

  }
}
