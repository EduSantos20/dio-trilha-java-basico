package Praticando.ExercicioList.Ordencao;

public class App {
  public static void main(String[] args) {
    OrdenacaoPessoa ordenarPessoa = new OrdenacaoPessoa();
    ordenarPessoa.adicionarPessoa("Nome 1", 20, 1.86);
    ordenarPessoa.adicionarPessoa("Nome 2", 30, 1.75);
    ordenarPessoa.adicionarPessoa("Nome 3", 5, 0.75);
    ordenarPessoa.adicionarPessoa("Nome 4", 18, 1.20);


    System.out.println(ordenarPessoa.ordenadoPorIdade());
    System.out.println(ordenarPessoa.ordenarPorAltura());
  }
}
