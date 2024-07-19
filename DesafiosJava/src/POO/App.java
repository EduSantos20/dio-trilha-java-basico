package POO;

public class App {
  public static void main(String[] args) {
    musical musica = new musical();
    musica.tocar();
    musica.pausar();

    internet net = new internet();
    net.exibirPagina("https://www.youtube.com/watch?v=9ou608QQRq8");

    telefone telefone = new telefone();
    telefone.ligar("35 992131330");
    telefone.atender();
  }
}

