public class Carro {
  private String chassi;
  public String getChassi() {
    return chassi;
  }
  public void setChassi(String chassi) {
    this.chassi = chassi;
  }

  public void ligar(){
    // encabsulamento de codigo
    confereCombustivel(); 
    System.out.println("Carro ligado");
  }
  private void confereCombustivel(){
    System.out.println("Carro com combustivel");
  }
  
}
