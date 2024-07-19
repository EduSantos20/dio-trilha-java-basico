package POO;

public class musical {

  public void tocar(){
    selecionarAlbum("Roberto carlos");
    selecionarMusica("Pra nunca mais te esquecer");
    selecionarArtista("Roberto Carlos");

    System.out.println("Iniciando musica");
  };
  public void pausar(){
    System.out.println("Pausando musica");
  };
  private void selecionarMusica(String musica){
    System.out.println("Selecionando musica: "+ musica);
  }

  private void selecionarArtista(String artista){
    System.out.println("Selecionando Artista: "+ artista);
  }

  private void selecionarAlbum(String album){
    System.out.println("Selecionando album: " + album);
  }
}
