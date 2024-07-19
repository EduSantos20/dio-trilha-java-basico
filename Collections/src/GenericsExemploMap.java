import java.util.HashMap;
import java.util.Map;

public class GenericsExemploMap {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    @SuppressWarnings("rawtypes")

    Map mapaSemGenerics = new HashMap<>();
    mapaSemGenerics.put("Chave 1", 10);
    mapaSemGenerics.put("Chave 2", "valor"); //permite adicionar qualquer 

    //Exemplo com generics
    Map<String, Integer> mapaGenerics = new HashMap<>();
    mapaGenerics.put("Chave 1", 10);
    mapaGenerics.put("Chave 2", 20); 

    //Iterando sobre o mapa com generics
    for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
      String chave = entry.getKey();
      int valor = entry.getValue();
      System.out.println(chave + " - " + " Valor " + valor);
    }

    //Iterando sobre a mapa sem generics (necessário fazer cast)
    for (Object entry : mapaSemGenerics.entrySet()) {
      @SuppressWarnings("rawtypes")
      
      Map.Entry obj = (Map.Entry) entry;
      String chave = (String) obj.getKey();
      Object valor = obj.getValue();
      System.out.println(chave + " - " + " Valor " + valor);
    }
  }
}
