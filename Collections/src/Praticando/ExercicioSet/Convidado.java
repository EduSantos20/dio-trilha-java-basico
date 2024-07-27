package Praticando.ExercicioSet;

public class Convidado {
  private String nome;
  private int codigoConvite;

  public Convidado(String nome, int codigoConvite2) {
    this.nome = nome;
    this.codigoConvite = codigoConvite2;
  }
  @Override
  public String toString() {
    return "Convidados [nome = " + nome + ", codigoConvite = " + codigoConvite + "]";
  }
  public String getNome() {
    return nome;
  }
  public int getCodigoConvite() {
    return codigoConvite;
  }

  // verificando se o codigo de convidado é igual
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigoConvite;
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Convidado other = (Convidado) obj;
    if (codigoConvite != other.codigoConvite)
      return false;
    return true;
  }


  

  

}
