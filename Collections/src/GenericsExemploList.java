import java.util.ArrayList;
import java.util.List;

public class GenericsExemploList {
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static void main(String[] args) {
    // Exemplo sem Generics
    List listaSemGenerics = new ArrayList<>();
    listaSemGenerics.add("Elemento 1");
    listaSemGenerics.add(10); //permite adicionar qualquer tipo de objeto

    //Exemplo com generics
    List<String> listaComGenerics = new ArrayList<>();
    listaComGenerics.add("Elemento 1");
    listaComGenerics.add("Elemento 2");

    //Iterando sobre a lis com Generics
    for(String elemento : listaComGenerics) {
      System.out.println(elemento);
    }

    //iterando sobre a lista sem generics (necessário fazer cast)
    for(Object elemento : listaSemGenerics) {
      String str = (String) elemento ;
      System.out.println(str);
    }
  }
}
