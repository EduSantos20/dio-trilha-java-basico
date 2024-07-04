public class CondicoesTernaria {
  public static void main(String[] args) {
    int nota = 5;

    String resultado = nota >= 7 ? "Aprovado" : "Reprovado"; // ? : é a condicional ternaria
    System.out.println(resultado);  

    int nota2 = 6;
		String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);

  }
}
