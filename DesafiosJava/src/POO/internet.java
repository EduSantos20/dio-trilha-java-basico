package POO;

public class internet {

  public void exibirPagina(String url){
    adicionarPagina();
    atualizarPagina();
    System.out.println("Acessando a página: " + url);
  };

  private void adicionarPagina(){
    System.out.println("Adicionando página");
  };

  private  void atualizarPagina(){
    System.out.println("Atualizando página");
  };
}
