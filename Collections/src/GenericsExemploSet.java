import java.util.HashSet;
import java.util.Set;

public class GenericsExemploSet {
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void main(String[] args) {
    Set conjuntoSemGenerics = new HashSet<>();
    conjuntoSemGenerics.add("A");
    conjuntoSemGenerics.add(10); // permite adicionar qualquer tipo de objeto

    //Exemplo com generics
    Set<String> conjuntoComGenerics = new HashSet<>();
    conjuntoComGenerics.add("A");
    conjuntoComGenerics.add("B");

    //Iterando sobre o conjunto com generics
    for (String item : conjuntoComGenerics) {
      System.out.println(item);
    }

    //Iterando com o conjunto sem generics (necessário fazer os cast)
    for(Object elemento : conjuntoSemGenerics) {
      String elementoString = (String) elemento;
      System.out.println(elementoString);
    }
  }
}
